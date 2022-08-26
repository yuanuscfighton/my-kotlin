package Kotlin基础.pkg14_枚举

// 枚举中声明方法
enum class Season3 {

  SPRING {
    override fun getSeason(): Season3 = SPRING
  },

  SUMMER {
    override fun getSeason(): Season3 = SUMMER
  },

  AUTUMN {
    override fun getSeason(): Season3 = AUTUMN
  },

  WINTER {
    override fun getSeason(): Season3 = WINTER
  };

  abstract fun getSeason(): Season3
}

fun main() {
  val seasons = Season3.values()
//  seasons.forEach { season: Season3 -> println(season) }
  seasons.forEach { println(it) } // it表示当前正在迭代的对象

  val season = Season3.valueOf("SPRING")
  println(season)
}
