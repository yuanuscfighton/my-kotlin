package Kotlin学习.pkg4_继承.ch3_属性的继承

open class Parent2 {

  open fun method() {
    println("parent method")
  }

  // val表明name是一个不可变的值，getter方法返回一个值，这个值是"parent"
  open val name: String get() = "parent"
}

class Child2 : Parent2() {
  override fun method() {
    // 调用父类的方法
    super.method()

    println("child method")
  }

  override val name: String
    get() = super.name + " and child"
}

// 1. val 可以 override val
// 2. var 可以 override val
// 3. val 无法 override var。如果可以override的话，相当于子类把父类的范围缩小了。本来父类可读可写，但子类变成了只读

// 本质上，val相当于get方法；var相当于get与set方法
