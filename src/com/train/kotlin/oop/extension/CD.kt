package com.train.kotlin.oop.extension

open class C

class D: C()

/**
 * 扩展函数 foo
 */
fun C.foo() = "c"

/**
 * 扩展函数 foo
 */
fun D.foo() = "d"

/**
 * 扩展函数是静态解析的，并不是接收者类型的虚拟成员。
 * 在调用扩展函数时，具体被调用的的是哪一个函数，由调用函数的的对象表达式来决定的，而不是动态的类型决定的:
 */
fun printFoo(c: C) {
    // 类型是 C 类
    println(c.foo())
}

fun main(){
    printFoo(D())
}
