package com.train.kotlin.oop.override

/**
 * 若子类有主构造函数，则基类必须在主构造函数中立即初始化
 */
open class Person1(var name : String, var age : Int){}

class Student1(name : String, age : Int, var no : String, var score : Int) : Person1(name, age) {}

fun main() {
    val s =  Student1("XiaoMing", 18, "123456", 100)
    println("学生名： ${s.name}")
    println("年龄： ${s.age}")
    println("学生号： ${s.no}")
    println("成绩： ${s.score}")
}
