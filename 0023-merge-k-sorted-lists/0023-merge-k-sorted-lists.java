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
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> minheap=new PriorityQueue<>((a,b)->{
            return a.val-b.val;
        });
        for(ListNode L:lists){
            if(L!=null){
                minheap.add(L);
            }
        }
        ListNode dummy=new ListNode(-1);
        ListNode prev=dummy;
        while(minheap.size()>0){
            ListNode temp=minheap.remove();
            prev.next=temp;
            prev=prev.next;
            temp=temp.next;
            if(temp!=null){
                minheap.add(temp);
            }
        }
        return dummy.next;
        
    }
}