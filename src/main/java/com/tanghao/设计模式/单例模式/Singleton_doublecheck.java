package com.tanghao.设计模式.单例模式;

/**
 * @ClassName Singleton_doublecheck
 * @auther tangh
 * @date 2019/2/22 0022 11:02
 */
public class Singleton_doublecheck {

    //Double-Check概念对于多线程开发者来说不会陌生，如代码中所示，我们进行了两次if (singleton == null)检查，这样就可以保证线程安全了。
    // 这样，实例化代码只用执行一次，后面再次访问时，判断if (singleton == null)，直接return实例化对象。
    //优点：线程安全；延迟加载；效率较高。

    private static volatile Singleton_doublecheck INSTANCE;

    private Singleton_doublecheck() {
        if(INSTANCE != null){
            throw new RuntimeException("无法通过反射破坏单例");
        }
    }

    public static Singleton_doublecheck getInstance(){
        if(INSTANCE == null){
            synchronized (Singleton_doublecheck.class){
                INSTANCE = new Singleton_doublecheck();
            }
        }
        return INSTANCE;
    }

}
