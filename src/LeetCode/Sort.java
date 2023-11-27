package LeetCode;

public class Sort{
	public static void main(String[] args) {
		int temp=0;
		int[] numbers={6,78,90,23,4,3,56};
		for(int i=0;i<numbers.length-1;i++)
		{
			for(int j=0;j<numbers.length-1-i;j++)
			{
				if(numbers[j]>numbers[j+1])
				{
					temp=numbers[j+1];
					numbers[j+1]=numbers[j];
					numbers[j]=temp;
				}
			}
		}
		for(int i=0;i<numbers.length;i++)
			System.out.println(numbers[i]);
	}
}