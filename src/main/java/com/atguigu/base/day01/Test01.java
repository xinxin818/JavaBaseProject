package com.atguigu.base.day01;

import java.util.ArrayList;
import java.util.List;

/**
 * @Classname Test01
 * @Description TODO
 * @Date 2021/9/9 16:29
 * @Created by 欣欣
 */
public class Test01 {

    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();
//        List<String> list1 = new ArrayList<String>();
        String str = "";
        list.add(1,"001");
        list.add(2,"002");
        list.add(3,"003");

        if (list!=null && list.isEmpty()){

            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).equals("002")){
                    str = list.get(i);
                    continue;
                }
            }
            System.out.println(str);
        }

    }
}
