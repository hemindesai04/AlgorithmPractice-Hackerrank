package linkedList;

public class reverseDoubly {
	@SuppressWarnings("null")
	Node Reverse(Node head) {
		Node a = head;
	    Node temp = new Node(0, null, null);
	    if(a == null)
	        return null;
	    else{
	    	do{
	        
	        
	            if(a.prev == null){
	                temp = a.next;
	                a.next = null;
	                a.prev = temp;
	                a = a.prev;
	            }
	            else if(a.next == null){
	                temp = a.next;
	                a.next = a.prev;
	                a.prev = temp;
	                return a;
	            }
	            else{
	            	temp = a.next;
	                a.next = a.prev;
	                a.prev = temp;
	                a = a.prev;
	            }
	           
	        }
	    	while(a != null);
	    		
	    
	        return a;
	    }
	    }
	    
	
	public static void main(String[] args){
		Node n1 = new Node(1, null, null);
		Node n2 = new Node(2, null, null);
		Node n3 = new Node(5, null, null);
		n1.next = n2;
		n2.next = n3;
		n2.prev = n1;
		n3.prev = n2;
		
		reverseDoubly rd = new reverseDoubly();
		
		System.out.println(rd.Reverse(n1));
	}

}
