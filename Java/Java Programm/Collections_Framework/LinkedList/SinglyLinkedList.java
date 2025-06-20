package Collections_Framework.LinkedList;

import java.util.LinkedList;

public class SinglyLinkedList 
{
	static class Node
	{
		int item;
		Node next;  //next [ANN -> Address of Next Node]
		
		public Node(int item)
		{
			this.item = item;
			this.next = null;
		}	
	}

	public static void main(String[] args) 
	{
		Node n1 = new Node(100);
		Node n2 = new Node(200);
		Node n3 = new Node(300);
		
		n1.next = n2;
		n2.next = n3;
		
		
		System.out.println(n1.item);
		System.out.println(n1.next.item);
		System.out.println(n1.next.next.item);	
		
		LinkedList l = null;
		
	}

}