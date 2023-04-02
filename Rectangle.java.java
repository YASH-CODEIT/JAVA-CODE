package com.java;
class Rectangle{
    int length;
    int width;
    void setLB(int length,int width){
        this.length=length;
        this.width=width;
    }
    int getArea(){
        return length*width;
    }
    int getPerimeter(){
        return  (2*(length+width));
    }
    public static void main (String []args){
Rectangle obj=new Rectangle();
        obj.setLB(3,9);
        System.out.println("Area: "+obj.getArea());
        System.out.println("Perimeter: "+obj.getPerimeter());
    }
}