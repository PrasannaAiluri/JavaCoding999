package LeetCode;
import java.util.*;
import java.util.stream.Collectors;
class intFrequency {
    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> hm=new HashMap<Integer,Integer>();
        List<Integer> l=new ArrayList<Integer>();
        int[] array=new int[k];
        for(int i=0;i<nums.length;i++)
        {
            if(hm.containsKey(nums[i]))
            {
                int value=hm.get(nums[i]);
                hm.put(nums[i],value+1);
            }
            else
            {
                hm.put(nums[i],1);
            }
        }
             List<Map.Entry<Integer, Integer>> list = new LinkedList<>(hm.entrySet());
       Collections.sort(list, Map.Entry.comparingByValue(Comparator.reverseOrder()));
         
         List<Integer> topKKeys = list.stream().map(Map.Entry::getKey).limit(k).collect(Collectors.toList());
         
         for (int i = 0; i < k; i++) {
             array[i] = topKKeys.get(i);
             System.out.println(array[i]);
         }

        return array;
    }
    public static void main(String[] a){
        int[] arr={1,1,1,2,2,3,3};
        int[] abc=topKFrequent(arr,2);
        
        
    }
        
    }
