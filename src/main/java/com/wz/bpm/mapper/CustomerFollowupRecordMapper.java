package com.wz.bpm.mapper;

import com.wz.bpm.bean.CustomerFollowupRecord;

public interface CustomerFollowupRecordMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CustomerFollowupRecord record);

    int insertSelective(CustomerFollowupRecord record);

    CustomerFollowupRecord selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CustomerFollowupRecord record);

    int updateByPrimaryKey(CustomerFollowupRecord record);
}