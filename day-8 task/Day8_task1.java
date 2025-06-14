package day8;

import java.util.Scanner;

public class Day8_task1 {
	public static void linear(int a[],int t) {
		boolean flag=false;
		for(int i=0;i<a.length;i++) {
			if(a[i]==t) {
				System.out.println("found "+a[i]+"->"+i);
				flag=true;
				return;
			}
		}
		if(flag==false) {
			System.out.println("not found");
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
		linear(a,t);
	}
}
