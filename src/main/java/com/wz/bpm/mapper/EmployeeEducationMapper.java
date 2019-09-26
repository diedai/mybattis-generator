package com.wz.bpm.mapper;

import com.wz.bpm.bean.EmployeeEducation;

public interface EmployeeEducationMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(EmployeeEducation record);

    int insertSelective(EmployeeEducation record);

    EmployeeEducation selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(EmployeeEducation record);

    int updateByPrimaryKey(EmployeeEducation record);
}