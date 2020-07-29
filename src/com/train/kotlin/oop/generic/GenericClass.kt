package com.train.kotlin.oop.generic

class Box<T>(t : T) {
    var value = t
}

fun main() {
    var boxInt = Box<Int>(10)
    var boxString = Box<String>("test")
    // 编译器支持的话也可以自动推导类型
    // boxInt = Box(10)
    // boxString = Box("test")
    println(boxInt.value)
    println(boxString.value)
}
