package com.train.kotlin.function

/**
 * 使用Lambda匿名函数求和
 */
fun main() {
    val sumLambda: (Int, Int) -> Int = {x, y -> x+y}
    println(sumLambda(1,2))
}
