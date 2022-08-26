package Kotlin学习.pkg4_继承.ch1_类的继承

/**
 * 在Kotlin中，所有类在默认情况下都是无法被继承的，换句话说，在Kotlin中，所有类默认情况下都是final的。
 * open的含义与final相反
 */
open class Parent(username: String, age: Int)

// 下面的Child类有一个Primary构造方法
// 如果一个子类继承父类的话，子类的构造方法必须要隐式/显式的调用父类的构造方法（在Kotlin中构造方法是定义在类的声明中的）
// 因此在继承父类的时候，就需要显式的时候指定父类的构造方法。
class Child(name: String, age: Int) : Parent(name, age)
