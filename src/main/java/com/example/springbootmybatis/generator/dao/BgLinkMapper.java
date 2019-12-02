package com.example.springbootmybatis.generator.dao;

import com.example.springbootmybatis.generator.entity.BgLink;
import java.util.List;

public interface BgLinkMapper {
    int deleteByPrimaryKey(Integer linkId);

    int insert(BgLink record);

    BgLink selectByPrimaryKey(Integer linkId);

    List<BgLink> selectAll();

    int updateByPrimaryKey(BgLink record);
}