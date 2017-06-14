package com.livtrip.web.util;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.lang.reflect.Field;

import com.itextpdf.text.pdf.AcroFields;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfStamper;

public class PdfUtils {
	
	public static void fillPdfTemplate(String templatePath, String descPdfPath, Object data) throws Exception{
		PdfReader reader = null;
		FileOutputStream out = null;
		ByteArrayOutputStream bos = null;
		PdfStamper stamper;
		try {
			out = new FileOutputStream(descPdfPath);//输出流
			reader = new PdfReader(templatePath);//读取pdf模板
			bos = new ByteArrayOutputStream();
			stamper = new PdfStamper(reader, bos);
			AcroFields form = stamper.getAcroFields();
			
			Class cls = data.getClass();

			java.util.Iterator<String> it = form.getFields().keySet().iterator();
		    while(it.hasNext()){
		    	String name = it.next().toString();
				System.out.println(name);
				for(Field field:cls.getDeclaredFields()) {
					String fieldName = field.getName();
					if(name.equals(fieldName)){
						field.setAccessible(true);
				    	form.setField(name, (String)field.get(data));
					}
				}					
		    }
		    stamper.setFormFlattening(true);//如果为false那么生成的PDF文件还能编辑，一定要设为true
		    stamper.close();
		    
		    out.write(bos.toByteArray());
		    
		    
//		    Document doc = new Document();
//		    PdfCopy copy = new PdfCopy(doc, out);
//		    doc.open();
//		    PdfImportedPage importPage = copy.getImportedPage(
//		    		new PdfReader(bos.toByteArray()), 1);
//		    copy.addPage(importPage);
//		    doc.close();		
		
		
		}catch(Exception e) {
			throw e;
		}finally{
			out.close();
			bos.close();
			reader.close();
		}
		
	}
	
//	public static String generateImagesFromPdf(String pdfPath, int[] pages) throws Exception{
//		File file = new File(pdfPath);
//		String imagePath = "";
//		try {
//			PDDocument doc = PDDocument.load(file);
//			PDFRenderer renderer = new PDFRenderer(doc);
//			for(int i=0;i<pages.length;i++){
//				BufferedImage image = renderer.renderImageWithDPI(0, 300, ImageType.RGB);
//				
////				BufferedImage image = renderer.renderImageWithDPI(i, 296);
//				imagePath = pdfPath.replace(".pdf", "_" + i +".jpg");
//				ImageIOUtil.writeImage(image, imagePath, 300);
//				
////				ImageIO.write(image, "PNG", new File(imagePath));
//			}
//
//		} catch (IOException e) {
//			throw e;
//		}	
//		
//		return imagePath;
//	}
}
