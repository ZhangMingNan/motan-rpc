package com.ly.zmn48644.api.model;

import lombok.Data;
import lombok.Getter;

import java.io.Serializable;

/**
 * 作者：张明楠（wechat:zhangmingnan1990）
 * 时间：2018/6/16
 */

@Data
public class Blog implements Serializable {
    private Integer id;
    private String title;
    private String content;

    public Blog() {
    }

    public Blog(Integer id, String title, String content) {
        this.id = id;
        this.title = title;
        this.content = content;
    }


}
