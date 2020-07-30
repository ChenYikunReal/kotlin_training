package com.train.kotlin.oop.extension

open class B {
}

class B1 : B() {
}

open class A {
    open fun B.foo() {
        println("B.foo in A")
    }

    open fun B1.foo() {
        println("B1.foo in A")
    }

    fun caller(B: B) {
        B.foo()   // 调用扩展函数
    }
}

class A1 : A() {
    override fun B.foo() {
        println("B.foo in A1")
    }

    override fun B1.foo() {
        println("B1.foo in A1")
    }
}

fun main() {
    A().caller(B())   // 输出 "B.foo in A"
    A1().caller(B())  // 输出 "B.foo in A1" —— 分发接收者虚拟解析
    A().caller(B1())  // 输出 "B.foo in A" —— 扩展接收者静态解析
}
