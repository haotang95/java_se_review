package com.tanghao.设计模式.单例模式;

import java.io.Serializable;

/**
 * @auther tangh
 * @date 2019/2/21 0021 10:17
 */
public class Singleton_static implements Serializable {

    //优点：这种写法比较简单，就是在类装载的时候就完成实例化。避免了线程同步问题。

    //缺点：在类装载的时候就完成实例化，没有达到Lazy Loading的效果。如果从始至终从未使用过这个实例，则会造成内存的浪费。

    private final static Singleton_static INSTANCE = new Singleton_static();

    private Singleton_static(){}

    public static Singleton_static getInstance(){
        return INSTANCE;
    }

    private Object readResolve(){
        return INSTANCE;
    }

}