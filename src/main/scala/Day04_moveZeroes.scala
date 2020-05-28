/*
* Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Example:

Input: [0,1,0,3,12]
Output: [1,3,12,0,0]
Note:

You must do this in-place without making a copy of the array.
Minimize the total number of operations.
@see https://leetcode.com/explore/challenge/card/30-day-leetcoding-challenge/528/week-1/3286/
* */
object Day04_moveZeroes {

  def moveZeroes(nums: Array[Int]): Unit = {
    var left = 0
    for (i <- nums.indices) {
      if (nums(i) != 0) {
        var temp = nums(left)
        nums(left) = nums(i)
        nums(i) = temp
        left = left + 1
      }
    }
    println(nums.toList)
  }

  def main(args: Array[String]): Unit = {
    println(moveZeroes(Array(0,1,0,3,12)))
  }


}
