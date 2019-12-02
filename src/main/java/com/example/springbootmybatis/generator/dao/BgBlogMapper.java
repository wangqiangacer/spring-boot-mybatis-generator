package com.example.springbootmybatis.generator.dao;

import com.example.springbootmybatis.generator.entity.BgBlog;
import java.util.List;

public interface BgBlogMapper {
    int deleteByPrimaryKey(Integer blogId);

    int insert(BgBlog record);

    BgBlog selectByPrimaryKey(Integer blogId);

    List<BgBlog> selectAll();

    int updateByPrimaryKey(BgBlog record);
}