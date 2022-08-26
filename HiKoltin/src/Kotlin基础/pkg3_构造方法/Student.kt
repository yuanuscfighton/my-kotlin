package Kotlin基础.pkg3_构造方法

// 这里定义的username，age，address就是类的成员变量。
// 定义在了类的构造方法参数上了
// 这里一步到位的 声明了属性，且在对象创建的时候，把参数值赋给属性了
class Student(private val username: String, private val age: Int, private var address: String) {

  fun printInfo() {
    println("username=${username}, age=${age}, address=${address}")
  }
}

fun main() {
  val student = Student("张三", 10, "北京")
  student.printInfo()
}
