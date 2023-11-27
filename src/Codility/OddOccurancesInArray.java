import java.util.*;

class OddOccurancesInArray{
	public static void main(String[] args) {
    int[] arr={4,5,6,6,4};
	System.out.println(getOddOccurance(arr));
	}
	public static int getOddOccurance(int[] A)
	{
	Map<Integer,Integer>	hm= new HashMap<>();
	for(int i: A){
		if(hm.containsKey(i))
		{
			hm.put(i,hm.get(i)+1);
		}
		else{
			hm.put(i,1);
		}
	}
	for(Map.Entry<Integer,Integer> e:hm.entrySet())
	{
		if(e.getValue()==1) return e.getKey();
	}

	return 0;
	}
}