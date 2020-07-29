package com.train.kotlin.type

fun main() {
    val str = "123"
    for (c in str) {
        print(c)
    }
    println()
    println(str[1])

    val text = """
    多行字符串
    多行字符串
    """
    // 输出有一些前置空白
    println("输出：\n$text")
    // 输出不含前置空白
    println("输出：\n${text.trimStart()}")
    // 输出不含后置空白
    println("输出：\n${text.trimEnd()}")
    // 输出不含前后空白
    println("输出：\n${text.trim()}")

    println("The End")
}
