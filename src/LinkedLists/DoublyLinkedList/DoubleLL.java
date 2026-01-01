package LinkedLists.DoublyLinkedList;


public class DoubleLL {
    Node head;
    class Node{
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
        }
    }
    public void add(int data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
        }
        else{
            Node cur = head;
            while(cur.next!=null){
                cur = cur.next;
            }
            cur.next=newNode;
            newNode.prev=cur;
        }

    }

    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head==null) head=newNode;
        else{
            newNode.next=head;
            head.prev=newNode;
            head = newNode;
        }
    }

    public void addPos(int data, int pos){
        Node newNode = new Node(data);
        if(pos<1) return;
        if(pos==1){
            newNode.next=head;
            if(head!=null){
                head.prev=newNode;
            }
            head=newNode;
            return;
        }
        Node cur = head;
        for(int i=1; i<pos-1 && cur!=null; i++){
            cur = cur.next;
        }
        if(cur==null) return;
        newNode.next=cur.next;
        newNode.prev=cur;
        cur.next=newNode;
        if(newNode.next!=null){
            newNode.next.prev=newNode;
        }
    }

    public void deleteFirst(){
        if(head == null) return;
        head = head.next;
        if(head!=null) head.prev=null;
    }
    public void deleteLast(){
        if(head == null) return;
        if(head.next==null){
            head=null;
            return;
        }
        Node cur = head;
        while(cur.next.next!=null){
            cur = cur.next;
        }
        cur.next.prev=null;
        cur.next=null;
    }
    public void deletePos(int pos){
        if(pos<1 || head==null) return;
        if(pos==1){
            head = head.next;
            if(head!=null){
                head.prev=null;
            }
            return;
        }
        Node cur = head;
        for(int i=1; i<pos-1 && cur!=null; i++){
            cur = cur.next;
        }
        if(cur==null || cur.next==null) return;
        cur.next = cur.next.next;
        if(cur.next!=null) {
            cur.next.prev = cur;
        }
    }
    public void deleteVal(int val){
        if(head == null) return;
        if(head.data==val) {
            head = head.next;
            if(head!=null) head.prev=null;
            return;
        }
        Node cur = head;
        while(cur!=null){
            if(cur.data==val){
                cur.prev.next=cur.next;
                if(cur.next!=null) cur.next.prev = cur.prev;
                return;
            }
            cur=cur.next;
        }
    }

    public void printList(){
        if(head == null) return;
        Node cur = head;
        while(cur!=null){
            System.out.print(cur.data+"->");
            cur = cur.next;
        }
        System.out.print("null");
        System.out.println();
    }

    public boolean search(int key){
        if(head == null) return false;
        Node cur = head;
        while(cur!=null){
            if(cur.data==key) return true;
            cur = cur.next;
        }
        return false;
    }

    public void reverse(){
        if(head==null || head.next==null) return;
        Node cur = head;
        Node temp = null;
        while(cur!=null){
            temp = cur.prev;
            cur.prev = cur.next;
            cur.next = temp;

            cur = cur.prev;
        }
        head = temp.prev;

    }
}
 class MainClass{
    public static void main(String[] args) {
        DoubleLL l1 = new DoubleLL();
        l1.add(10);
        l1.add(20);
        l1.add(30);
        l1.addFirst(5);
        l1.addPos(2,3);
        l1.deletePos(6);
        l1.printList();
        l1.reverse();
        l1.printList();
    }
}
