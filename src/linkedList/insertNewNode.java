package linkedList;

import java.util.LinkedList;
import java.util.Scanner;

public class insertNewNode {
	
	@SuppressWarnings("null")
	Node SortedInsert(Node head,int data) {
	    Node newNode = new Node(data, null, null);
	    Node cursor = head;
	    Node temp = head;
	   
	    if(cursor == null){
	        temp = newNode;         // if the head is null it returns the newNode inserted.
	        return temp;
	    }
	    else{
	        while(true){
	            if(cursor.data < data){   // if the head is less than the newNode.
	                if(cursor.next == null){        // if head is the last node in the list then newNode will be added after head.
	                    cursor.next = newNode;
	                    newNode.prev = cursor;
	                    return temp;
	                }   
	                else
	                    cursor = cursor.next;
	            }
	            else{                           // if the head is more than the newNode.
	                cursor.prev.next = newNode;
	                newNode.prev = cursor.prev;
	                newNode.next = cursor;
	                cursor.prev = newNode;
	                return temp;
	            }
	        }    
	    }
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node n1 = new Node(1, null, null);
		Node n2 = new Node(2, null, null);
		Node n3 = new Node(5, null, null);
		n1.next = n2;
		n2.next = n3;
		n2.prev = n1;
		n3.prev = n2;
		
		insertNewNode n = new insertNewNode();
		n.SortedInsert(n1, 3);
		
	}

}
