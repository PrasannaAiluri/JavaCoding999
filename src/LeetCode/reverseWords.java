package LeetCode;

public class reverseWords{

	public static void main(String[] args) {
		StringBuilder res=new StringBuilder();
		String[] str="a good  example".trim().split("\\s+");
		for(int i=str.length-1;i>=0;i--)
		{
			String a=str[i].trim();
			res.append(" "+a);
		}
		System.out.println( res.toString().trim());
	}
}