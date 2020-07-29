package com.train.kotlin.type

/**
 * 数值强转函数
 * toByte(): Byte
 * toShort(): Short
 * toInt(): Int
 * toLong(): Long
 * toFloat(): Float
 * toDouble(): Double
 * toChar(): Char
 */
fun main() {
    // 自动类型转化
    val l = 1L + 3 // Long + Int => Long
    // 字面值是静态检测的
    val b: Byte = 1
    // val i: Int = b  错误
    // 强转
    val i: Int = b.toInt()
}