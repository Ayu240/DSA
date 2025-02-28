package RUF;
class linledlist {

    Node head;
    private int size;
 
 
    linledlist () {
        size = 0;
    }
 
 
    public class Node {
        String data;
        Node next;
 
 
        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }
    //add frist and last
 
    public void addFirst(String data) {
        Node newNode = new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    //Last
    public void addLast(String data) {
        Node newNode = new Node(data);
 
        if(head == null) {
            head = newNode;
            return;
        }
 
 
        Node lastNode = head;
        while(lastNode.next != null) {
            lastNode = lastNode.next;
        }
 
 
        lastNode.next = newNode;
    }
 
    //printList
    public void printList() {
        Node currNode = head;
 
 
        while(currNode != null) {
            System.out.print(currNode.data+" -> ");
            currNode = currNode.next;
        }
 
 
        System.out.println("null");
    }

    //remove Frist
    public void removeFirst() {
        if(head == null) {
            System.out.println("Empty List, nothing to delete");
            return;
        }
 
 
        head = this.head.next;
        size--;
    }
 
    // removeLast
    public void removeLast(String data) {
        if(head == null) {
            System.out.println("Empty List, nothing to delete");
            return;
        }
 
 
        size--;
        if(head.next == null) {
            head = null;
            return;
        }
 
 
        Node currNode = head;
        Node lastNode = head.next;
    }

 
    public void removeLast() {
        if(head == null) {
            System.out.println("Empty List, nothing to delete");
            return;
        }
 
 
        size--;
        if(head.next == null) {
            head = null;
            return;
        }
 
 
        Node currNode = head;
        Node lastNode = head.next;

        while(lastNode.next != null) {
            currNode = currNode.next;
            lastNode = lastNode.next;
        }
        currNode.next=null;
    }
    public int getSize(){
        
        return size;
    }

    public static void  main (String[] args){
      linledlist list = new linledlist();
        list.addFirst("ty");
        list.addLast("hello");
        list.addFirst("as"+ "1");
        list.addLast("hu");
        list.addLast("wq");
        
        //  list.removeFirst();
        
        list.printList();
        list.getSize();
        
       // list.removeFirst();
        list.removeLast();
        list.printList();


    }
}