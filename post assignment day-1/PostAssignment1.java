package day1;
import java.util.Scanner;
public class PostAssignment1 {
	public static void main(String[] args) {
		Scanner n=new Scanner(System.in);
		System.out.println("enter a number:");
		int num=n.nextInt();
		System.out.println(add(num));
	}
public static int add(int num) {
	if (num==0) {
		return 0;
	}else {
		return ((num%10)+add(num/10));
	}
}
}
