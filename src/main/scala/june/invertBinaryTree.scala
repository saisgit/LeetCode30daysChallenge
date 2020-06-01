package june

/*
* @see https://leetcode.com/explore/challenge/card/june-leetcoding-challenge/539/week-1-june-1st-june-7th/3347/
* Invert a binary tree.

Example:

Input:

     4
   /   \
  2     7
 / \   / \
1   3 6   9
Output:

     4
   /   \
  7     2
 / \   / \
9   6 3   1*/

class TreeNode(_value: Int = 0, _left: TreeNode = null, _right: TreeNode = null) {
     var value: Int = _value
     var left: TreeNode = _left
     var right: TreeNode = _right
   }
object invertBinaryTree {


  def invertTree(root: TreeNode): TreeNode = {
    if (root == null) return null
    val right = invertTree(root.right)
    val left = invertTree(root.left)
    root.left = right
    root.right = left
    root
  }


}
