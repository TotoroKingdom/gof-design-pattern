package com.totoro.behavioral.observer;

import java.util.HashSet;
import java.util.Set;

/**
 * @author:totoro
 * @createDate:2022/8/22
 * @description:
 */
public class Subject {
    private final Set<Observer> observerSet = new HashSet<>();

    public void observe(Observer observer){
        observerSet.add(observer);
    }

    public void modify(){
        observerSet.forEach(Observer::update);
    }

}
