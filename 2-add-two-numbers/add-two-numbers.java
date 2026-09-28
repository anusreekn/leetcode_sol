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
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2)
     {
         ListNode dummy=new ListNode();
         ListNode c1=l1;
         ListNode c2=l2;
         ListNode c3=dummy;
         int carry=0;
         while(c1!=null || c2!=null || carry!=0 )
         {
            int val1= (c1!=null)?c1.val:0;
            int val2=(c2!=null)?c2.val:0;
            int sum=val1+val2+carry;
            int digit=sum%10;
            carry=sum/10;
            c3.next = new ListNode(digit);
            c3=c3.next;
             if(c1!=null)
            {
                c1=c1.next;
            }
            if(c2!=null)
            {
            c2=c2.next;
             }

         } 
        return dummy.next;
           
    }
}