package LeetCode;

public class primeNumber{
 public static void main(String[] args){
	int number=10;int j=3;
		System.out.println("2");
	while(number >1)
		{
			if(checkPrime(j))
		{
		System.out.println(j);
		number--;

		}
        j++;

		}
		}
		public static boolean checkPrime(int n){
	    for(int i=2;i<=n/2;i++){
		if(n%i==0)
		return false;
		}
		return true;
		}

		}