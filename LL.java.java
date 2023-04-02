 class LL {
    Node head;
    private int size;
    LL(){
        size=0;
    }
    public  class Node{
        String data;
        Node next;


         Node(String data){
            this.data=data;
            this.next=null;
            size++;
        }
    }
    public void addFirst(String data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
           head= newNode;
           return;
        }
        newNode.next=head;
        head=newNode;
    }
    public void addLast(String data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=newNode;
            return;
        }
         Node lastNode=head;
        while(lastNode.next!=null){
            lastNode=lastNode.next;
        }
        lastNode.next=newNode;
    }
    public void printList(){
        if(head==null){
            System.out.println("List is empty");
        }
        Node currNode=head;
        while(currNode!=null){
            System.out.print(currNode.data+"->");
            currNode=currNode.next;
        }
        System.out.println("null");
    }
    public void removeFirst(){
        if(head==null){
            System.out.println("There is no element to remove.");
            return;
        }
        head=this.head.next;
        size--;
    }
    public void removeLast(){
        if(head==null){
            System.out.println("There is no element to remove.");
            return;
        }
        size--;
        if(head.next==null){
            head=null;
            return;
        }
        Node currNode=head;
        Node lastNode=head.next;
        while(lastNode.next!=null){
            lastNode=lastNode.next;
            currNode=lastNode;
        }
        currNode.next=null;
    }
    public int  getSize(){
        return size;
    }

    public void insertAtMiddle(int index,String data) {
        if(index<0 || index>size ){
            System.out.println("Invalid Index  index");
            return;
        }
        size++;
        Node newNode = new Node(data);
        if(head==null || index==0){
            newNode.next=null;
            head=newNode;
            return;
        }
        Node currNode = head;
        for (int i = 1; i < index-1; i++) {
            currNode = currNode.next;
        }
        newNode.next = currNode.next;
        currNode.next = newNode;
    }
    public static void main(String []args){

LL list=new LL();


    }
}
