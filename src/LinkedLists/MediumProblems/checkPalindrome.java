package LinkedLists.MediumProblems;

class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }


public class checkPalindrome {
    public static void main(String[] args) {
        int[] arr = {1,2,3,2,1};
        ListNode head = new ListNode(arr[0]);
        ListNode cur = head;
        for(int i=1; i<arr.length; i++){
           ListNode temp = new ListNode(arr[i]);
           cur.next=temp;
           cur = temp;
        }
        Solution s1 = new Solution();
        System.out.println(s1.isPalindrome(head));
    }
}
class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null) return true;
        ListNode slow = head, fast = head;
        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode newHead = reverse(slow.next);
        ListNode first = head, second = newHead;
        while(second!=null){
            if(first.val!=second.val){
                reverse(newHead);
                return false;
            }
            second = second.next;
            first = first.next;
        }
        reverse(newHead);
        return true;
    }
    private ListNode reverse(ListNode head){
        if(head==null || head.next==null) return head;
        ListNode cur = head, prev = null;
        while(cur!=null){
            ListNode nxt = cur.next;
            cur.next = prev;
            prev = cur;
            cur = nxt;
        }
        return prev;
    }
}
