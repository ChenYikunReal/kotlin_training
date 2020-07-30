package com.train.kotlin.oop.oop_class

/**
 * 编译器会自动的从主构造函数中根据所有声明的属性提取以下函数：
 * 1. equals() / hashCode()
 * 2. toString() 格式如 "User(name=John, age=42)"
 * 3. componentN() functions 对应于属性，按声明顺序排列
 * 4. copy() 函数
 *
 * 如果这些函数在类中已经被明确定义了，或者从超类中继承而来，就不再会生成。<br/>
 * 为了保证生成代码的一致性以及有意义，数据类需要满足以下条件：
 * 1. 主构造函数至少包含一个参数
 * 2. 所有的主构造函数的参数必须标识为val 或者 var
 * 3. 数据类不可以声明为 abstract, open, sealed 或者 inner
 * 4. 数据类不能继承其他类 (但是可以实现接口)
 *
 * 标准库提供了 Pair 和 Triple 。在大多数情形中，命名数据类是更好的设计选择，因为这样代码可读性更强而且提供了有意义的名字和属性。
 */
data class User(val name: String, val age: Int)

fun main() {
    val jack = User(name = "Jack", age = 1)
    val olderJack = jack.copy(age = 2)
    println(jack)
    println(olderJack)

}
