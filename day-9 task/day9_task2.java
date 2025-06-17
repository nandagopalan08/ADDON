package day9;

import java.util.Arrays;
import java.util.Scanner;

public class day9_task2 {
	public static void upper(int [] a,int t) {
		int start=0;
		int end=a.length;
		int mid;
		
		while(start<end) {
			 mid=(start+end)/2;
			if(a[mid]<=t) {
				start=mid+1;
			}else {
				end=mid;
			}
	
		}
		if(start==end) {
			System.out.println("Upper bound at "+start+" value "+a[start]);
		}
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
		Arrays.sort(a);
		upper(a,t);
	}
}
