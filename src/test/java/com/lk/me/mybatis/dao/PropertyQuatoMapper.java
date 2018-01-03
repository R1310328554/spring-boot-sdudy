package me.mybatis.dao;

import me.mybatis.domain.PropertyQuato;

public interface PropertyQuatoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PropertyQuato record);

    int insertSelective(PropertyQuato record);

    PropertyQuato selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PropertyQuato record);

    int updateByPrimaryKey(PropertyQuato record);
}