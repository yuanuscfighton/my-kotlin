package Kotlin基础.pkg15_委托.p2_属性委托

import kotlin.properties.Delegates

// 2.委托属性 -- 非空属性
class MyPerson {
  var address: String by Delegates.notNull<String>()
}

fun main() {
  val myPerson = MyPerson()
  myPerson.address = "上海"
  println(myPerson.address)
}
