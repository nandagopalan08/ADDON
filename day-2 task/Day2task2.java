package day1;
import java.util.Arrays;
import java.util.Scanner;
public class Day2task2 {
public static void main(String[] args) {
	Scanner n=new Scanner(System.in);
	System.out.println("enter a size of array :");
	int size=n.nextInt();
	int[] a=new int[size];
	int[] b=new int[size];
	System.out.println("enter a number:");
	for(int i=0;i<size;i++) {
		a[i]=n.nextInt();
	}
	System.out.println(Arrays.toString(a));
	int t=0;
	for(int i=0;i<a.length;i++) {
		for(int j=i+1;j<a.length;j++) {
		if(a[i]>a[j]){
			t=a[i];
			a[i]=a[j];
			a[j]=t;
		}
	}
	}
	System.out.println(Arrays.toString(a));
	for(int i=0;i<a.length;i++) {
		int left=0;
		int right=a.length-1;
		if(left <right) {
			int temp=a[left];
			a[left]=a[right];
			a[right]=temp;
			left++;
			right++;
		}
	}
	for(int i=0;i<a.length;i++) {
		b[i]=a[i];
	}
	System.out.println("after asending:"+Arrays.toString(b));
}
}
