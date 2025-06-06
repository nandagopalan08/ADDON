package day1;
import java.util.Arrays;
public class Day2task1 {
	public static void main(String[] args) {
		int[] a= {4,2,10,7,5,3,8};
		Arrays.sort(a);
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
		System.out.println(Arrays.toString(a));
	}
}



