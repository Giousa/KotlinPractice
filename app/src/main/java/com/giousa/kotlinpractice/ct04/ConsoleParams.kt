package com.giousa.kotlinpractice.ct04

/**
 *
 * Description:
 * Author:zhangmengmeng
 * Date:2017/2/21
 * Time:下午8:54
 *
 * a_b_c_d_e_f_g_h_i_j
 *
 * a b c d e f g h i j
 *
 */

fun main(vararg args: String){
    args.flatMap {
        it.split("_")
    }.map {
        print("$it ")
    }
}