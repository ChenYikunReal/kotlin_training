package com.train.kotlin.oop.generic

/**
 * 我们可以使用泛型约束来设定一个给定参数允许使用的类型
 * Kotlin 中使用 : 对泛型的类型上限进行约束
 */
fun <T> copyWhenGreater(list: List<T>, threshold: T): List<String>
        where T : CharSequence,
              T : Comparable<T> {
    return list.filter { it > threshold }.map { it.toString() }
}
