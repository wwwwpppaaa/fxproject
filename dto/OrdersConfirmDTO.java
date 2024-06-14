package com.fdzc.FX.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * @author 尘雨痕
 */
@Data
public class OrdersConfirmDTO implements Serializable {

    private Long id;
    //订单状态
    private Integer status;

}
