public class Main{
    public static int findPivot(int arr[]){
        int arrSum=0;
        for(int i=0;i<arr.length;i++){
            arrSum=arrSum+arr[i];
        }
        int lSum=0;
        int rSum=arrSum;
         for(int i=0;i<arr.length;i++){
              if(i==0){
                  lSum=0;
                  rSum=rSum-arr[i];
              }
              else{
              lSum=lSum+arr[i-1];
              rSum=rSum-arr[i];
              }
          if(lSum==rSum){
              System.out.println(arr[i]);
              return arr[i];
          }
          }
          return -1;
    }
    public static void main(String []args){
        int arr[]={1,2,3};
        System.out.println(findPivot(arr));
       
}
}