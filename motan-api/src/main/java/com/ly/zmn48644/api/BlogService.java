package com.ly.zmn48644.api;

import com.ly.zmn48644.api.model.Blog;
import com.weibo.api.motan.transport.async.MotanAsync;

/**
 * 作者：张明楠（wechat:zhangmingnan1990）
 * 时间：2018/6/16
 */
@MotanAsync
public interface BlogService {
    Blog findBlogById(Integer id);

    int totalCount();
}
