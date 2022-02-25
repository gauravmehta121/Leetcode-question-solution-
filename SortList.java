// Use merge sort. Find the middle element and recursively partition to get each node. Finally merge/combine them together.

// TC : O(nlogn)
// SC : recursion -> internal stack used


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
 
 
 
 Class solution {
 // merge
  public ListNode combine (ListNode left, ListNode right)
  {
  if (left==null) return right;
  if(right = null ) return left;
  
   if(left.val<= right.vak) 
   head = left ;
   head.next = combine (left.next,right)
    
    else{
    head = right;
    head.next = combine (left, right.next);
    }
    
    return head;
    
 
 
 
 
 
 Public ListNode sortList (ListNode head )
 {
 if (head == null || head .next == null)
 return head;
 
 
 ListNode slow = head , fast = head.next;
 
 while(fast!=null && fast.next !=null)
 {
 slow = slow.next ;
 fast = fast.next;
 }
 ListNode  left = head , right = slow.next;
 slow.next=null;
 
 left = sortlist(left);
 right = sortlist(right);
 
 return combine(left, right );
 
