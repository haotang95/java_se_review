package com.tanghao.demo;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.Predicate;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName ApacheTest
 * @Author tangh
 * @Date 2019-03-20 11:20
 */
public class ApacheTest {

    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("1");
        list.add("");
        boolean exists = CollectionUtils.exists(list, new Predicate() {
            public boolean evaluate(Object o) {
                String str = (String) o;
                if ("" == str) {
                    return true;
                }
                return false;
            }
        });
        System.out.println(exists);
        final String a = "";

    }
}
