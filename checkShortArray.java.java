class Main{
    public static boolean checkArrayShort(int []arr,int indx){
        if(indx==(arr.length-1)){
            return true;
        }
        if(arr[indx]>=arr[indx+1]){
            return false;
        }
        return checkArrayShort(arr,indx+1);
    }
    public static void main(String []args){
        int []arr={1,2,3,4,6};
        System.out.println("Array is sorted True or False: "+checkArrayShort(arr,0));
    }
}