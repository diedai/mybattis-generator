package com.wz.bpm.mapper;

import com.wz.bpm.bean.Industry;

public interface IndustryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Industry record);

    int insertSelective(Industry record);

    Industry selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Industry record);

    int updateByPrimaryKey(Industry record);
}