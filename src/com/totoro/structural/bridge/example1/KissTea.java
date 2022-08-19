package com.totoro.structural.bridge.example1;

/**
 * @author:totoro
 * @createDate:2022/8/19
 * @description:
 */
public class KissTea extends RefinedAbstractTea{
    protected KissTea(Size size) {
        super(size);
    }

    @Override
    public String getType() {
        return "啵啵芋圆奶茶";
    }


}
