package Kotlin学习.pkg11_泛型与协变

/**
 * 泛型(generic)，表示变量类型的参数化
 */

// T表示泛型的类型，primary constructor(主构造方法)接收一个参数，这个参数是T类型的。
class MyGeneric<T>(t: T) {
  var variable: T

  init {
    this.variable = t
  }
}

fun main() {
  val myGeneric: MyGeneric<String> = MyGeneric<String>("HelloWorld")

  val myGeneric1 = MyGeneric("Hi Kotlin") // 借助于类型推断

  println(myGeneric.variable)
  println(myGeneric1.variable)
}
