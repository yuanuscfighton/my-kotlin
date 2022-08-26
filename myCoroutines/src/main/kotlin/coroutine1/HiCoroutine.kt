package coroutine1

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

/**
 * @description 创建一个协程
 * @date        2022/8/26 11:34 PM
 */
fun main() {
  GlobalScope.launch {
    delay(1000)
    println("Kotlin Coroutines")
  }

  println("hello")

  Thread.sleep(2000)

  println("world")
}
