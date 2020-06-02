package june
class ListNode(var _x: Int = 0) {
     var next: ListNode = null
     var x: Int = _x
   }
object Day02_deleteNodeInLinkedList {

  def deleteNode(node: ListNode): Unit = {

    node.x = node.next.x
    node.next = node.next.next

  }


}
