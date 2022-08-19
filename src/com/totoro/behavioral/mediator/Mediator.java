package com.totoro.behavioral.mediator;

import java.util.HashMap;
import java.util.Map;

/**
 * @author:totoro
 * @createDate:2022/8/19
 * @description:
 */
public class Mediator {

    private final Map<String, User> userMap = new HashMap<>();

    public void register(String address, User user){
        userMap.put(address,user);
    }

    public User find(String address){
        return userMap.get(address);
    }
}
