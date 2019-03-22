package com.tanghao.demo;

/**
 * @Author tangh
 * @Date 2019-03-15 10:03
 */
public class AutoBoxing_UnBoxing {

    public static void main(String[] args) {
//        byte a = 4;
//        int b = 4;
//        Integer c = 4;
//        Integer d = new Integer(4);
//        System.out.println(a == b && b == c );
//
//        boolean equals = "1".equals(1);
//
//        System.out.println("11");
//
//        byte b1=1,b2=2,b3,b6;
//        final byte b4=4,b5=6;
//        b6=b4+b5;
//        b3=(b1+b2);

        int i = 0;
        Integer j = new Integer(0);
        System.out.println(i==j);
        System.out.println(j.equals(i));
    }
}
