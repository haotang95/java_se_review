package com.tanghao.设计模式.单例模式;

/**
 * @ClassName Singleton_lazy_sync_block
 * @auther tangh
 * @date 2019/2/22 0022 10:55
 */
public class Singleton_lazy_sync_block {

    //由于第四种实现方式同步效率太低，所以摒弃同步方法，改为同步产生实例化的的代码块。但是这种同步并不能起到线程同步的作用。跟第3种实现方式
    // 遇到的情形一致，假如一个线程进入了if (singleton == null)判断语句块，还未来得及往下执行，另一个线程也通过了这个判断语句，这时便会产生多个实例。

    private static Singleton_lazy_sync_block INSTANCE;

    private Singleton_lazy_sync_block(){}

    public static Singleton_lazy_sync_block getInstance(){
        if(INSTANCE == null){
            synchronized (Singleton_lazy_sync_block.class){
                INSTANCE = new Singleton_lazy_sync_block();
            }
        }
        return INSTANCE;
    }
}
