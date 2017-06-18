package com.livtrip.web.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.livtrip.web.domain.Product;
import com.livtrip.web.domain.ProductCriteria;
import com.livtrip.web.dto.HotelProductDTO;
import com.livtrip.web.enums.StartLevelTypeEnum;
import com.livtrip.web.mapper.ProductMapper;
import com.livtrip.web.query.HotelProductQuery;
import com.livtrip.web.service.ProductService;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by xierongli on 17/6/18.
 */
@Service("productService")
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductMapper productMapper;

    @Override
    public Integer insertAndGetId(Product product) {
        productMapper.insert(product);
        return product.getId();
    }

    @Override
    public PageInfo<Product> pageQueryProduct(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize,true);
        List<Product> productList = productMapper.selectByCriteria(null);
        for(Product product : productList){
            product.setThumb(product.getThumb().replace("100x100", "200x200"));
        }
        return new PageInfo<Product>(productList);
    }

    @Override
    public PageInfo<HotelProductDTO> pageQueryHotelProduct(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize,true);
        List<HotelProductDTO> HotelProductDTOs = productMapper.queryHotelProduct();
        for(HotelProductDTO product : HotelProductDTOs){
            product.setThumb(product.getThumb().replace("100x100", "200x200"));
        }
        return new PageInfo<HotelProductDTO>(HotelProductDTOs);
    }

    @Override
    public String getProductStarLevel(String starLevel) {
        if(StringUtils.isEmpty(starLevel)){ return "";}
        StringBuilder sb  = new StringBuilder();
        if(starLevel.contains(".")){
            Integer num = Integer.parseInt(starLevel.split("\\.")[0]);
            for(int i=0;i<num; i++){
                sb.append(StartLevelTypeEnum.FULL_STAR.getValue());
            }
            sb.append(StartLevelTypeEnum.HALF_STAR.getValue());
        }else{
            Integer num = Integer.parseInt(starLevel);
            for(int i=0;i<num; i++){
                sb.append(StartLevelTypeEnum.FULL_STAR.getValue());
            }
        }
        return sb.toString();
    }

    @Override
    public HotelProductDTO getHotelProductById(Integer productId) {
        if(productId != null){
            HotelProductDTO hotelProduct = productMapper.getHotelProductById(productId);
            if(StringUtils.isNoneBlank(hotelProduct.getThumb())){
                hotelProduct.setThumb(hotelProduct.getThumb().replace("100x100", "200x200"));
            }
            return hotelProduct;
        }
        return null;
    }

    @Override
    public PageInfo<HotelProductDTO> pageQueryHotelProduct(Integer pageNum, Integer pageSize, List<Integer> hotelIds) {
        PageHelper.startPage(pageNum,pageSize,true);
        List<HotelProductDTO> HotelProductDTOs = productMapper.queryProductByHotelIds(hotelIds);
        for(HotelProductDTO product : HotelProductDTOs){
            product.setThumb(product.getThumb().replace("100x100", "200x200"));
        }
        return new PageInfo<HotelProductDTO>(HotelProductDTOs);
    }

    @Override
    public PageInfo<HotelProductDTO> pageQueryHotelProductForAdmin(Integer pageNum, Integer pageSize, HotelProductQuery hotelProductReq) {
        PageHelper.startPage(pageNum,pageSize,true);
        List<HotelProductDTO> HotelProductDTOs = productMapper.queryHotelProductByReq(hotelProductReq);
        for(HotelProductDTO product : HotelProductDTOs){
            product.setThumb(product.getThumb().replace("100x100", "200x200"));
        }
        return new PageInfo<HotelProductDTO>(HotelProductDTOs);
    }

    @Override
    public void deleteProduct(String productId) {
        productMapper.deleteByPrimaryKey(Integer.parseInt(productId));
    }

    @Override
    public Product queryByHotelId(Integer hotelId) {
        ProductCriteria productCriteria = new ProductCriteria();
        productCriteria.createCriteria().andHotelIdEqualTo(hotelId);
        List<Product> products = productMapper.selectByCriteria(productCriteria);
        if(CollectionUtils.isNotEmpty(products)){return products.get(0);}
        return null;
    }
}
