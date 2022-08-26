package Kotlin学习.pkg11_泛型与协变

// out 表示出去，读取的，T类型只是用来读取的，不会用来修改它的值
class MyClass3<out T>(t: T) {
  val t: T

  init {
    this.t = t
  }

  fun get(): T = this.t
}

fun myTest(myClass3: MyClass3<String>) {
  val myObject3: MyClass3<Any> = myClass3 // 把一个String类型的映射给Any，读取的时候都是以Any类型读取的

  println(myObject3.get())
}

fun main() {
  val myClass = MyClass3<String>("aaaaaa")
  myTest(myClass)
}
