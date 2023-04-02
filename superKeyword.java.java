class A{ //Parent class
    int a=10; //instance variable
}
class B extends A{  //child class
    int a=20; //instance variable
    void show(int a){
        System.out.println(a); //refer to the parameter variable
        System.out.println(this.a); //refer to the instance variable of a current class
        System.out.println(super.a); //refer to the instance variable of a parent class
    }

}
class Main{
    public static void main(String []args){
        B obj=new B();
        obj.show(30);
    }
}