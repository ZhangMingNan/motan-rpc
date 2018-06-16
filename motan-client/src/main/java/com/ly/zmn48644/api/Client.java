package com.ly.zmn48644.api;

import com.ly.zmn48644.api.model.Blog;
import com.weibo.api.motan.rpc.ResponseFuture;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 作者：张明楠
 * 时间：2018/6/16
 */
public class Client {
    public static void main(String[] args) throws InterruptedException {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:motan_client.xml");
        BlogServiceAsync service = (BlogServiceAsync) ctx.getBean("blogService");
        Blog blog = service.findBlogById(1);
        System.out.println(blog);

        ResponseFuture responseFuture = service.totalCountAsync();
        System.out.println(responseFuture.getValue());
        System.out.println("--");

    }
}
