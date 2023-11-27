package LeetCode;

public class FiboRecursion{
	static int n1=0,n2=1,n3=0;
	public static void main(String[] args) {
		int count=10;
		System.out.print(n1+" "+n2);//printing 0 and 1
		Fibo(count-2);//n-2 because 2 numbers are already printed
	}
	public static void Fibo(int n)
	{
       if(n>0)
       {
		   n3=n1+n2;
		   System.out.println(" "+n3);
		   n1=n2;
		   n2=n3;
		   Fibo(n-1);
       }
	}
}