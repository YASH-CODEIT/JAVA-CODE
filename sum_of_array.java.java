public class Main {
    public static void main(String[] args) {
        int[] arr = {11, 56, 8, 2, 4};
        sum(arr);
    }

    public static void sum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++)
            sum += arr[i];
        System.out.println(sum);
    }
}
