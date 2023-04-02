package com.java;
 class Circle{
     float r;
     void setRadius(float r){
         this.r=r;
     }
     float getArea(){
         return 3.14f*r*r;
     }
     float getPerimeter(){
         return 2*3.14f*r;
     }
     public static void main(String []args){
        Circle obj=new Circle();
        obj.setRadius(7.0f);
         System.out.println(obj.getArea());
         System.out.println(obj.getPerimeter());
     }
 }