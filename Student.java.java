package com.java;


public class Student {
    int rollNum;
    String studName;
    int marks1;
    int marks2;
    int marks3;
    int totalMarks;
    public void setStudentDetails(int rollNum,String studName,int marks1,int marks2,int marks3){
        this.rollNum=rollNum;
        this.studName=studName;
        this.marks1=marks1;
        this.marks2=marks2;
        this.marks3=marks3;
    }
    public void calcTotalMarks(){
        totalMarks=marks1+marks2+marks3;
    }
    public void displayStudDetail(){
        System.out.println("Roll NO: "+rollNum+"\nStudent Name: "+studName+"\nTotal Marks: "+totalMarks+"/300");
    }
    public static void main(String []args){
        Student sourabh=new Student();
        sourabh.setStudentDetails(24,"Sourabh",90,78,59);
        sourabh.calcTotalMarks();
        sourabh.displayStudDetail();
        Student shivam=new Student();
        shivam.setStudentDetails(25,"Shivam",90,95,80);
        shivam.calcTotalMarks();
        shivam.displayStudDetail();
        Student yash=new Student();
        yash.setStudentDetails(26,"Yash",95,98,89);
        yash.calcTotalMarks();
        yash.displayStudDetail();
    }
}