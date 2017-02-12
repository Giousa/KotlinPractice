package com.giousa.kotlinpractice.ct01

/**
 *
 * Description: Hello World 入门程序
 * Author:zhangmengmeng
 * Date:2017/2/12
 * Time:下午2:46
 *
 * 构造方法: 前面加上data,就相当于javabean中的toString方法
 *          这样一来,输出的日志,就会直接转化为String
 *
 */
fun main(args : Array<out String>){
    println("hello world")
    println(Main(0,"giousa"))
}

data class Main(val id: Int,val name: String)
