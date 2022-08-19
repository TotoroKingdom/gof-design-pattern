package com.totoro.behavioral.mediator;

/**
 * @author:totoro
 * @createDate:2022/8/19
 * @description:
 */
public class User {

    String name;

    String tel;

    public User(String name, String tel){
        this.name = name;
        this.tel = tel;
    }

    public User find(String address, Mediator mediator){
        return mediator.find(address);
    }


    @Override
    public String toString() {
        return name + "（电话：" +tel+")";
    }
}
