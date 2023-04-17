package com.Accio.debug;

public class Reverse2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		head.next.next.next.next = new ListNode(5);
		head.next.next.next.next.next = new ListNode(6);
		Solution s1 = new Solution();
		ListNode node = s1.reverseBetween(head,2,5);
		print(node);
		
	}
	
	  public static void print( ListNode head){
	    	 ListNode temp =  head;
	    	 while(temp != null) {
	    		 System.out.print(temp.val+" ");
	    		 temp = temp.next;
	    	 }
	    	 
	     }

}


       class ListNode {
	      int val;
	      ListNode next;
	      ListNode() {}
	     ListNode(int val) { this.val = val; }
	     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	     
	   
	 }



class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        
        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode leftNode = head,rightNode = head,prev=dummy,nextNode=null; 
        
        for(int i = 1;i <= right-1; i++){
            
            if(i<=left-1 && leftNode != null){ prev = leftNode; leftNode = leftNode.next; }
            
            if(rightNode != null){ rightNode = rightNode.next;}
        }
        
        nextNode = rightNode.next;
        ListNode current = leftNode.next,previous = leftNode,next = null;
        
         for(int i=0;i<right-left;i++){
            next = current.next;
             current.next = previous;
             previous = current;
             current = next;
        }
        
        
        prev.next = rightNode;
       leftNode.next= nextNode;
        
        
       
        
        return dummy.next;
    }
}
