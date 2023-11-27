//https://testing-fin.codility.net/programmers/lessons/3-time_complexity/tape_equilibrium/
import java.util.*;
class TapeEquilibrium{
	public static void main(String[] args) {
		int[] arr={-1000, 1000, -500, 990};
		System.out.println(MinDifference(arr));
	}
	public static int MinDifference(int[] A)
	{
       int sumofAll=0;
	   for(int i=0;i<A.length;i++)
		   sumofAll+=A[i];
	   int FirstPartSum=0;
	   int SecondPartSum=0;
	   int currentDifference=Integer.MAX_VALUE;
	   int minDifference=Integer.MAX_VALUE;
		for(int i=0;i<A.length;i++){
			FirstPartSum+=A[i];
			SecondPartSum=sumofAll-FirstPartSum;
			currentDifference=(int)Math.abs(FirstPartSum-SecondPartSum);
			minDifference= Math.min(minDifference,currentDifference);
		}
    return currentDifference;
	}
}