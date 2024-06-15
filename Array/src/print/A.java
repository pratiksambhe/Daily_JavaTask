package print;

import java.util.Arrays;

public class A {
	public static void main(String[] args) {

		int b[] = { 1, 200, 3, -45, 90, 6 };
		int n = b.length;
		System.out.println("size of array=" + n);
//		int max = b[0];
//		for (int i = 0; i <= n - 1; i++) {
//			if (b[i] < max) {
//				max = b[i];
//			}
//		}
//		System.out.println("Maximum Element from given array = "+max);
		Arrays.sort(b);
		for(int i=0;i<n;i++) {
			System.out.println(b[i]);
			
		}
		int c[]; 
	System.out.println(b.clone());	
	}
}