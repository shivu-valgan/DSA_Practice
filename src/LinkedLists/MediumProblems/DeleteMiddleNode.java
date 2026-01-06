package LinkedLists.MediumProblems;

public class DeleteMiddleNode {
    public ListNode deleteMiddle(ListNode head) {
        if(head==null || head.next==null) return null;
        ListNode fast = head , slow = head, prev = null;
        while(fast!=null && fast.next!=null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = slow.next;
        return head;
    }

    public static void main(String[] args) {
        int[] arr ={1,3,4,7,1,2,6};
        ListNode head = new ListNode(arr[0]);
        ListNode cur = head;
        for(int i=1 ; i< arr.length; i++){
            ListNode temp = new ListNode(arr[i]);
            cur.next=temp;
            cur = temp;
        }
        DeleteMiddleNode d = new DeleteMiddleNode();
        ListNode newNode = d.deleteMiddle(head);
        printList(newNode);
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
