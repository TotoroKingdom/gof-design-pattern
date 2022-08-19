package com.totoro.structural.facadepattern;

import java.math.BigDecimal;

/**
 * @author:totoro
 * @createDate:2022/8/19
 * @description:
 */
public class PaymentSys {
    private OrderSys orderSys;

    public PaymentSys(OrderSys orderSys){
        this.orderSys = orderSys;
    }

    public BigDecimal getOrderAccount(String orderNum){
        System.out.println("订单支付金额："+orderNum);
        return BigDecimal.valueOf(500);
    }
}
