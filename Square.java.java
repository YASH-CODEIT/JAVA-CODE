package com.java;

public class Square {
    int x;
    public void setSide(int a){
        x=a;
    }
    public int getArea(){
        return x*x;
    }
    public int getPerimeter(){
        return 4*x;
    }
    public static void main(String []args){
        Square obj=new Square();
        obj.setSide(2);
        System.out.println(obj.getArea());
        System.out.println(obj.getPerimeter());
    }
}
