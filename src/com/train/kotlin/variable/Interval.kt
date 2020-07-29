package com.train.kotlin.variable

/**
 * 区间表达式由具有操作符形式 .. 的 rangeTo 函数辅以 in 和 !in 形成。
 * 区间是为任何可比较类型定义的
 */
fun main() {
    // 输出“1234”
    for (i in 1..4) print(i)
    println()

    // 没有输出
    for (i in 4..1) print(i)
    println()

    val j = 1
    val k = 10
    // 等同于 1 <= i && i <= 10 闭区间[1, 10]
    if (j in 1..10 && k in 1..10) {
        println("$j $k")
    }

    // 使用 step 指定步长
    // 输出“13”
    for (i in 1..4 step 2) print(i)
    println()

    // 输出“42”
    for (i in 4 downTo 1 step 2) print(i)
    println()

    // 使用 until 函数排除结束元素 左闭右开[1, 10)
    for (i in 1 until 10) {
        print(i)
    }
    println()
}