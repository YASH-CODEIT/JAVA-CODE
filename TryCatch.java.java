public class TryCatch {
    public static void main(String[] args) {
        //1 combination
       /* try {
            int a = 10;
            int b = 0;
            int c = a / b;
            System.out.println("Division");
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }*/
        //Single try Block is not allowed in java
     /*   try{
            int a=10;
            int b=0;
            int c=a/b;
            System.out.println("Division");
        }*/

        //Single catch Block is not allowed in java
      /*  catch(Exception e){
            System.out.println(e);
        }*/


        //If we declare Parent class(Exception Class) then there is no need to decleared
        //Class because Exception classs is a parent class of all exception in java.

     /*   try{
            String str="Hello World";
            System.out.println(str.charAt(11));
        }
        catch(Exception e){
            System.out.println(e);
        }
        catch(StringIndexOutOfBoundsException e1){
            System.out.println(e1.getMessage());
        }*/

        //2 combination
        //It is allowed in java if first class is child class then the other class is parent class
       /* try {
            String str = "Hello World";
            System.out.println(str.charAt(11));
        } catch (StringIndexOutOfBoundsException e1) {
            System.out.println(e1.getMessage());
        } catch (Exception e) {
            System.out.println(e);
        }*/

        // 3 combination
   /*     try {
            int a = 10;
            int b = 0;
            int c = a / b;
            System.out.println("Division");
            String str = "Hello World";
            System.out.println(str.charAt(11));
        } catch (ArithmeticException e) {
            e.printStackTrace();
        } catch (StringIndexOutOfBoundsException e1) {
            System.out.println(e1.getMessage());
        }*/

        //4 combination
        //Nested try catch
       /* try{
            int arr1[]={3,6,8,2,9,0,6,10};
            System.out.println("Element at index 5 is : "+arr1[4]);
            try {
                int a = 10;
                int b = 0;
                int c = a / b;
                System.out.println("Division");
            }
            catch(ArithmeticException e){
                e.printStackTrace();
            }
            try {
                String str = "Hello World";
                System.out.println(str.charAt(11));
            }
            catch(StringIndexOutOfBoundsException e1){
                e1.printStackTrace();
            }

        }
        catch(ArrayIndexOutOfBoundsException e2){
            e2.printStackTrace();
        }*/

        //5 combination
     /*   try{
            String str = "Hello World";
            System.out.println(str.charAt(11));
        }
        catch(ArithmeticException e3){
            e3.printStackTrace();
        }
        finally{
            System.out.println("This block is always executed");
        }*/

        //6 combination
       /* try {
            int a = 10;
            int b = 0;
            int c = a / b;
            System.out.println("Division");
        }
       finally{
            System.out.println("This block is always executed");
        }*/

        //It does not allow in java  we cannot write only finally block.Finally Block is wrie with
        //try,try and catch block.
       /* finally{

        }*/

        //7 combination
       /* try{
            int a=10;
            int b=5;
            int c=a/b;
            System.out.println("If we divided 10 to 5 The answer is : "+c);
        }
        catch(ArithmeticException e4){
            e4.printStackTrace();
        }
        finally{
            System.out.println("This block is always executed.");
            try{
                int arr1[]={3,6,8,2,9,0,6,10};
                System.out.println("Element at index 5 is : "+arr1[4]);
            }
            catch(ArrayIndexOutOfBoundsException e5){
                e5.printStackTrace();
            }
            try{
                String str = "Hello World";
                System.out.println(str.charAt(11));
            }
            catch(ArithmeticException e3){
                e3.printStackTrace();
            }
        }*/

        //8 combination
       /* try{

        }
        catch(ParentException e){
            try{

            }
            catch(ChildException e){

            }
        }*/

        //9 combination
     /*   try{

        }
        finally{

        }
        try{

        }
        catch{

        }*/
    }
}