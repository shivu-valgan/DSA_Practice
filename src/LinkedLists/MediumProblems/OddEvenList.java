package LinkedLists.MediumProblems;

public class OddEvenList {
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null ) return head;
        ListNode odd = head , even = head.next , evenHead = even;
        while(even!=null && even.next != null){
            odd.next = odd.next.next;
            even.next = even.next.next;
            odd = odd.next;
            even = even.next;
        }
        odd.next = evenHead;
        return head;
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
            OddEvenList o1 = new OddEvenList();
            o1.oddEvenList(head);
            printList(head);

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
