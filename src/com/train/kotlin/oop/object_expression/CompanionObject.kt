package com.train.kotlin.oop.object_expression

interface Factory<T> {
    fun create(): T
}

/**
 * 类内部的对象声明可以用 companion 关键字标记，这样它就与外部类关联在一起，我们就可以直接通过外部类访问到对象的内部元素。<br/>
 * 一个类里面只能声明一个内部关联对象，即关键字 companion 只能使用一次。
 */
class MyClass {
    companion object : Factory<MyClass> {
        override fun create(): MyClass = MyClass()
    }
}

fun main() {
    // 访问到对象的内部元素
    val instance = MyClass.create()
    // 可以省略掉该对象的对象名，然后使用 Companion 替代需要声明的对象名
    val x = MyClass.Companion
}
