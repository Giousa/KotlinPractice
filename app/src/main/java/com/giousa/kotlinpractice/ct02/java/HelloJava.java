package com.giousa.kotlinpractice.ct02.java;

import com.giousa.kotlinpractice.ct02.kotlin.HelloKotlin;

/**
 * Description:
 * Author:zhangmengmeng
 * Date:2017/2/12
 * Time:下午3:00
 */

public class HelloJava {

    public static void main(String[] args) {
        HelloKotlin giousa = new HelloKotlin(1, "giousa");
        System.out.println("giousa="+giousa);
        System.out.println("id="+giousa.getId());
        System.out.println("name="+giousa.getName());

        HelloKotlin giousa2 = new HelloKotlin(2, null);
        System.out.println("giousa2="+giousa2);

        HelloKotlin giousa3 = new HelloKotlin(3, "");
        System.out.println("giousa3="+giousa3 );

    }
}
