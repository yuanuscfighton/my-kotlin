package Kotlin学习.pkg4_继承.ch1_类的继承

open class Parent1(name: String)

// 如果一个类没有primary构造方法，同时又想去继承一个父类。
// 那么这个类的每个secondary构造方法就需要通过super关键字来初始化父类型，或是通过其他secondary构造方法完成这个任务
// 不同的secondary构造方法可以调用父类型不同的构造方法

class Child1 : Parent1 {

  // secondary constructor
  constructor(username: String) : super(username)
}
