class Main{
    public static void printReversNo(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        printReversNo(n-1);
    }
    public static void main(String[] args){
    printReversNo(10);
    }
}