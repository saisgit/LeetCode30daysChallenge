package june
/*
* @see https://leetcode.com/explore/challenge/card/june-leetcoding-challenge/539/week-1-june-1st-june-7th/3349/
**/
object Day03_TwoCityScheduling {
  def twoCitySchedCost (costs: Array[Array[Int]]): Int = {
    val sortedCosts = costs.sortBy(x => x.head - x.last)
    var result = 0
    val lengthBy2 = costs.length / 2
    for (i <- costs.indices) {
      if (i < lengthBy2)
        result += sortedCosts(i).head
      else
        result += sortedCosts(i).last
    }
    result
  }
  def main(args: Array[String]): Unit = {
    val costs = Array(Array(10, 20), Array(30, 200), Array(400, 50), Array(30, 20))
    println(twoCitySchedCost(costs))
  }
}

