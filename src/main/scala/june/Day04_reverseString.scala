package june

object Day04_reverseString {


  def reverseString_Iterative(s: Array[Char]): Unit = {

    val length = s.length

    for (i <- 0 until length / 2) {
      val temp = s(i)
      s(i) = s(length - 1 - i)
      s(length - 1 - i) = temp
    }
    // println(s.mkString(","))
  }
  def reverseString_tailRec(s: Array[Char]): Array[Char] = {
    type A = Char

    def reverseList_Helper(finalList: List[A], InputList: List[A]): List[A] =
      InputList match {
        case Nil => finalList
        case x :: tail => reverseList_Helper(x :: finalList, tail)
      }

    reverseList_Helper(Nil, s.toList).toArray
  }

  def main(args: Array[String]): Unit = {
    reverseString_tailRec(Array('h','e','l','l','o'))
  }
}
