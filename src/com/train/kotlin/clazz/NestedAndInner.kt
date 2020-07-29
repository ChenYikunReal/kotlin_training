package com.train.kotlin.clazz

/**
 * 外部类
 */
class Outer {

    val bar: Int = 1

    /**
     * 嵌套类
     */
    class Nested {
        fun foo() = 2
    }

    val v = "成员属性"

    /**
     * 嵌套内部类
     */
    inner class Inner {

        // 访问外部类成员
        fun foo() = bar

        fun innerFunction() {
            //获取外部类的成员变量
            val o = this@Outer
            println("内部类可以引用外部类的成员，例如：" + o.v)
        }
    }

}

fun main() {
    // 调用格式：外部类.外部类属性
    val outerVal = Outer().bar
    println(outerVal)

    // 调用格式：外部类.嵌套类.嵌套类方法
    val nestedFun = Outer.Nested().foo()
    println(nestedFun)

    // 调用格式：外部类.内部类.内部类方法
    val innerVal = Outer().Inner().foo()
    println(innerVal)

    // 内部类可以引用外部类的成员，如成员属性
    val innerFun = Outer().Inner().innerFunction()
    println(innerFun)
}
