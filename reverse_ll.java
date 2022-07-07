import java.util.* ;
import java.io.*; 
/*
	Following is the structure of the Singly Linked List.	
	class LinkedListNode<T> 
    {
    	T data;
    	LinkedListNode<T> next;
    	public LinkedListNode(T data) 
        {
        	this.data = data;
    	}
	}

*/
public class Solution 
{
    public static LinkedListNode<Integer> reverseLinkedList(LinkedListNode<Integer> head) 
    {
        LinkedListNode<Integer> d=null;
        while(head!=null){
            LinkedListNode<Integer> next=head.next;
            head.next=d;
            d=head;
            head=next;
        }
        return d;
    }
}