package com.train.kotlin.variable

/**
 * 多行注释 哦豁~
 */
fun main() {
    // 声明变量并初始化
    val a: Int = 1
    // 在声明时初始化，则系统自动推断变量类型(此处为Int)
    val b = 1
    // 不在声明时初始化，则必须提供变量类型
    val c: Int
    // 变量赋值
    c = 1
    // 系统自动推断变量类型为Int
    var x = 5
    // var变量值可修改，val不可修改
    x += 1
}
