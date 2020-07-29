package com.train.kotlin.oop.oop_enum

/**
 * 每一个枚举都是枚举类的实例，它们可以被初始化
 */
enum class Color2(val rgb: Int) {
    // 红色
    RED(0xFF0000),
    // 绿色
    GREEN(0x00FF00),
    // 蓝色
    BLUE(0x0000FF)
}