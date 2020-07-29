package com.train.kotlin.variable

fun main() {
    var a = 1
    // 使用模板
    val s1 = "a is $a"
    println(s1)
    // 数值可变，s1字符串不变
    a = 2
    // 模板中使用表达式
    val s2 = "${s1.replace("is", "was")}, but now is $a"
    println(s2)
}
