import java.util.* ;
import java.io.*; 
/****************************************************************

    Following is the class structure of the Node class:

       class Node 
        { 
        public:
            int data;
            Node next;
            Node(int data) 
            {
              this.data = data;
              this.next = null;
            }
        };

*****************************************************************/

public class Solution {
    public static Node findMiddle(Node head) 
    {
        Node ans = head, curr = head;
        while (curr != null && curr.next != null) {
            ans = ans.next;
            curr = curr.next.next;
        }
        return ans;
    }
}
//striver vaiyaa op
