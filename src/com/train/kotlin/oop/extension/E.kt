package com.train.kotlin.oop.extension

class E {
    fun foo() { println("成员函数") }
}

/**
 * 若扩展函数和成员函数一致，则使用该函数时，会优先使用成员函数
 */
fun E.foo() { println("扩展函数") }

fun main(){
    val e = E()
    e.foo()
}
