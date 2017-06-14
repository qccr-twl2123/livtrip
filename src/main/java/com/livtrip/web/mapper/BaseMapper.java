package com.livtrip.web.mapper;

/**
 * Created by xierongli on 17/6/12.
 */
import java.io.Serializable;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface BaseMapper<T, C, ID extends Serializable> {
    long countByCriteria(C var1);

    int deleteByCriteria(C var1);

    int deleteByPrimaryKey(ID var1);

    int insert(T var1);

    int insertSelective(T var1);

    List<T> selectByCriteriaWithRowbounds(C var1, RowBounds var2);

    List<T> selectByCriteria(C var1);

    T selectByPrimaryKey(ID var1);

    int updateByCriteriaSelective(@Param("record") T var1, @Param("example") C var2);

    int updateByCriteria(@Param("record") T var1, @Param("example") C var2);

    int updateByPrimaryKeySelective(T var1);

    int updateByPrimaryKey(T var1);
}
