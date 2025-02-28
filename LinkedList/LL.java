public class LL {
    Node head;
    private int size;
 
 
       LL () {
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
 
 
        Node currNode-*=  = head;
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

    //Reverse 
    public void reverseIterate(){
        if(head==null || head.next==null){
            return;
        }

       Node prevNode=head;
       Node currNode=head.next;
       while (currNode!=null) {
        Node nextNode=currNode.next;
        currNode.next=prevNode;
        //update
        prevNode=currNode;
        currNode=nextNode;
       } 
       head.next=null;
       head=prevNode;
    }

    public Node reverseRecursive(Node head){
        if(head==null || head.next==null){
            return head;
        }
        Node newHead=reverseRecursive(head.next);
        head.next.next=head;
        head.next=null;

        return newHead;
    }

    public int getSize(){
        
        return size;
    }
    
    public static void main(String[] args) {
        LL list=new LL();
        
        list.addLast("as01");
        list.addLast("as002");
        list.addLast("as003");
        list.addLast("as004");
        list.addLast("as005");
        
        
        
        list.printList();
       
       list.head= list.reverseRecursive(list.head);
        list.printList();
        
    }
}
