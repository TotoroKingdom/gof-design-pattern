package com.totoro.behavioral.templatemethod;

/**
 * @author:totoro
 * @createDate:2022/8/19
 * @description:
 */
public class ColdDiagnosis extends AbstractDiagnosis{
    @Override
    public void prescribe() {
        System.out.println("3 >> 鉴定完毕，你这不是感冒，想摆烂");
    }

    @Override
    public void medicine() {
        System.out.println("4 >> 开点维c");
    }
}
