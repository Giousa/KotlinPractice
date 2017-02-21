package com.giousa.kotlinpractice.ct04;

/**
 * Description:
 * Author:zhangmengmeng
 * Date:2017/2/21
 * Time:下午8:56
 *
 * a_b_c_d_e_f_g_h_i_j
 *
 * a b c d e f g h i j
 */

public class ConsoleParamsJava {

    public static void main(String[] args) {
        for (String arg : args) {
            String[] splits = arg.split("_");
            for (String split : splits) {
                System.out.print(split+" ");
            }
        }
    }
}
