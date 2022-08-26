package Kotlin基础.pkg5_接口

interface A {
  // Kotlin的接口，可以只有声明，没有实现。
  fun method()
}

interface B {
  // 和Java8类似，Kotlin的接口中，可以有具体的实现
  fun method1() {
    println("B")
  }
}

class C : B {

}

fun main() {
  val c = C()
  c.method1()
}
