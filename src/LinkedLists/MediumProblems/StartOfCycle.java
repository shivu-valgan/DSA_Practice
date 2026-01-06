package LinkedLists.MediumProblems;

public class StartOfCycle {
    public ListNode detectCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast==slow){
                fast = head;
                while(fast!=slow){
                    fast = fast.next;
                    slow = slow.next;
                }
                return slow;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,2,1};
        ListNode head = new ListNode(arr[0]);
        ListNode cur = head;
        for(int i=1; i<arr.length; i++){
            ListNode temp = new ListNode(arr[i]);
            cur.next=temp;
            cur = temp;
        }
        cur.next = head;
        StartOfCycle s1 = new StartOfCycle();
        ListNode l1 = s1.detectCycle(head);
        System.out.println(l1.val);
    }
}
