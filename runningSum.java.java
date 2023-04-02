public class Main{
    public static int[] runningSum(int nums[]){
        for(int i=1;i<nums.length;i++){
            nums[i]=nums[i-1]+nums[i];
        }
        return nums;
    }
    public static void printarray(int nums[]){
        System.out.print("[");
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+",");
        }
        System.out.println("]");
    }
    public static void main(String []args){
        int nums[]={1,2,3,4};
        System.out.print("Before the runningSum the array is: ");
        printarray(nums);
        runningSum(nums);
         System.out.println("After the runningSum the array is: ");
         printarray(nums);
    }
}
