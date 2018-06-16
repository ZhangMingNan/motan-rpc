package com.ly.zmn48644.impl;


import com.ly.zmn48644.api.BlogService;
import com.ly.zmn48644.api.model.Blog;

/**
 * 作者：张明楠（wechat:zhangmingnan1990）
 * 时间：2018/6/16
 */
public class BlogServiceImpl implements BlogService {
    @Override
    public Blog findBlogById(Integer id) {
        return new Blog(1, "motan框架入门", "简单高效的rpc框架");
    }
}
