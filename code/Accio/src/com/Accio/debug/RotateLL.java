package com.Accio.debug;

public class RotateLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		head.next.next.next.next = new ListNode(5);
		Solution1 s1 = new Solution1();
		ListNode node =s1.rotateRight(head, 8);
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


class Solution1 {
    public ListNode rotateRight(ListNode head, int k) {
        
        ListNode dummy = new ListNode();
        dummy.next = head;
        
        ListNode first = head;
        
        
        int count =0;
        
        if(head == null || k==0){
            return head;
        }
        
        while(first != null){
            count =   count + 1;
            first =   first.next;
        }
        
         k = k % count;
        
        first = head;
        
        
        for(int i=0;i<k;i++){
            
            
            first = first.next;
        }
        
        ListNode prev = dummy;
        
        while(first.next != null){
            prev = head;
            head = head.next;
            first = first.next;
        }
        
        
        first.next = dummy.next;
        prev = head;
        head = head.next;
        prev.next = null;
        
        return head;
        
    }
}
