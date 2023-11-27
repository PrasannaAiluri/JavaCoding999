package LeetCode;

public class SelectionSort {
	public static void main(String[] args) {
		int[] nums = {78, 99, 435, 89, 0, 65, 43};
		for(int i=0;i<nums.length;i++){
            int min=i;
			for(int j=i;j<nums.length;j++){
				if(nums[j]<nums[min])
				{
					min=j;
				}

			}
			if(i!=min)
			{
				nums[min]=nums[i]+nums[min];
				nums[i]=nums[min]-nums[i];
				nums[min]=nums[min]-nums[i];
			}

		}
		for(int i=0;i<nums.length;i++)
			System.out.println(nums[i]);

	}

}