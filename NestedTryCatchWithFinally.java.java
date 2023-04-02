public class NestedTryCatchWithFinally {
    public static void main(String []args){
        try{
           int arr[]={3,5,6,2,9,10,7,5};
            System.out.println("Element at index 10 is : "+arr[10]);
                int a=10;
                int b=0;
                int res=a/b;
                System.out.println("Division");
                System.out.println(res);
        }
        catch(ArrayIndexOutOfBoundsException e2){
            System.out.println("ArrayIndexOutofBoundsException");
        }
        catch(ArithmeticException e1){
            System.out.println("Sorry! Division by zero is not possible.");
            System.out.println("Further exception.");
        }
        finally {
            System.out.println("Finally Block is always executed");
        }
    }
}
