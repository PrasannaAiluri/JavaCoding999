/*Write a function:

class Solution { public int solution(int[] A); }

that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.

		For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.

		Given A = [1, 2, 3], the function should return 4.

		Given A = [−1, −3], the function should return 1.

		Write an efficient algorithm for the following assumptions:

		N is an integer within the range [1..100,000];
		each element of array A is an integer within the range [−1,000,000..1,000,000].
		Copyright 2009–2023 by Codility Limited. All Rights Reserved. Unauthorized copying, publication or disclosure prohibited./ you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");*/

import java.util.*;
class Solution {
	public int solution(int[] A) {
		Integer[] input = Arrays.stream( A ).boxed().toArray( Integer[]::new );
		TreeSet<Integer> ts=new TreeSet<Integer>();
		ts.addAll(Arrays.asList(input));
		int n=ts.last();
		if(n<=0)
		{
			return 1;
		}
		else
		{
			int sum1=0;
			for(int i:ts)
				sum1+=i;
			int sum2=(n*(n+1))/2;
			if(sum1==sum2)return n+1;
			else return sum2-sum1;
		}
	}
}
