import java.util.*;
import java.lang.*;

class BinaryGap{
	public static void main(String[] args) {
		int N=100000000;//N is an integer within the range [1..2,147,483,647].
		if(N>=Integer.MIN_VALUE && N<=Integer.MAX_VALUE) {
			TreeSet<Integer> result=new TreeSet<>();
			boolean count=false;
			char[] s = Integer.toBinaryString(N).toCharArray();
			System.out.println(s);//111100101110011100
			for(int i=0;i<s.length;i++)
			{
				if(s[i]=='1')
				{
					int counter=0;
					for(int j=i+1;j<s.length;j++)
					{
						if(s[j]=='0')
						{
							counter++;
						}else{
							result.add(counter);
							i=j-1;
							break;
						}
					}

				}
			}
			System.out.println(result);
			System.out.println("Maximum Binary Gap is "+result.last());

		}
	}
}