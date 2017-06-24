/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.livtrip.web.webservice.handler;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.xml.namespace.QName;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPHeader;
import javax.xml.soap.SOAPHeaderElement;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;
import java.util.Set;
import java.util.TreeSet;

public class HotelSOAPHandler implements SOAPHandler<SOAPMessageContext> {

	private final static Logger logger = LoggerFactory.getLogger(this.getClass());
	public static final String NAMESPACE_ECB = "";
	public static final String NAMESPACE_ECB_STRING = "";

	public Set<QName> getHeaders() {
		return new TreeSet();
	}

	public boolean handleMessage(SOAPMessageContext context) {
		SOAPMessageContext smc = (SOAPMessageContext) context;
		javax.xml.soap.SOAPMessage msg = smc.getMessage();

		try {
			SOAPEnvelope envelope = msg.getSOAPPart().getEnvelope();

			envelope.setPrefix("soapenv");
			SOAPHeader header = envelope.getHeader();
			if (header == null) {
				header = envelope.addHeader();
			}

			// envelope.setAttributeNS("","aut","http://schemas.tourico.com/webservices/authentication");
			envelope.addNamespaceDeclaration("aut", "http://schemas.tourico.com/webservices/authentication");
			envelope.addNamespaceDeclaration("hot", "http://tourico.com/webservices/hotelv3");
			SOAPHeaderElement headerElem = header.addHeaderElement(envelope.createName("AuthenticationHeader", "",
					"http://schemas.tourico.com/webservices/authentication"));
			SOAPElement elem = headerElem.addChildElement(
					envelope.createName("LoginName", "aut", "http://schemas.tourico.com/webservices/authentication"));
			elem.addTextNode(HotelPropertyConfigurer.GETHOTELFLOWUSERNAME);


			elem = headerElem.addChildElement(
					envelope.createName("Password", "aut", "http://schemas.tourico.com/webservices/authentication"));
			elem.addTextNode(HotelPropertyConfigurer.GETHOTELFLOWPWD);

			logger.info("tourico account[{}] password[{}]",HotelPropertyConfigurer.GETHOTELFLOWUSERNAME,HotelPropertyConfigurer.GETHOTELFLOWPWD);
			String version = "7";
			elem = headerElem.addChildElement(
					envelope.createName("version", "aut", "http://schemas.tourico.com/webservices/authentication"));

			elem.addTextNode(version);

			msg.getSOAPHeader().setPrefix("soapenv");
			msg.getSOAPBody().setPrefix("soapenv");

			msg.saveChanges();
			// msg.writeTo(System.out);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return true;
	}

	public boolean handleFault(SOAPMessageContext context) {
		return true;
		//throw new UnsupportedOperationException("Not supported yet.");
	}

	public void close(MessageContext context) {
		//throw new UnsupportedOperationException("Not supported yet.");
	}
}
