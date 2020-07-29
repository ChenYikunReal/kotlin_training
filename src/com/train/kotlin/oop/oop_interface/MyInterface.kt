package com.train.kotlin.oop.oop_interface

/**
 * Kotlin 接口与 Java 8 类似，使用 interface 关键字定义接口，允许方法有默认实现
 */
interface MyInterface {
    var name:String //name 属性, 抽象的
    fun bar()
    fun foo() {
        // 可选的方法体
        println("foo")
    }
}

/**
 * 一个类或者对象可以实现一个或多个接口
 */
class Child : MyInterface {
    /**
     * 接口中的属性只能是抽象的，不允许初始化值，接口不会保存属性值，实现接口时，必须重写属性
     */
    override var name: String = "test"
    override fun bar() {
        // 方法体
        println("bar")
    }
}

fun main() {
    val c =  Child()
    c.foo();
    c.bar();
    println(c.name)

}
