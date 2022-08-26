package Kotlin学习.pkg4_继承.ch2_方法的继承

// Fruit的构造方法是不接收任何参数的
// 分析: Fruit类本身是open的，即这个类是可以被继承的。所以我们可以写 class Apple : Fruit {...}
// 现在想让子类重写父类中的name方法，那么父类中的这个方法，也需要加上open关键字
open class Fruit {
  open fun name() {
    println("fruit")
  }

  fun expirationDate() {
    println("1 month")
  }
}

// 如果一个子类继承父类的话，子类的构造方法必须要隐式/显式的调用父类的构造方法
// 构造方法一定要通过类的声明的这个地方给它指定好
class Apple : Fruit() {

  // 现在想重写name方法，但报错了
  // error_message='name' hides member of supertype 'Fruit' and needs 'override' modifier
  /*
  fun name() {
  }
   */

  // 现在加上了override关键之后，依然报错。
  // error_message='name' in 'Fruit' is final and cannot be overridden
  /*
  override fun name() {
  }
   */

  // 父类中的name()方法必须加上open关键字
  override fun name() {
    println("apple")
  }
}

fun main() {
  val apple = Apple()
  apple.name()
  apple.expirationDate()
}
