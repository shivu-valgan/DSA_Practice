package LinkedLists.MediumProblems;


public class ReverseALinkedList {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        Node rev = reverseLL(head);
        printList(rev);
    }

    private static void printList(Node head) {
        if(head==null) return;
        Node cur = head;
        while(cur!=null){
            System.out.print(cur.data);
            if(cur.next!=null) System.out.print("->");
            cur = cur.next;
        }
        System.out.println();

    }

    private static Node reverseLL(Node head) {
        if(head==null || head.next==null) return head;
        Node cur = head;
        Node prev = null;
        while(cur!=null){
            Node nxt = cur.next;
            cur.next = prev;
            prev = cur;
            cur = nxt;
        }
        return prev;
    }
}
