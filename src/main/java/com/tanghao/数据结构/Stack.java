package com.tanghao.数据结构;

/**
 * @ClassName Stack
 * @auther tangh
 * @date 2019/2/11 0011 14:22
 */
public class Stack<T>{

    Node<T> stackTop;

    Node<T> statckBottom;

    public Stack() {
    }
}

class Leaf {
    private int i = 0;
    Leaf increment() {
        i++;
        return this;
    }
    void print() {
        System.out.println("i = " + i);
    }
    public static void main(String[] args) {
        Leaf x = new Leaf();
        x.increment().increment().increment().print();
    }
} ///:~