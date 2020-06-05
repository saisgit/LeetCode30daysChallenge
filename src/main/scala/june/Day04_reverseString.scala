package june

/**
  * @see https://leetcode.com/explore/challenge/card/june-leetcoding-challenge/539/week-1-june-1st-june-7th/3350/
  */

object Day04_reverseString {


  def reverseString_Iterative(s: Array[Char]): Unit = {
    val length = s.length

    for (i <- 0 until length / 2) {
      val temp = s(i)
      s(i) = s(length - 1 - i)
      s(length - 1 - i) = temp
    }
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

    reverseString_Iterative(Array('h','e','l','l','o'))
    reverseString_tailRec(Array('h','e','l','l','o'))

  }
}
