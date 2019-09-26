package com.wz.bpm.mapper;

import com.wz.bpm.bean.MenuOper;

public interface MenuOperMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MenuOper record);

    int insertSelective(MenuOper record);

    MenuOper selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MenuOper record);

    int updateByPrimaryKey(MenuOper record);
}