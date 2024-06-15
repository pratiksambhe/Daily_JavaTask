package array;

import java.util.Scanner;

public class ManualSort {
public static void main(String [] args) {
	double m=10.00/20.00;
	System.out.println(m);
	Scanner s=new  Scanner(System.in);
	int x=s.nextInt();
	int a[]=new int[x];
	int b=a[0];
	for(int i=0;i<a.length;i++) {
		a[i]=s.nextInt();
	}
	for(int i:a) {
		System.out.print(i+" ");
	}
	System.out.println();
	for(int i=1;i<a.length;i++) {
		for(int j=0;j<i;j++) {
			if(a[j]>a[i]) {
				int c=a[j];
				a[j]=a[i];
				a[i]=c;
				
			
			}
		}
	}
	for(int i:a) {
		System.out.print(i+" ");
	}
	
	}
}
