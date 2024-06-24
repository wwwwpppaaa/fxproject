package com.fdzc.FX.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * @author 尘雨痕
 */
@Data
public class DishPageQueryDTO implements Serializable {

    private int page;

    private int pageSize;

    private String name;

    //分类id
    private Integer categoryId;

    //设置状态值：0表示禁用 1表示启用
    private Integer status;

}
