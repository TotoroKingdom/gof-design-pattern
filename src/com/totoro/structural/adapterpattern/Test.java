package com.totoro.structural.adapterpattern;

/**
 * @author:totoro
 * @createDate:2022/8/19
 * @description:
 */
public class Test   {

    public static void main(String[] args) {
        PhoneAdapter adapter = new PhoneAdapter();
        test(adapter);
        PhoneSupplier supplier = new PhoneSupplier();
        ObjectAdapter objectAdapter = new ObjectAdapter(supplier);
        test(objectAdapter);

    }

    public static void test(Target target){
        System.out.println(target.supply());
    }
}
