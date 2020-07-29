package com.train.kotlin.loop

fun foo1(items: Array<String>) {
    items.forEach {
        if (it === "") return
        println(it)
    }
}

fun foo2(items: Array<Int>) {
    items.forEach(fun(value: Int) {
        if (value == 0) return
        print(value)
    })
}

fun main() {
    for (i in 1..10) {
        if (i == 3) continue
        println(i)
        if (i > 5) break
    }
}
