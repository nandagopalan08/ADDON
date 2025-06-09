package dsa_java;
import java.util.Scanner;
public class maxmin {
    public static void main(String[] args) {
        Scanner n1 = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = n1.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the numbers:");
        for (int i = 0; i < n; i++) {
            a[i] = n1.nextInt();
        }
        int min = a[0];
        int max = a[0];
        for (int i = 1; i < n; i++) {
            if (a[i] < min) {
                min = a[i];
            }
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println("Minimum number: " + min);
        System.out.println("Maximum number: " + max);
    }
}
