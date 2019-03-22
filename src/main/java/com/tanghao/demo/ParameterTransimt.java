package com.tanghao.demo;

// java 参数传递
// 都是值传递 但是有区别 基本数据类型是复制一份值后继续传递 引用数据类型是复制地址值后继续传递
// 程序27行 只是局部变量的的引用地址 与上一个 断开了 但上一个对象继续存在的
class Value{
    public int i=15;
}
public class ParameterTransimt {
    public static void main(String argv[]){
        ParameterTransimt t=new ParameterTransimt( );
        t.first( );
    }
 
public void first( ){
    int i=5;
    Value v=new Value( );
    v.i=25;
    second(v,i);
    System.out.println(v.i);
}
 
public void second(Value v,int i){
    i = 0;
    v.i = 20;
    Value val = new Value( );
    v = val;
    System.out.println(v.i+" "+i);
   }
}