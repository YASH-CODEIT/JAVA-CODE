class Sum{
    Sum(){
        this(5,15);
        System.out.println("Default Sum Constructor called!!!");
    }
    Sum(int a,int b){
        this(5,15,15);
        System.out.println("The sum of a and b is : "+(a+b));
    }
    Sum(int a,int b,int c){
        System.out.println("The sum of a, b and c is : "+(a+b+c));
    }
}
class Product extends Sum{
    Product(){
        this(5,15);
        System.out.println("Default product Constructor called!!!");
    }
    Product(int a,int b){
        super(5,15);
        System.out.println("The product of a and b is: "+(a*b));
    }
}
class Sum1{
    public static void main(String []args){
        new Product();
    }
}