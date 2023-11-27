package LeetCode;

public class SortDescending{
	public static void main(String[] args) {
		int[] nums={78,99,435,89,0,65,43};
		for(int i=0;i<nums.length;i++)
		{
			for(int j=i+1;j<nums.length;j++)
			{
				if(nums[i]<nums[j])
				{
					nums[i]=nums[i]+nums[j];
					nums[j]=nums[i]-nums[j];
					nums[i]=nums[i]-nums[j];

				}
			}
		}
		for(int i=0;i<nums.length;i++)
		System.out.println(nums[i]);
	}

}