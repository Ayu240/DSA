public class curcularQ {
    static class Queue{
        static int arr[];
        static int size;
        static int rear=-1;
        static int front=-1;

        Queue(int n){
          arr=new int[n];
          this.size=n;
        }
        
        public static boolean isEmpty(){
            return rear==-1 && front==-1;
        }
        public static boolean isFull(){
            return (rear+1)%size==front;
        }

        //enqueue
        public static void add( int data){
            if(isFull()){
                System.out.println("Empty queue");
                return;
            }
            if(front==-1){
                front=0;
            }
            rear=(rear+1)%size;
            arr[rear]=data;
        }
           
            //dequeue
        public static int remove(){
            if(isEmpty()){
                System.out.println("empty queue");
                return-1;
            }
            int result=arr[front];
                if(rear==front){
                    rear=front=-1;
                }else{
                  front=(front+1)%size;
                }
                return result;
            
            }
            //peek
            public static int peek(){
                if(isEmpty()){
                    System.out.println("empty queue");return-1;
                }
                return arr[front];
            }
        }
    
    public static void main(String []args){
        Queue a=new Queue(5);
       
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4); 
        a.add(5);
        System.out.println(a.remove());
        a.add(6);
        System.out.println(a.remove());
        a.add(7);

        while (!a.isEmpty()) {
            System.out.println(a.peek());
            a.remove();
        }

    }
}
