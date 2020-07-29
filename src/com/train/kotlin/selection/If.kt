package com.train.kotlin.selection

fun main() {
    // 传统if
    val x = 0
    if (x < 1) println("x小于1")
    if (x > 0) {
        println("x大于0")
    } else if(x == 0) {
        println("x等于0")
    } else {
        println("x小于0")
    }

    // 使用表达式而不必使用三目运算符
    val a = 1
    val b = 2
    val c = if (a >= b) a else b
    println("c的值为$c")

    // 可以把if表达式的结果赋值给一个变量
    val max = if (a > b) {
        println("Choose a")
        a
    } else {
        println("Choose b")
        b
    }

    // 可以使用区间代替比较运算符作为选择语句的布尔表达式
    val d = 5
    if (d in 1..8) {
        println("d在[1,8]区间内")
    }
}
