package com.totoro.behavioral.mediator;

/**
 * @author:totoro
 * @createDate:2022/8/19
 * @description:
 */
public class Test {
    public static void main(String[] args) {

        User user1 = new User("胡歌","10086");
        User user2 = new User("胡先生","10001");
        Mediator mediator = new Mediator();

        mediator.register("广州房子",user1);

        User user = user2.find("佛山房子", mediator);
        if ( null == user){
            System.out.println("找不到房子");
        }
        user = user2.find("广州房子", mediator);
        System.out.println(user);


    }
}
