package com.giousa.kotlinpractice.ct02.java

import com.giousa.kotlinpractice.ct02.kotlin.HelloKotlin

/**
 * Description:
 * Author:zhangmengmeng
 * Date:2017/2/12
 * Time:下午3:00
 */

object HelloJava2 {

    @JvmStatic fun main(args: Array<String>) {
        val giousa = HelloKotlin(1, "giousa")
        println("giousa=" + giousa)
        println("id=" + giousa.id)
        println("name=" + giousa.name!!)

        val giousa2 = HelloKotlin(2, null)
        println("giousa2=" + giousa2)

        val giousa3 = HelloKotlin(3, "")
        println("giousa3=" + giousa3)

    }
}
