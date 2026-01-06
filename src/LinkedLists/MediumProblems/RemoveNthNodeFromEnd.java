package LinkedLists.MediumProblems;

public class RemoveNthNodeFromEnd {
    public static void main(String[] args) {
        int[] arr = {1,2,3,2,1};
        ListNode head = new ListNode(arr[0]);
        ListNode cur = head;
        for(int i=1; i<arr.length; i++){
            ListNode temp = new ListNode(arr[i]);
            cur.next=temp;
            cur = temp;
        }
        RemoveNthNodeFromEnd s1 = new RemoveNthNodeFromEnd();
        System.out.println(s1.removeNthFromEnd(head,2));
        printList(head);
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fast = head, slow = head;
        for(int i=1; i<=n; i++){
            fast = fast.next;
        }
        if(fast==null) return head.next;
        while(fast.next!=null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return head;
    }

    private static void printList(ListNode head) {
        if(head==null) return;
        ListNode cur = head;
        while(cur!=null){
            System.out.print(cur.val);
            if(cur.next!=null) System.out.print("->");
            cur = cur.next;
        }
        System.out.println();

    }
}

