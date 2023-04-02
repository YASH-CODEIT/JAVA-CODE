public class QueueDs {
    //declaring a class Queue.
    public static class Queue{
        //declaring a array.
        static int []arr;
        //declaring a size.
        static int size;
        //initialize or declaring a rear variable.
        static int rear=-1;
        //invoke a class consture and initialize a size of a arrary.
        Queue(int n){
            arr=new int [n];
            size=n;
        }
        //check whether the queue is empty or not
        public static boolean isEmpty(){
         return rear==-1;
        }
        //check whether the queue is full or not
        public static boolean isFull(){
            return rear==size-1;
        }
        //adding a element in a queue
        public static void enqueue(int data){
            if(isFull()){
                System.out.println("Queue is full. no more element is insert");
                return;
            }
            rear++;
            arr[rear]=data;
        }
        //deleting a element in a queue and return the element
        public static int dequeue(){
            if(isEmpty()){
                System.out.println("Queue is Empty. no more element to deleted");
                return -1;
            }
           int front=arr[0];
            for(int i=0;i<rear;i++){
                arr[i]=arr[i+1];
            }
            rear--;
            return front;
        }
        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is Empty!!");
                return -1;
            }
            return arr[0];
        }

    }
    public static void main(String []args){
        Queue q=new Queue(6);
        q.enqueue(5);
        q.enqueue(4);
        q.enqueue(6);
        q.enqueue(8);

       while(!q.isEmpty()) {
           System.out.println(q.peek());
           q.dequeue();
       }
    }
}
