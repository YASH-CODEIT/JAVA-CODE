import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.IOException;
import java.io.FileWriter;
 public  class FileHandling{
     public static void main(String []args){
         //creating a File
      /*  try {
             File f = new File("d://abc.txt");
             if (f.createNewFile()) {
                 System.out.println("File is created successfully!!!");
             } else {
                 System.out.println("File is not Created");
             }
         }
         catch(IOException e){
             e.printStackTrace();
         }*/

         //read a file
        /* try {
             File f=new File("d://abc.txt");
             Scanner read=new Scanner(f);
             while (read.hasNextLine()) {
                 String data = read.nextLine();
                 System.out.println(data);
             }
            read.close();
         }
         catch(FileNotFoundException e1){
             e1.printStackTrace();
         }*/

         //write a file
         /*try {
             File f = new File("d://abc.txt");
             FileWriter write = new FileWriter(f);
             write.write("This is Third Line");
             write.close();
         }
         catch(IOException e2){
             e2.printStackTrace();
         }*/


         //deleted a file
       /*  File f=new File("d://abc.txt");
         if(f.delete()){
             System.out.println("File is successfully Deleted!!!");
         }
         else{
             System.out.println("File is not deleted");
         }*/
     }
 }