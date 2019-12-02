package com.example.springbootmybatis.generator.dao;

import com.example.springbootmybatis.generator.entity.BgVisitLog;
import java.util.List;

public interface BgVisitLogMapper {
    int deleteByPrimaryKey(Integer visitId);

    int insert(BgVisitLog record);

    BgVisitLog selectByPrimaryKey(Integer visitId);

    List<BgVisitLog> selectAll();

    int updateByPrimaryKey(BgVisitLog record);
}