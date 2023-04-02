public class Main {
    public static void reverseString(char arr[],int index) {
        if(index==0){
            System.out.print(arr[0]);
            return;
        }
        System.out.print(arr[index]);
        reverseString(arr,index-1);
    }
    public static void main(String args[]) {
        char []arr={'Y','a','s','h'};
        System.out.println("The string is: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
        System.out.println("");
        int index=arr.length;
        System.out.println("The reverse of string is: ");
        reverseString(arr,index-1);
    }
}