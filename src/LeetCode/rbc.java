method(,)
input -> 1)array of integers 2)target(integer)
output-> array of indices (added)->target
 9, 1,6,3
target -> 7
output -> 1,2

always be a solution

length of the output ->2

public int[] findTargetIndices(int[] a,int target)
		int[] output;
		{
			Map<Integer,Integer> hm=new HashMap<Integer,Integer>();
			for(int i=0;i<a.length;i++){
				hm.put(a[i],i))
			}
			for(int i=0;i<a.length;i++)
		   {
           int b=a[i];
		   if(hm.contains(target-b)){
			   output[0]=i;
			   output[1]=hm.get(target-b);
		  }
		}
			return output;
		}


		Application elevator:

      variables : static input;
      classes: lIFT(Maxqty)
 ReachFloor(input); ReturnToGround(); inSystemMaintenance();

8 ELEVATORS 8 QUEUES 5 PEOPLE
5,7,9,3

SORT THE ELEMENTS
NEAREST PATH
TREESET ->SORTING

20 people same time (non-unique)

logic distributing the 20 inputs
 maxqty-> q

		FIFO, people --energy conserving ()

API gateway --> load balanceueue intial maxqty
		queue remaining people








