/*
* Write an algorithm to determine if a number n is "happy".
A happy number is a number defined by the following process:
Starting with any positive integer, replace the number by the sum of the squares of
its digits, and repeat the process until the number equals 1 (where it will stay),
 or it loops endlessly in a cycle which does not include 1.
 Those numbers for which this process ends in 1 are happy numbers.
Return True if n is a happy number, and False if not.

Example:

Input: 19
Output: true
Explanation:
12 + 92 = 82
82 + 22 = 68
62 + 82 = 100
12 + 02 + 02 = 1

https://leetcode.com/explore/challenge/card/30-day-leetcoding-challenge/528/week-1/3284/
*/

object Day02_HappyNumber {

  def isHappy(n: Int): Boolean = {
    var slow = n
    var fast = n
    do {
      slow = findSquareSum(slow) // move one step
      fast = findSquareSum(findSquareSum(fast)) // move two steps

    } while (slow != fast) // found the cycle

    slow == 1 // see if the cycle is stuck on the number '1'

  }

  private def findSquareSum(num: Int) = {
    var sum = 0
    var digit = 0
    var n = num
    while(n > 0) {
      digit = n % 10
      sum += digit * digit
      n /= 10
    }
    sum
  }

  def main(args: Array[String]): Unit = {
    println(Day02_HappyNumber.isHappy(23))
    println(Day02_HappyNumber.isHappy(12))
  }

}
