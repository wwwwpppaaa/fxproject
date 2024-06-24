package com.fdzc.FX.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * @author 尘雨痕
 */
@Data
public class EmployeePageQueryDTO implements Serializable {

    //员工姓名
    private String name;

    //页码
    private int page;

    //每页显示记录数
    private int pageSize;

}
