package print;

import java.lang.reflect.Array;

//second largest element and second lowest element
public class max {
public static void main(String[] args) {
	int a[]= {1,4,3,55,6,7,888,98,54};
	int max=a[0];
	int max2=a[0];
	for(int i=1;i<a.length-1;i++) {
		if(max<a[i] ) {
			max2=max;
			max=a[i];
			
		}
		else if(a[i]> max2 &&max2 !=max) {
			max2=a[i];
		}
		
		
	}
	
		
	
	System.out.println(max);
	System.out.println(max2);
}
}
