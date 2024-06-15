package array;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Array1 {
public static void main(String[] args) {
	String []a=new String[4];
	Scanner S=new Scanner(System.in);
	int j=a.length;
	String []b=new String[4];
	for(int i=0;i<j;i++) {
		a[i]=S.next();
		b[i]=a[i];
	}
	for(String i:a) {
		System.out.print(i+" ");
	}
	for(String i:b) {
		System.out.print(i+" ");
	}
	
	
	
System.out.println(Arrays.equals(a,b));

}
}
