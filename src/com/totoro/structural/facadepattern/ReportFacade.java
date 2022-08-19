package com.totoro.structural.facadepattern;

/**
 * @author:totoro
 * @createDate:2022/8/19
 * @description:
 */
public class ReportFacade {

    public void generateReport(){
        OrderSys orderSys = new OrderSys();
        PaymentSys paymentSys = new PaymentSys(orderSys);
        DeliverySys deliverySys = new DeliverySys();

        final String orderNum = orderSys.getOrderNum();

        System.out.println(orderNum + paymentSys.getOrderAccount(orderNum).toPlainString() +
                deliverySys.getDeliveryTime());
    }
}
