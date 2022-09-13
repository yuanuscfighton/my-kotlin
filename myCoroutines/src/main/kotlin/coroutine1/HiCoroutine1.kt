package coroutine1

import kotlin.concurrent.thread

fun main() {
  thread {
    Thread.sleep(1000)
    println("Kotlin Coroutine")
  }

  println("Hello")

  Thread.sleep(2000)

  println("World")
}
