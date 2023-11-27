package LeetCode;

public class numPalindrome{
	public static void main(String[] args){
		int number=343;
		int n1=number;
		int reversenumber=0;
		while(n1>0)
		{
			reversenumber=(reversenumber+(n1%10))*10;
			n1=n1/10;
		}
		reversenumber=reversenumber/10;
		System.out.println(reversenumber);
		if(number==reversenumber)
			System.out.println(number+" is a palindrome");
	}

}