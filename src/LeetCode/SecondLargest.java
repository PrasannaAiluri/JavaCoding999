package LeetCode;

public class SecondLargest{
	public static void main(String[] args) {
		int[] nums={78,99,435,89,0,65,43};
		int largest=nums[0]=Integer.MIN_VALUE,secondLargest=Integer.MIN_VALUE;
		for(int i=0;i<nums.length;i++)
		{
			if(nums[i]>largest)
			{
				secondLargest=largest;
				largest=nums[i];
			}
			else if(nums[i]>secondLargest)
			{
				secondLargest=nums[i];
			}
		}
		System.out.println(largest+"is the first largest");
		System.out.println(secondLargest+"is the  second largest");
	}
}

