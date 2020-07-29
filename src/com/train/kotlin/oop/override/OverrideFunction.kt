package com.train.kotlin.oop.override

open class A {
    open fun f () {
        println("A")
    }
    fun a() {
        println("a")
    }
}

interface B {
    // 接口的成员变量默认是 open 的
    fun f() {
        println("B")
    }
    fun b() {
        println("b")
    }
}

/**
 * 如果有多个相同的方法(继承或者实现自其他类，如A、B类)，则必须要重写该方法，使用super范型去选择性地调用父类的实现
 */
class C() : A() , B{
    override fun f() {
        // 调用 A.f()
        super<A>.f()
        // 调用 B.f()
        super<B>.f()
    }
}

fun main() {
    val c =  C()
    c.f();
}
