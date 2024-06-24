package com.fdzc.FX.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * @author 尘雨痕
 */
@Data
public class OrdersCancelDTO implements Serializable {

    private Long id;
    //订单取消原因
    private String cancelReason;

}
