package com.giousa.kotlinpractice.ct05

/**
 *
 * Description:
 * Author:zhangmengmeng
 * Date:2017/2/21
 * Time:下午9:10
 *
 */

enum class Lang(val hello: String){
    ENGLISH("hello!"),
    CHINESE("你好!"),
    JAPANESE("日语"),
    KOREAN("kor");

    fun sayHello(){
        println(hello)
    }

    //方法体,处理构造方法中的事情
    init {

    }

    //伴生对象,定义静态
    companion object{
        fun parse(name: String):Lang{
            return valueOf(name.toUpperCase())
        }
    }
}

fun main(args: Array<String>){
    if(args.size == 0)return

    val lang = Lang.parse(args[0])

    println(lang)

    lang.sayHello()

    lang.sayBye()
}

/**
 * 扩展方法
 */
fun Lang.sayBye(){
    println("say bye")

    //when比switch高级,支持表达式更加灵活
    val bye = when(this){

        Lang.ENGLISH -> "hello english"
        Lang.CHINESE -> "再见 chinese"
        Lang.JAPANESE -> "hello JAPANESE"
        Lang.KOREAN -> "hello KOREAN"
    }

    println(bye)
}