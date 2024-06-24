package com.fdzc.FX.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * C端用户登录
 * @author 尘雨痕
 */
@Data
public class UserLoginDTO implements Serializable {

    private String code;

}
