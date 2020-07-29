package com.train.kotlin.type

/**
 * 与Java不同的是，Kotlin中数组是不协变的(invariant)
 */
fun main(args: Array<String>) {
    //[1,2,3]
    val a = arrayOf(1, 2, 3)
    //[0,2,4]
    val b = Array(3) { i -> (i * 2) }

    //读取数组内容
    println(a[0])    // 输出结果：1
    println(b[1])    // 输出结果：2

    val x: IntArray = intArrayOf(1, 2, 3)
    x[0] = x[1] + x[2]
    println(x[0])
}
