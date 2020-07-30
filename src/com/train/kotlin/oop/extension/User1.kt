package com.train.kotlin.oop.extension

class User1(var name:String)

/**
 * 扩展函数
 */
fun User1.print(){
    print("用户名：$name")
}

fun main() {
    val user = User1("test")
    user.print()
}
