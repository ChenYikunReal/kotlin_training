package com.train.kotlin.oop.oop_class

class Person(name: String) {
    var id: Int = 100
        // 后端变量
        get() = field
        set(value) {
            field = if (value < 10) value else -1
        }

    var name: String = "xiaoming"
        get() = field.toUpperCase()
        set(value) {
            field = value
        }

    var height: Float = 145.4f
        private set

    /**
     * 主构造器中不能包含任何代码
     * 初始化代码可以放在init初始化代码段中
     */
    init {
        println("Name is $name")
    }

    /**
     * 二级构造器写法
     */
    constructor(p_id: Int, name: String) : this(name) {
        id = p_id
    }
}

fun main() {
    val person: Person = Person("test")
    person.id = 9
    println("id:${person.id}")
    person.id = 20
    println("id:${person.id}")
    person.name = "xiaogang"
    println("name:${person.name}")
    // person.height = 20
    println("height:${person.height}")
}
