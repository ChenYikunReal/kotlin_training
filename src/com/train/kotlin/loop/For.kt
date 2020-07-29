package com.train.kotlin.loop

fun main() {
    val items = listOf("apple", "banana", "kiwi")
    for (item in items) {
        println(item)
    }
    for (item: String in items) {
        println(item)
    }
    for (index in items.indices) {
        println("item at $index is ${items[index]}")
    }
    for ((index, value) in items.withIndex()) {
        println("the element at $index is $value")
    }
}
