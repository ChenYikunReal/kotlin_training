package com.train.kotlin.oop.extension

/**
 * 在扩展函数内， 可以通过 this 来判断接收者是否为 NULL,这样，即使接收者为 NULL,也可以调用扩展函数
 */
fun main(){
    val t = null
    println(t.toString())
}
