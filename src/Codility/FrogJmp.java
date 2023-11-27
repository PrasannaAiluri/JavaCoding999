import java.util.*;
class FrogJmp{
	public static void main(String[] args) {
		System.out.println(noOfJumps(150000,  999999,  10000));
	}
	public static int noOfJumps(int X, int Y, int D)
	{
		int result=(Y-X)/D;
		if((Y-X)% D !=0)
		{
			return result+1;
		}
		return result;
	}
}