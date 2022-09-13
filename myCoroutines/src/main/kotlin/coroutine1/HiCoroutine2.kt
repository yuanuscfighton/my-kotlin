package coroutine1

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking


fun main() {
  GlobalScope.launch {
    delay(1000)
    println("Kotlin, Coroutines")
  }

  println("Hello")

  // 创建一个新的协程，并阻塞当前线程，直到协程结束
  runBlocking {
    delay(2000)
  }

  println("World")
}
