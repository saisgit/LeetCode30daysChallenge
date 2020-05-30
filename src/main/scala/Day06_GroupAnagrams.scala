/*
*
* @see https://leetcode.com/explore/challenge/card/30-day-leetcoding-challenge/528/week-1/3288/
*
* Given an array of strings, group anagrams together.

Example:

Input: ["eat", "tea", "tan", "ate", "nat", "bat"],
Output:
[
  ["ate","eat","tea"],
  ["nat","tan"],
  ["bat"]
]*/

object Day06_GroupAnagrams {
  def groupAnagrams(strs: Array[String]): List[List[String]] ={
    strs.groupBy(x=>x.sorted).mapValues(_.toList).values.toList
  }

  def main(args: Array[String]): Unit = {
    println(groupAnagrams(Array("eat", "tea", "tan", "ate", "nat", "bat")))
  }


}
