package array;

import java.util.Scanner;

public class array {
	public static void main(String[] args) {
	char []a= {'g','2','a','b','d'};
   for (char c : a) {
	System.out.print(c);
}
   Scanner s=new Scanner(System.in);
   System.out.println("enter the no of elements you want to enter ");
   int b=s.nextInt();
   double[] d=new double[b];
   for(int i=0;i<b;i++) {
	   d[i]=s.nextDouble();
   }
    
   for(double i:d) {
	   System.out.print(i+" ");
   }
   
	}
}
