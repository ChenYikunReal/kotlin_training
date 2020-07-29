package com.train.kotlin.type

fun main() {
    // 十进制
    val a = 123
    // 长整型以大写的L结尾
    val b = 123L
    // 十六进制以0x开头，不支持八进制
    val c = 0x95
    // 二进制以0b开头
    val d = 0b00001011

    // 支持传统符号表示的浮点数值
    // Double默认写法
    val e = 123.4
    // Double科学计数法
    val f = 1.234e2
    // Float必须加f或F
    val g = 123.4f

    // 使用下划线使数字常量更易读
    val oneMillion = 1_000_000
    val creditCardNumber = 1234_5678_9012_3456L
    val socialSecurityNumber = 999_99_9999L
    val hexBytes = 0xFF_EC_DE_5E
    val bytes = 0b11010010_01101001_10010100_10010010
}
