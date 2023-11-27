package Leetcode;

import java.util.Arrays;
public class Fibonacci{
	public static void main(String[] args) {
		int[] a={2,5,6,3,9,0};
		int large=0;
		int secondlarge=0;
		/*for(int i=0;i<a.length;i++){
			if(a[i]>large)
			{
				secondlarge=large;
				large=a[i];
				System.out.println("large"+large);
				System.out.println("secondlarge"+secondlarge);
			}
			else if(a[i]>secondlarge){
				secondlarge=a[i];
			}

		}*/
		Arrays.sort(a);
		System.out.println("fourth largest is"+a[4-1]);
	}
}