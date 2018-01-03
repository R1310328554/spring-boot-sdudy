package me.mybatis.dao;

import me.mybatis.domain.VarBorrowRepay;

public interface VarBorrowRepayMapper {
    int deleteByPrimaryKey(Long id);

    int insert(VarBorrowRepay record);

    int insertSelective(VarBorrowRepay record);

    VarBorrowRepay selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(VarBorrowRepay record);

    int updateByPrimaryKey(VarBorrowRepay record);
}