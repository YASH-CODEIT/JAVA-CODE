public class Main {
    static int a; //declare first static variable
    static int b;//declare second static variable
    //It executed first
    static{
        a=10;//static variable only access inside static method
        System.out.println("I am in first static block!!!");
        System.out.println("The value of a is: "+a);
    }
    public static void main(String []args){
        //It executed after the first and second  static function
        System.out.println("I am in main block!!!");
    }
    //It executed second
    static{
        b=a;//static variable only access inside static method
        System.out.println("I am in second static block!!");
        System.out.println("The value of b is: "+b);
    }
}