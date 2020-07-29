package com.train.kotlin.type

//fun check(c: Char) {
//    if (c == 1) { // 错误：类型不兼容
//        // ……
//    }
//}

fun decimalDigitValue(c: Char): Int {
    if (c !in '0'..'9')
        throw IllegalArgumentException("Out of range")
    return c.toInt() - '0'.toInt() // 显式转换为数字
}

/**
 * Kotlin中的Char不能直接和数字操作
 * Char必需是单引号(')包含起来的
 */
fun main() {
    println(decimalDigitValue('9'))
}