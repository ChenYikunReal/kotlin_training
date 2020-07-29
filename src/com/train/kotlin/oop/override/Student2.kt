package com.train.kotlin.oop.override

/**
 * 用户基类
 */
open class Person2(name: String){
    /**
     * 次级构造函数
     */
    constructor(name:String,age:Int):this(name){
        //初始化
        println("-------基类次级构造函数---------")
    }
}

/**
 * 子类继承 Person 类
 */
class Student2: Person2{

    /**
     * 次级构造函数
     */
    constructor(name: String, age: Int, no: String, score: Int): super(name, age){
        println("-------子类次级构造函数---------")
        println("学生名： ${name}")
        println("年龄： ${age}")
        println("学生号： ${no}")
        println("成绩： ${score}")
    }
}

fun main() {
    var s =  Student2("XiaoMing", 18, "123456", 100)
}
