package com.tanghao.设计模式.单例模式;

/**
 * @ClassName Singleton_static_block
 * @auther tangh
 * @date 2019/2/21 0021 10:28
 */
public class Singleton_static_block {

    //这种方式和上面的方式其实类似，只不过将类实例化的过程放在了静态代码块中，也是在类装载的时候，就执行静态代码块中的代码，初始化类的实例。优缺点和上面是一样的。

    private static final Singleton_static_block INSTANCE;

    static {
        INSTANCE = new Singleton_static_block();
    }

    private Singleton_static_block(){}

    public Singleton_static_block getInstance(){
        return INSTANCE;
    }

}
