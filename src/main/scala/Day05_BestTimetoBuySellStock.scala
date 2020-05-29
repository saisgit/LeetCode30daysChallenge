import scala.collection.mutable.ListBuffer

/*
* Say you have an array prices for which the ith element is the price of a given stock on day i.

Design an algorithm to find the maximum profit. You may complete as many transactions as you like (i.e., buy one and sell one share of the stock multiple times).

Note: You may not engage in multiple transactions at the same time (i.e., you must sell the stock before you buy again).

Example 1:

Input: [7,1,5,3,6,4]
Output: 7
Explanation: Buy on day 2 (price = 1) and sell on day 3 (price = 5), profit = 5-1 = 4.
             Then buy on day 4 (price = 3) and sell on day 5 (price = 6), profit = 6-3 = 3.

 https://leetcode.com/explore/challenge/card/30-day-leetcoding-challenge/528/week-1/3287/
 */

object Day05_BestTimetoBuySellStock {

  def maxProfit(prices: Array[Int]): Int = {

    var maxprofit:ListBuffer[Int] = ListBuffer()

    if(prices.length<2){
      prices.sum
    }

    for(current <- 1 until prices.length){
      if(prices(current) > prices(current-1)){
        maxprofit += (prices(current) - prices(current-1))
      }
    }
    maxprofit.sum
  }

  def main(args: Array[String]): Unit = {
    println(maxProfit(Array(7,1,5,3,6,4)))
  }

}
