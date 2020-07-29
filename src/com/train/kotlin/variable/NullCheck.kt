package com.train.kotlin.variable

import java.lang.Integer.parseInt

/**
 * Kotlin的空安全设计对于声明可为空的参数，在使用时要进行空判断处理。
 * 有两种处理方式：
 * 1. 字段后加!!像Java一样抛出空异常
 * 2. 字段后加?可不做处理返回值为null或配合?:做空判断处理
 */
fun main(args: Array<String>) {
    // 类型后面加?表示可为空
    var age: String? = "23"
    // 抛出空指针异常
    val ages = age!!.toInt()
    // 不做处理返回 null
    val ages1 = age?.toInt()
    // age为空返回-1
    val ages2 = age?.toInt() ?: -1

    // 下面演示如何使用一个返回值可为null的函数
    if (args.size < 2) {
        println("Two integers expected")
        return
    }
    val x = parseInt(args[0])
    val y = parseInt(args[1])
    // 直接使用'x*y'会导致错误, 因为它们可能为null
    if (x != null && y != null) {
        // 在进行过null值检查之后, x和y的类型会被自动转换为非null变量
        println(x * y)
    }
}
