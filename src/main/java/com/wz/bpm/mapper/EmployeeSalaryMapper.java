package com.wz.bpm.mapper;

import com.wz.bpm.bean.EmployeeSalary;

public interface EmployeeSalaryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(EmployeeSalary record);

    int insertSelective(EmployeeSalary record);

    EmployeeSalary selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(EmployeeSalary record);

    int updateByPrimaryKey(EmployeeSalary record);
}