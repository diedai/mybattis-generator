package com.wz.bpm.mapper;

import com.wz.bpm.bean.EmployeeContract;

public interface EmployeeContractMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(EmployeeContract record);

    int insertSelective(EmployeeContract record);

    EmployeeContract selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(EmployeeContract record);

    int updateByPrimaryKey(EmployeeContract record);
}