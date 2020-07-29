package com.train.kotlin.oop.oop_class

/**
 * 普普通通，只有属性的类
 */
class ClassVar {
    var id: Int = 1
    var name: String = "小明"

    // var allByDefault: Int? // 错误: 需要一个初始化语句, 默认实现了 getter 和 setter 方法
    var initialized = 1    // 类型为 Int, 默认实现了 getter 和 setter
    val simple: Int?       // 类型为 Int ，默认实现 getter ，但必须在构造函数中初始化
        get() {
            TODO()
        }
    val inferredType = 1   // 类型为 Int 类型,默认实现 getter
}
