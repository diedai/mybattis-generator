package com.wz.bpm.mapper;

import com.wz.bpm.bean.EmployeeWork;

public interface EmployeeWorkMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(EmployeeWork record);

    int insertSelective(EmployeeWork record);

    EmployeeWork selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(EmployeeWork record);

    int updateByPrimaryKey(EmployeeWork record);
}