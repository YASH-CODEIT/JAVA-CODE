 public class CircularQueueDS{
    static class CircularQueue{             //declaring a class CircularQueue
static int arr[];                           //declaring a array
static int size;                            //declaring a variable size
static int front=-1;                        //declaring and intializing a variable font=-1
static int rear=-1;                         //declaring and intializing a variable rear=-1
CircularQueue(int n){                       //constructor to intialize the size of array
    arr=new int [n];
    this.size=n;
}
static boolean isEmpty(){                  //check whether the array is empty or not
    return front==-1 && rear==-1;
}
static boolean isFull(){                   //check whether the array is full or not
    return (rear+1)%size==front;
}
static void enqueue(int data){            //insert a element
if(isFull()){                             //check whether a queue is full or not
    System.out.println("Queue is full.No more element is insert");
    return;
}
if(front==-1){                           //update the value of front
front=0;
}
rear=(rear+1)%size;                     //update the value of rear
arr[rear]=data;                         //insert a data at rear value in array
}
static int dequeue(){                  //delete a element
    if(isEmpty()){                     //check whether a queue is empty or not
        System.out.println("Queue is Empty.No more element is deleted");
        return -1;
}
int result=arr[front];                 
if(front==rear){                      //if only one element left
    front=-1;
    rear=-1;
}
else{
front=(front+1)%size;
}
return  result;
}
static int peek(){                          //return the front element 
    if(isEmpty()){                          //check whether queue is empty or not
        System.out.println("Queue is Empty."); 
        return -1;
    }
  return arr[front];
}
    }
    public static void main(String []args){
CircularQueue cq=new CircularQueue(5);
cq.enqueue(10);
 cq.enqueue(40);
 cq.enqueue(90);
 cq.enqueue(23);
 cq.enqueue(79);
 cq.enqueue(25);
 cq.dequeue();
 cq.dequeue();
 cq.enqueue(23);
 while(!cq.isEmpty()){
    System.out.println(cq.peek());
    cq.dequeue();
 }
    }
}