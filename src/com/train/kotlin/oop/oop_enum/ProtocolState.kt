package com.train.kotlin.oop.oop_enum

/**
 * 枚举还支持以声明自己的匿名类及相应的方法、以及覆盖基类的方法
 * 如果枚举类定义任何成员，要使用分号将成员定义中的枚举常量定义分隔开
 */
enum class ProtocolState {
    WAITING {
        override fun signal() = TALKING
    },
    TALKING {
        override fun signal() = WAITING
    };

    abstract fun signal(): ProtocolState
}
