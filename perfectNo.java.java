import java.util.Scanner;
public class Main {
    public static void perfectNo(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        if (sum == n)
            System.out.println("It is a perfect no");
        else
            System.out.println("It is not a prime no");
        return;
    }
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to check whether it is a prefect No or not: ");
        n=sc.nextInt();
        perfectNo(n);
    }
}