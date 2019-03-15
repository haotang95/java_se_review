package com.tanghao.设计模式.单例模式;

/**
 * @ClassName Singleton
 * @auther tangh
 * @date 2019/2/25 0025 10:49
 */
public enum Singleton {

    INSTANCE;

    //借助JDK1.5中添加的枚举来实现单例模式。不仅能避免多线程同步问题，而且还能防止反序列化重新创建新的对象。可能是因为枚举在JDK1.5中才添加，
    // 所以在实际项目开发中，很少见人这么写过。

    //枚举这个一个特殊的类 他天生解决的单例存有的两个问题 1.高并发 2.反序列化
    //1.当用到这个枚举时 jvm会去使用ClassLoader 的loalclass方法 此方法可以解决高并发
    //2.序列化在枚举中的应用和普通的java类不一样不是通过反射 枚举类是使用自有的方法valueof
    // 禁用类serializable的 readObject writerObject等方法

    public void getIntance(){

    }

}
