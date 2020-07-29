package com.train.kotlin.oop.generic

/**
 * 定义一个支持协变的类
 * 声明处的类型变异使用协变注解修饰符：in、out，消费者 in, 生产者 out
 * 使用 out 使得一个类型参数协变，协变类型参数只能用作输出，可以作为返回值类型但是无法作为入参的类型
 * in 使得一个类型参数逆变，逆变类型参数只能用作输入，可以作为入参的类型但是无法作为返回值的类型
 */
class Variance1<out A>(val a: A) {
    fun foo(): A {
        return a
    }
}

class Variance2<in A>(a: A) {
    fun foo(a: A) {
    }
}

fun main() {
    var strCo: Variance1<String> = Variance1("a")
    var anyCo: Variance1<Any> = Variance1<Any>("b")
    anyCo = strCo
    println(anyCo.foo())
    var strDCo = Variance2("a")
    var anyDCo = Variance2<Any>("b")
    strDCo = anyDCo
}
