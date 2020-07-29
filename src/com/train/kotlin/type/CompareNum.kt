package com.train.kotlin.type

fun main() {
    val a: Int = 10000
    // true，值相等，对象地址相等
    println(a === a)

    // 经过了装箱，创建了两个不同的对象
    val boxedA: Int? = a
    val anotherBoxedA: Int? = a

    // 虽然经过了装箱，但是值是相等的，都是10000
    //  false，值相等，对象地址不一样
    println(boxedA === anotherBoxedA)
    // true，值相等
    println(boxedA == anotherBoxedA)
}
