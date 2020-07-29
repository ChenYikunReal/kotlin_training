package com.train.kotlin.loop

fun main() {
    println("----while 使用-----")
    var x = 5
    while (x > 0) {
        println(x--)
    }
    println("----do...while 使用-----")
    var y = 5
    do {
        println(y--)
    } while (y > 0)
}
