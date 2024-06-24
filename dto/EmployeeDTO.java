package com.fdzc.FX.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * @author 尘雨痕
 */
@Data
public class EmployeeDTO implements Serializable {

    private Long id;

    private String username;

    private String name;

    private String phone;

    private String sex;

    private String idNumber;

}
