class Main{
    public  static void  main(String []args){
        int arr[]={4,5,2,6,9};
        int i,j,current;
        for(i=1;i<arr.length;i++){                      //Insertion Sort
            current=arr[i];
            j=i-1;
            while(j>=0 && current<arr[j]){             //pushing element at j+1 index
                arr[j+1]=arr[j];
                j--;                                  //decrement the value of j
            }
            arr[j+1]=current;
        }
        for(j=0;j<arr.length;j++){                      //printing of an array
            System.out.print(arr[j]+" ");
        }
    }
}
