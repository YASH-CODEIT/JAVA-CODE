import java.util.Scanner;

class New
{
  
public static void main (String[]args)
  {
    
int size;
    
Scanner sc = new Scanner (System.in);
    
System.out.println ("Enter the size of an array: ");
    
size = sc.nextInt ();
    
int arr[] = new int[size];
    
int max = arr[0];
    
System.out.println ("Enter the element of an array: ");
    
for (int i = 0; i < arr.length; i++)
      {
	
arr[i] = sc.nextInt ();
    
} 
for (int i = 0; i < arr.length; i++)
      {
	
if (max < arr[i])
	  {
	    
max = arr[i];
	  
}
      
}
    
System.out.println ("The maximum element of an array is: ");
    
System.out.println (max);
    
int min = arr[0];
    
for (int i = 0; i < arr.length; i++)
      {
	
if (min > arr[i])
	  {
	    
min = arr[i];
	  
}
      
}
    
System.out.println ("The minimum element of an array is : ");
    
System.out.println (min);
  
}

}


