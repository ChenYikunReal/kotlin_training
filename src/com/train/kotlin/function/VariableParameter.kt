package com.train.kotlin.function

/**
 * 函数的变长参数可以用vararg关键字进行标识
 * 下面就是一个可变长参数函数
 */
fun vars(vararg v: Int){
    for (vt in v) {
        print(vt)
    }
}

/**
 * 测试定义的可变长参数函数vars()
 * args: Array<String> 貌似也可以省略
 */
fun main() {
    vars(1, 2, 3, 4, 5)
}
