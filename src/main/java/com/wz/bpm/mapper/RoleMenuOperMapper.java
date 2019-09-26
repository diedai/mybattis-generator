package com.wz.bpm.mapper;

import com.wz.bpm.bean.RoleMenuOper;

public interface RoleMenuOperMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RoleMenuOper record);

    int insertSelective(RoleMenuOper record);

    RoleMenuOper selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RoleMenuOper record);

    int updateByPrimaryKey(RoleMenuOper record);
}