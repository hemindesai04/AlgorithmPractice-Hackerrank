package linkedList;

public class MergeSortedLinkedList {
	
	/**
	 * @param headA
	 * @param headB
	 * @return
	 */
	Node MergeLists(Node headA, Node headB) {
	     // This is a "method-only" submission. 
	     // You only need to complete this method 
	    Node a = headA;
	    Node b = headB;
	    Node c = new Node(0, null, null);
	    Node temp = new Node(0, null, null);
	    while(a != null || b != null){				// condition to keep checking both the LinkedList
	    	
	    	if(a == null || b == null){				// condition to check if either of a or b is null
	            if(c.data != 0){					// condition to check if either of the LinkedList is null
		    		if(a == null){					// condition to check if a has reached null
		                c.next = b;
		            	return temp;
		            }
		            else{							// condition to check if b has reached null
		                c.next = a;
		                return temp;
		            }
	            }
	            else{								// condition to check if either of the head is null
	            	if(a==null)						// condition to check if a is null
	            		return b;	
	            	else							// condition to check if b is null
	            		return a;
	            }
	        }
	        else{
	            
	        if(c.data == 0){					// condition to check whether it is the first element in c
	            if(a.data < b.data){
	                c = a;
	                a = a.next;
	                temp = c;
	            }
	            else{
	                c = b;
	                b = b.next;
	                temp = c;
	            }
	        }
	        else{	
	        	if(a.data < b.data){			// condition to see if element in a is less than element in b
	                c.next = a;
	                a = a.next;
	                c = c.next;
	            }
	            else{
	                c.next = b;
	                b = b.next;
	                c = c.next;
	            }
	        }
	    }
	    }
	    return temp;
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
		
		Node n4 = new Node(3, null, null);
		Node n5 = new Node(4, null, null);
		Node n6 = new Node(6, null, null);
		n4.next = n5;
		n5.next = n6;
		n5.prev = n4;
		n6.prev = n5;
		
		MergeSortedLinkedList msl = new MergeSortedLinkedList();
		System.out.println(msl.MergeLists(n1, n4));

	}

}
