package com.totoro.behavioral.templatemethod;

/**
 * @author:totoro
 * @createDate:2022/8/19
 * @description:
 */
public abstract class AbstractDiagnosis {

    public void test(){
        System.out.println("今天头好晕，不想起床，开摆，请个假");
        System.out.println("去医院看病");
        System.out.println("1 >> 挂号");
        System.out.println("2 >> 等待叫号");


    }

    public abstract void prescribe();

    public abstract void medicine();
}
