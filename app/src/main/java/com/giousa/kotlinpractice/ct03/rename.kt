package com.giousa.kotlinpractice.ct03

/**
 *
 * Description: 可以去除out
 * Author:zhangmengmeng
 * Date:2017/2/12
 * Time:下午3:20
 *
 * map:扩展方法
 * it:迭代器
 * 测试时,需要在上面运行的三角按钮下的Edit下,加入几个参数
 *
 */

fun main(args: Array<String>){
    args.map {
        println(it)
    }

    println("-----------")

    //函数引用,前面加两个::
    args.map(::println)
}
