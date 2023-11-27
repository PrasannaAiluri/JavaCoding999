import java.util.*;
class CyclicRotation{
	public static void main(String[] args) {
		int[] arr={4,5,6,6,4};
		int k=3;
		System.out.println(Arrays.toString(getRotatedArray(arr,k)));
	}
	public static int[] getRotatedArray(int[] A,int k)
	{
		int[] b=new int[A.length];
		for(int i=0;i<A.length;i++){
			int newIndex=(i+k)%(A.length);
			b[newIndex]=A[i];
		}
		return b;
	}
}