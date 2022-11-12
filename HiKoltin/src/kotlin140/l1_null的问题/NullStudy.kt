package kotlin140.l1_null的问题

/**
 * @description null的问题
 * @date        2022/10/3 4:24 PM
 */
fun main() {
  var name: String? = null

  // 如果name是null，后面的就不执行，不会引发npe
  name?.length

  // 如果name是null了，会引发npe，和Java一样
  name!!.length

}
