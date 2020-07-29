package com.train.kotlin.oop.oop_enum

enum class RGB { RED, GREEN, BLUE }

/**
 * 自Kotlin1.1起，可以使用enumValues<T>()和enumValueOf<T>()函数以泛型的方式访问枚举类中的常量
 */
inline fun <reified T : Enum<T>> printAllValues() {
    print(enumValues<T>().joinToString { it.name })
}

fun main() {
    // 输出 RED, GREEN, BLUE
    printAllValues<RGB>()
}
