package Kotlin基础.pkg3_构造方法

class Person2 constructor(username: String) {

  // 方法2: secondary构造方法

  // secondary构造方法和primary构造方法之间存在一个重要的联系，
  // 即，一个secondary构造方法必须要直接或间接的调用它的primary构造方法

  private var username: String
  private var age: Int
  private var address: String

  init {
    println("调用了init(), username=$username")
    this.username = username
    this.age = 20
    this.address = "beijing"
  }

  // 这里的冒号就表示调用了primary构造方法
  // 而且这里是直接调用了primary构造方法
  constructor(username: String, age: Int) : this(username) {
    println("带2个参数的secondary构造方法，username=$username, age=$age")
    this.username = username
    this.age = age
    this.address = "shanghai"
  }
  // 注意: secondary构造方法没有名字

  // 这是第2个secondary构造方法，这里是间接的调用了primary构造方法
  constructor(username: String, age: Int, address: String) : this(username, age) {
    println("带3个参数的secondary构造方法, username=$username, age=$age, address=$address")
    this.address = address
  }

  fun printInfo() {
    println("调用了printInfo(), username=${this.username}, age=${this.age}, address=${this.address}")
  }
}

fun main() {
  val p1 = Person2("张三")
  p1.printInfo()
  println("----------")

  val p2 = Person2("李四", 30)
  p2.printInfo()
  println("----------")

  val p3 = Person2("王五", 32, "杭州")
  p3.printInfo()
}
