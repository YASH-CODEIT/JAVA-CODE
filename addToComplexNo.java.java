class Complex{
    int real;
    int img;
        Complex(int real,int img){
            this.real=real;
            this.img=img;
        }
        void add(Complex c){
            real=real+c.real;
            img=img+c.img;
        }

    void print(){
        System.out.println("The complex no is: "+real+"+"+img+"i");
    }

    public static void main(String []args){
        Complex c1=new Complex(4,10);
        c1.print();
        Complex c2=new Complex(8,20);
        c2.print();
        c2.add(c1);
        System.out.println("The sum of two Complex No is: "+c2.real+"+"+c2.img+"i");

    }

}