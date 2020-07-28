package com.train.kotlin.hello

/**
 * 面向对象，先新建一个类
 */
class Greeter(private val name: String) {
    fun greet() {
        println("Hello, $name")
    }
}

fun main(args: Array<String>) {
    // 创建一个对象不用 new 关键字
    Greeter("World!").greet()
}
