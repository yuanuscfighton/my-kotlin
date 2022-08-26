package Kotlin学习.pkg4_继承.ch3_属性的继承

open class Parent1 {
  open val username : String = "parent"
}

// 在Child1构造方法中，直接定义好了username属性，并且还重写了父类中的username
// 可以在primary构造方法里面声明属性，也可以在primary构造方法里面重写属性。
class Child1(override val username : String) : Parent1() {

}
