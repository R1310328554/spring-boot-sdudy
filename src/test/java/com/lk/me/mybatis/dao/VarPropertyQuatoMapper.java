package me.mybatis.dao;

import me.mybatis.domain.VarPropertyQuato;

public interface VarPropertyQuatoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(VarPropertyQuato record);

    int insertSelective(VarPropertyQuato record);

    VarPropertyQuato selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(VarPropertyQuato record);

    int updateByPrimaryKey(VarPropertyQuato record);
}