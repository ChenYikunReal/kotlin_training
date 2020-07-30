package com.train.kotlin.oop.object_expression

class Site2 {
    var name = "菜鸟教程"
    object DeskTop{
        var url = "www.runoob.com"
        fun showName(){
            // print{"desk legs $name"} // 错误，不能访问到外部类的方法和变量
        }
    }
}

fun main() {
    var site = Site2()
    // site.DeskTop.url // 错误，不能通过外部类的实例访问到该对象
    Site2.DeskTop.url // 正确
}
