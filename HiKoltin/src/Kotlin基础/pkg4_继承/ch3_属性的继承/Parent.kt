package Kotlin学习.pkg4_继承.ch3_属性的继承

open class Parent {
  open val username: String = "parent"
}

class Child : Parent() {
  override val username: String = "child"
}

fun main() {
  val child = Child()
  println(child.username)
}
