package com.train.kotlin.oop.oop_enum

/**
 * EnumClass.valueOf(value: String): EnumClass  -> 转换指定 name 为枚举值，若未匹配成功，会抛出IllegalArgumentException
 * EnumClass.values(): Array<EnumClass>         -> 以数组的形式，返回枚举值
 */
fun main() {
    val color: Color1=Color1.BLUE
    println(Color1.values())
    println(Color1.valueOf("RED"))
    println(color.name)
    println(color.ordinal)
}
