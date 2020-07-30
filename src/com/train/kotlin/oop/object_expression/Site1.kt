package com.train.kotlin.oop.object_expression

object Site1 {
    var url:String = ""
    val name: String = "test"
}

/**
 * 两个对象会输出同一个URL地址的
 * 因为此方式获取的是一个单例
 */
fun main() {
    val s1 =  Site1
    val s2 = Site1
    s1.url = "www.test.com"
    println(s1.url)
    println(s2.url)
}
