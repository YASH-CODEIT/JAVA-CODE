import java.util.Scanner;

class New
{
  
public static void main (String[]args)
  {
    
int size;
    
boolean isAscending = true;
    
Scanner sc = new Scanner (System.in);
    
System.out.println ("Enter the size of an array :");
    
size = sc.nextInt ();
    
int arr[] = new int[size];
    
System.out.println ("Enter the element of an array :");
    
for (int i = 0; i < arr.length; i++)
      {
	
arr[i] = sc.nextInt ();
    
} 
for (int i = 0; i < arr.length - 1; i++)
      {
	
if (arr[i] > arr[i + 1])
	  
isAscending = false;
      
}
    
if (isAscending)
      
System.out.println ("The array is in ascending order");
    
    else
      
System.out.println ("The array is not in ascending order");
  
}

}


