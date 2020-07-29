package com.train.kotlin.oop.override

open class Foo1 {
    open val x: Int = 1
}

/**
 * 可以用一个var属性重写一个val属性，但是反过来不行
 * 因为val属性本身定义了getter方法，重写为var属性会在衍生类中额外声明一个setter方法
 */
class Bar1 : Foo1() {
    override val x: Int = 2
}

interface Foo {
    val count: Int
}

/**
 * 可以在主构造函数中使用override关键字作为属性声明的一部分
 */
class Bar2(override val count: Int) : Foo

class Bar3 : Foo {
    override var count: Int = 3
}