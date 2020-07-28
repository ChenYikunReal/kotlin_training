package com.train.kotlin.function

/**
 * 表达式作为函数体，返回类型自动推断
 */
fun sum1(a: Int, b: Int) = a + b

/**
 * public方法则必须明确写出返回类型
 */
public fun sum2(a: Int, b: Int): Int = a + b

/**
 * 无返回值的函数(类似Java中的void)
 */
fun printSum1(a: Int, b: Int): Unit {
    print(a + b)
}


/**
 * 如果是返回Unit类型，则可以省略(对于public方法也是这样)
 */
public fun printSum2(a: Int, b: Int) {
    print(a + b)
}
