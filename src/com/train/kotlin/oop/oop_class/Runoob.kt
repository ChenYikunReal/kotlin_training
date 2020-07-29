package com.train.kotlin.oop.oop_class

class Runoob  constructor(name: String) {
    var url: String = "http://www.runoob.com"
    var country: String = "CN"
    var siteName = name
    init {
        println("初始化网站名: ${name}")
    }
    constructor (name: String, alexa: Int) : this(name) {
        println("Alexa 排名 $alexa")
    }
    fun printTest() {
        println("我是类的函数")
    }
}

fun main() {
    val runoob =  Runoob("菜鸟教程", 10000)
    println(runoob.siteName)
    println(runoob.url)
    println(runoob.country)
    runoob.printTest()
}
