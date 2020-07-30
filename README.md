# Kotlin学习记录

>在Google I/O 2017中，Google 宣布 Kotlin 成为 Android 官方开发语言。

![在这里插入图片描述](https://github.com/ChenYikunReal/kotlin_training/blob/master/images/kotlin_android.jpg?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3dlaXhpbl80Mzg5NjMxOA==,size_16,color_FFFFFF,t_70)


那时起，Kotlin正式走进了我的视野，就想着虽然自己不打算从事移动开发，但总归是要接触接触的吧。

Kotlin是怎样的一种编程语言呢？
- Kotlin是一种在Java虚拟机上运行的静态类型编程语言，被称之为Android世界的Swift，由JetBrains设计开发并开源。
- Kotlin可以编译成Java字节码，也可以编译成JavaScript，方便在没有JVM的设备上运行。 

不得不说的是，Kotlin这门神奇的编程语言正是我们亲爱的JetBrains公司开发的。<br/>
Kotlin显然比起Java有着诸多的改良和简化，这门语言具体如何，暂且不知，先学一学也无妨！<br/><br/>
![在这里插入图片描述](https://github.com/ChenYikunReal/kotlin_training/blob/master/images/kotlin_programming.jpg?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3dlaXhpbl80Mzg5NjMxOA==,size_16,color_FFFFFF,t_70)
<br/><br/>
[菜鸟教程](https://www.runoob.com/kotlin/kotlin-tutorial.html)

## 选择Kotlin的优点
- 简洁: 大大减少样板代码的数量。
- 安全: 避免空指针异常等整个类的错误。
- 互操作性: 充分利用JVM、Android和浏览器的现有库。
- 工具友好: 可用任何Java IDE或者使用命令行构建。

## Kotlin默认导入的包
- kotlin.*
- kotlin.annotation.*
- kotlin.collections.*
- kotlin.comparisons.*
- kotlin.io.*
- kotlin.ranges.*
- kotlin.sequences.*
- kotlin.text.*

## Kotlin变量
可变变量定义：<code>var</code>关键字
```text
var <标识符> : <类型> = <初始化值>
```
不可变变量定义：<code>val</code>关键字，只能赋值一次的变量(类似Java中<code>final</code>修饰的变量)
```text
val <标识符> : <类型> = <初始化值>
```

## Kotlin数据类型
|类型 	|   位宽度|
|:---:|:---:|
|Double |	64|
|Float |	32|
|Long |	64|
|Int |	32|
|Short |	16|
|Byte |	8|

## Kotlin面向对象相关修饰符
- classModifier:(类属性修饰符，标示类本身特性)
    - abstract：抽象类
    - final：类不可继承(默认)
    - enum：枚举类
    - open：类可继承
    - annotation：注解类
- accessModifier(访问权限修饰符)
    - private：仅在同一个文件中可见
    - protected：同一个文件中或子类可见
    - public：所有调用的地方都可见
    - internal：同一个模块中可见

## Kotlin类属性的声明
```text
var <propertyName>[: <PropertyType>] [= <property_initializer>]
    [<getter>]
    [<setter>]
```

## Kotlin构造器说明
> 在JVM中，如果主构造函数的所有参数都有默认值，编译器会生成一个附加的无参的构造函数，这个构造函数会直接使用默认值。

这使得Kotlin可以更简单的使用像Jackson或者JPA这样使用无参构造函数来创建类实例的库。
```kotlin
class Customer(val customerName: String = "")
```

## Kotlin关键词field的理解
[What's Kotlin Backing Field For?](https://stackoverflow.com/questions/43220140/whats-kotlin-backing-field-for/43220314)<br/>
核心语句：
> Remember in kotlin whenever you write foo.bar = value it will be translated into a setter call instead of a PUTFIELD.

在 Kotlin 中，任何时候当你写出“一个变量后边加等于号”这种形式的时候，比如我们定义 var no: Int 变量，当你写出 no = ... 这种形式的时候，这个等于号都会被编译器翻译成调用 setter 方法；而同样，在任何位置引用变量时，只要出现 no 变量的地方都会被编译器翻译成 getter 方法。那么问题就来了，当你在 setter 方法内部写出 no = ... 时，相当于在 setter 方法中调用 setter 方法，形成递归，进而形成死循环。

## Kotlin使用枚举常量
Kotlin 中的枚举类具有合成方法，允许遍历定义的枚举常量，并通过其名称获取枚举常数。
```text
EnumClass.valueOf(value: String): EnumClass  // 转换指定 name 为枚举值，若未匹配成功，会抛出IllegalArgumentException
EnumClass.values(): Array<EnumClass>        // 以数组的形式，返回枚举值
```

## Kotlin对象表达式和对象声明之间的语义差异
对象表达式和对象声明之间有一个重要的语义差别：
- 对象表达式是在使用他们的地方立即执行的
- 对象声明是在第一次被访问到时延迟初始化的
- 伴生对象的初始化是在相应的类被加载(解析)时，与Java静态初始化器的语义相匹配
