package com.tanghao.设计模式.单例模式;

/**
 * @ClassName Singleton_lazy_sync
 * @auther tangh
 * @date 2019/2/22 0022 10:27
 */
public class Singleton_lazy_sync {

    //解决上面第三种实现方式的线程不安全问题，做个线程同步就可以了，于是就对getInstance()方法进行了线程同步。
    //缺点：效率太低了，每个线程在想获得类的实例时候，执行getInstance()方法都要进行同步。而其实这个方法只执行一次实例化代码就够了，后面的想获得该
    // 类实例，直接return就行了。方法进行同步效率太低要改进。

    private static Singleton_lazy_sync INSTANCE;

    private Singleton_lazy_sync(){}

    public static synchronized Singleton_lazy_sync getInstance(){
        if(INSTANCE == null){
            INSTANCE = new Singleton_lazy_sync();
        }
        return INSTANCE;
    }
}
