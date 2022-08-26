package Kotlin学习.pkg4_继承.ch2_方法的继承

open class Fruit1 {
  open fun name() {
    println("Fruit")
  }
}

open class Orange : Fruit1() {

  // 表示该方法不能被重写
  final override fun name() {
    println("orange")
  }
}
