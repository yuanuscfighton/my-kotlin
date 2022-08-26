package Kotlin基础.pkg3_构造方法

class Student4 (private var username: String = "lisi") {
}

fun main() {
  val student = Student4()
//  println(student.username) // 此时username是私有的，外面无法使用
}
