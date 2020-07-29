package com.train.kotlin.oop.override

/**
 * 这是父类
 * 如果一个类要被继承，可以使用 open 关键字进行修饰
 */
open class Base(p: Int)

/**
 * 这是子类
 */
class Derived(p: Int) : Base(p)
