package com.train.kotlin.type

fun main() {
    val i = 10
    // 求值结果为 "i = 10"
    val j = "i = $i"
    println(j)

    // 花括号扩起来任意表达式
    val s = "kotlin"
    // 求值结果为 "kotlin.length is 6"
    val str = "$s.length is ${s.length}"
    println(str)

    // 在原生字符串中表示字面值$字符(它不支持反斜杠转义)
    val price = """
    ${'$'}9.99
    """
    println(price)  // 求值结果为 $9.99
}
