package Linkedlist;
import java.util.*;
public class Lc143 {
    class ListNode {
        int val;
        ListNode next;
        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }
    public ListNode reorderList(ListNode head){
        if(head==null || head.next==null){
            return head;
        }
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode second = slow.next;
        slow.next=null;
        ListNode prev=null;
        ListNode curr=second;
        while(curr!=null){
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        ListNode first = head;
         second = prev;
        while(second!=null){
            ListNode temp1 = first.next;
            ListNode temp2 = second.next;
            first.next=second;
            second.next=temp1;
            first=temp1;
            second=temp2;
        } 
        return head;
        }
        public static void main(String[] args) {
            Lc143 obj = new Lc143();
            ListNode head = obj.new ListNode(1);
            head.next = obj.new ListNode(2);
            head.next.next = obj.new ListNode(3);
            head.next.next.next = obj.new ListNode(4);
            head.next.next.next.next = obj.new ListNode(5);
            head = obj.reorderList(head);
            while(head!=null){
                System.out.print(head.val+" ");
                head=head.next;
            }
        }
    }
        
