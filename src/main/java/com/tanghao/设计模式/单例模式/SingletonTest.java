package com.tanghao.设计模式.单例模式;

import java.io.*;
import java.lang.reflect.Constructor;

/**
 * @ClassName SingletonTest
 * @auther tangh
 * @date 2019/2/25 0025 11:56
 */
public class SingletonTest {

    public static void main(String[] args) throws Exception {

        Singleton_lazy instance = Singleton_lazy.getInstance();
        System.out.println(instance);

        //反射对单例模式的破坏
        Class<?> aClass = Class.forName("com.tanghao.设计模式.单例模式.Singleton_lazy");
        //getDeclaredConstructor返回所有修饰副包含的构造 getConstructor返回public的构造
        Constructor<?> constructor = aClass.getDeclaredConstructor();
        constructor.setAccessible(true);
        Object o = constructor.newInstance();
        System.out.println(o);

        //序列化对单例模式的破坏
        //这个和几种单例模式之间比较并没有直接关系 只要实现serializable接口的readResolve就可以避免
        Singleton_static staticInstance = Singleton_static.getInstance();
        System.out.println(staticInstance);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("breakSingle.txt"));
        objectOutputStream.writeObject(staticInstance);
        objectOutputStream.close();

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("breakSingle.txt"));
        Object serializedObj = objectInputStream.readObject();
        System.out.println(serializedObj);

    }
}
