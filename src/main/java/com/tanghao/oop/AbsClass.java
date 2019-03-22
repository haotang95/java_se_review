package com.tanghao.oop;

/**
 * @ClassName AbsClass
 * @Author tangh
 * @Date 2019-03-22 10:39
 */
abstract class Abs{
    public int field1;
    protected int field3;
    int field4;
    private String field2;
    //抽象类 不可以用private修饰抽象方法
//    public abstract void method1();
    private void test1(){

    }
}

public abstract class  AbsClass {

//    private abstract void method1();
//    protected abstract void method1();
//    abstract void method1();
    public abstract void method1();
}

interface Interf{
//    public int field1;
//    protected int field3;
    public static final int field4 = 1;
//    private String field2;

//    private void method1();
//    protected void method1();
    public abstract void method1();

}
