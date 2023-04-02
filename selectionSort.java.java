class Main {
    public static void main(String[] args) {
        int arr[] = {7, 8, 3, 1, 2};
        int i,j;
        //Selection sort
      for(i=0;i<=arr.length-2;i++){               //outer loop-for traverse array
          int smallest=i;
          for(j=i+1;j<=arr.length-1;j++){         //inner loop-for compare element
              if(arr[j]<arr[smallest]){
                  smallest=j;
              }
          }
          int temp=arr[smallest];                  //for swap two element
          arr[smallest]=arr[i];
          arr[i]=temp;
      }
      for(i=0;i<arr.length;i++){
          System.out.print(arr[i]+" ");
      }
    }
}
