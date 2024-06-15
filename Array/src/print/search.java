package print;

import java.util.Scanner;

public class search {
public static void main(String[] args) {
	int b[]= {71,3,33,21,45,12,42,555,43,234};
	Scanner scan=new Scanner(System.in);
	System.out.println("enter no you want to search");
	int a=scan.nextInt();
	for(int i=0;i<b.length;i++) {
		if(a==b[i]) {
			
			System.out.println(i);
		}
	}
	scan.close();
}
}
