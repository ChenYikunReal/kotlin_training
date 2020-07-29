package com.train.kotlin.oop.oop_enum

/**
 * 默认名称为枚举字符名，值从0开始
 * 若需要指定值，则可以使用其构造函数
 */
enum class Shape(value:Int){
    OVAL(100),
    RECTANGLE(200)
}
