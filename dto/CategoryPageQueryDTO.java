package com.fdzc.FX.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * @author 尘雨痕
 */
@Data
public class CategoryPageQueryDTO implements Serializable {

    //页码

    private int page;

    //每页记录数

    private int pageSize;

    //分类名称

    private String name;

    //分类类型

    private Integer type;

}
