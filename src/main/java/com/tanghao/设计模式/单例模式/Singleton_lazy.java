package com.tanghao.设计模式.单例模式;

/**
 * @ClassName Singleton_lazy
 * @auther tangh
 * @date 2019/2/22 0022 10:19
 */
public class Singleton_lazy {

    //这种写法起到了Lazy Loading的效果，但是只能在单线程下使用。如果在多线程下，一个线程进入了if (singleton == null)判断语
    // 句块，还未来得及往下执行，另一个线程也通过了这个判断语句，这时便会产生多个实例。所以在多线程环境下不可使用这种方式。

    private static Singleton_lazy INSTANCE;

    private Singleton_lazy(){}

    public static Singleton_lazy getInstance(){
        if(INSTANCE == null){
            INSTANCE = new Singleton_lazy();
        }
        return INSTANCE;
    }

}
