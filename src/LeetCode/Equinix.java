package Leetcode;
/*() -> 1 or More of these
[] -> 0 or more of these
TR1
TZ1
1. Letters in the front
2. There’s a match on TR and TR TR1, TR2
3. There’s a match on TR1 and TR1X  -> TR1 comes first and TR1X comes next, TR1X vs TR1Z -> TR1X comes first
Tanweer Makhani to Everyone*/
class Equinix{
	public static void main(String[] args) {

		List<String> ls=new ArrayList<>();
		ls.stream().sorted(new Comparator<String>() {
		})
	}

}

public miscomparator implements Comparator<String>{
    /*(AAAA)(NN)[AA]
() -> 1 or More of these
[] -> 0 or more of these
*/
     */
	public int compare(String s1, String s2){
      String s1First=getFirst(s1);
	  String s2First=getFirst(s2);
	  Integer s1Second=getSecond(s1);
	  Integer s2Second=getSecond(s2);
	  String s1Third=getThird(s1);
	  String s2Third=getThird(s2);

	  if s1First.compareTo(s2First)>0

      		return 1;
	 else if	s1First.compareTo(s2First)< 0

		    return  -1;
	else
		{
			if(s1Second.compareTo(s2Second)>0)


		}




		}
		public String getFirst()
		{
		(AAAA)
		}
        public Integer getSecond()
		{
		(NN)
		}
       public String getThird()
		{
		[AA]
		}
		}