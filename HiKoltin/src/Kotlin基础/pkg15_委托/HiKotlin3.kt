package Kotlin基础.pkg15_委托

// 2.委托属性 -- 延迟属性: 第1次访问属性的时候，会执行一次计算，后面再次访问的时候，就不再执行计算了，而是使用第一次缓存的结果
val myLazyValue: Int by lazy {
  println("hello world")
  30 // 30作为lambda表达式的结果，赋给了myLazyValue
}
// lazy说明:
// (1) lazy是一个函数，会接收一个lambda表达式参数
// (2) 函数返回 Lazy<T>，作为委托的结果

// LazyThreadSafetyMode:
// SYNCHRONIZED: 默认情况下，延迟属性的计算是同步的: 值只会在一个线程中得到计算，所有的线程都会使用相同的一个结果
// PUBLICATION: 如果不需要初始化委托同步的，这个多线程可以同步执行
// NONE: 如果确定初始化操作只会在一个线程中执行，这样会减少线程安全方面的开销

fun main() {
  println(myLazyValue)
  println(myLazyValue)
}
