/*
* Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

Example:

Input: [-2,1,-3,4,-1,2,1,-5,4],
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.
Follow up:

If you have figured out the O(n) solution, try coding another solution using the divide and conquer approach, which is more subtle.
@see https://leetcode.com/explore/featured/card/30-day-leetcoding-challenge/528/week-1/3285/
*/

object Day03_MaximumSubArray {

  def maxSubArray(nums: Array[Int]): Int = {

    var max_so_far = nums(0)
    var max_sum = nums(0)

    for (i <- 1 until nums.length) {
      max_so_far = Math.max(max_so_far + nums(i), nums(i))
      max_sum = Math.max(max_so_far, max_sum)
    }
    max_sum
  }

  def main(args: Array[String]): Unit = {
    println(maxSubArray(Array(-2, 1, -3, 4, -1, 2, 1, -5, 4)))
  }
}

