
package LinkedLists.SinglyLinkedList;

public class SingleLL {
    Node head = null;

    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
        Node(int data, Node next){
            this.data = data;
            this.next = next;
        }
    }

    public void insertAtPos(int data, int pos) {
        Node newNode = new Node(data);
        if(pos<1) return;
        if(pos==1) {
            newNode.next=head;
            head = newNode;
            return;
        }
        Node curr = head;
        for(int i=1; i<pos-1 && curr!=null; i++){
            curr = curr.next;
        }
        if(curr==null) return;
        newNode.next=curr.next;
        curr.next=newNode;
    }
    void traverse(){
        if(head == null) return;
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node temp = head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next= newNode;
    }
    void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            return;
        }
        newNode.next=head;
        head = newNode;
    }

    void deleteFirst(){
        if(head==null) return;
        head = head.next;
    }
    void deleteLast(){
        if(head==null) return;
        if(head.next==null) {
            head = null;
            return;
        }
        Node curr = head;
        while(curr.next.next!=null){
            curr = curr.next;
        }
        curr.next=null;
    }
    void deletePos(int pos){
        if(pos<1) return;
        if(pos==1) {
            head = null;
            return;
        }
        Node curr = head;
        for(int i=1; i<pos-1 && curr!=null; i++){
            curr = curr.next;
        }
        if(curr==null || curr.next==null) return;
        curr.next = curr.next.next;
    }

    void deleteVal(int val){
        if(head == null) return;
        if(head.data==val) {
            head = head.next;
            return;
        }
        Node curr = head;
        Node prev = null;
        while(curr!=null){
            if(curr.data == val){
                prev.next = curr.next;
                return;
            }
            prev = curr;
            curr = curr.next;
        }
        System.out.println("There is no such value");
    }

    boolean search(int key){
        if(head == null) return false;
        Node cur = head;
        while(cur!=null){
            if(cur.data==key) return true;
            cur = cur.next;
        }
        return false;
    }
}
class MainClass{
    public static void main(String[] args) {
        SingleLL l1 = new SingleLL();

        l1.addLast(40);
        l1.addLast(41);
        l1.traverse();
        System.out.println("__________________________________________________________");

        l1.addFirst(25);
        l1.traverse();
        System.out.println("__________________________________________________________");

        l1.insertAtPos(34,2);
        l1.traverse();
        System.out.println("__________________________________________________________");


    }
}
