package com.giousa.kotlinpractice.ct02.kotlin

/**
 *
 * Description: 将elloJava中的代码copy到kotlin代码中,会自动转换
 * Author:zhangmengmeng
 * Date:2017/2/12
 * Time:下午3:06
 *
 */

fun main(args: Array<out String>){
    val giousa = HelloKotlin(1, "giousa")
    println("giousa=" + giousa)
    println("id=" + giousa.id)
    println("name=" + giousa.name!!)
}