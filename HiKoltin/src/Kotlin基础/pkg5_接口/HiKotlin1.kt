package Kotlin基础.pkg5_接口

interface A1 {
  fun method() {
    println("A1")
  }
}

open class B1 {
  open fun method() {
    println("B1")
  }
}

// ❌
//class C1 : A1,B1() {
//
//}
// error_message: Class 'C1' must override public open fun method(): Unit defined in A1, because it inherits many implementations of it.
