package day8;
import java.util.Scanner;
public class Day8_task3 {
	public static int rotated(int []a,int t) {
			for(int i=0;i<a.length;i++) {
				if(a[i]==t) {
					System.out.println("found "+a[i]+"->"+i);
					break;
				}
			}
			return -1;
	}
public static void main(String[] args) {
	Scanner n =new Scanner(System.in);
	System.out.println("Enter a size of Array");
	int size=n.nextInt();
	int [] a=new int[size];
	System.out.println("Enter a element of arrays:");
	for(int i=0;i<a.length;i++) {
		int e=n.nextInt();
		a[i]=e;
	}
	System.out.println("Enter a target of Array");
	int t=n.nextInt();
	System.out.println(rotated(a,t));
}

}