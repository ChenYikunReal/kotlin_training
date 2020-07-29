package com.train.kotlin.oop.oop_class

class Test {
    var v = "成员属性"
    fun setInterFace(test: TestInterFace) {
        test.test()
    }
}

/**
 * 定义接口
 */
interface TestInterFace {
    fun test()
}

fun main() {
    val test = Test()
    /**
     * 采用对象表达式来创建接口对象，即匿名内部类的实例
     * 必须用object关键词
     */
    test.setInterFace(object : TestInterFace {
        override fun test() {
            println("对象表达式创建匿名内部类的实例")
        }
    })
}
