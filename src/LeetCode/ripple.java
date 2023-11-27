import bsh.Capabilities;

//Pad for Prasanna Ailuri - Software Engineer

/*
# Design a data structure that follows the constraints of a Least Recently Used (LRU) cache.

# Implement the LRUCache class:

# LRUCache(int capacity) Initialize the LRU cache with positive size capacity.
# int get(int key) Return the value of the key if the key exists, otherwise return -1.
# void put(int key, int value) Update the value of the key if the key exists. Otherwise, add the key-value pair to the cache. If the number of keys exceeds the capacity from this operation, evict the least recently used key.
# The functions get and put must each run in O(1) average time complexity.
*/
// cap =3  (1,1) (2,2) (3,3)

// get(1) get(1) get(1) ret(1) = 3 get(2) ret(2) = 1 get(3) ret(3) = 1; // put(4,4) --> remove (1)

PriorityQueue
// multiple impl of list -> linked list (nodes)and array list(resizable array)
import java.util.*;
class LRUCache {
	int capacity=0,top=0;
	List<cacheelement> m=new ArrayList<cacheelement>();
	public LRUCache(int capacity) {
		this.capacity=capacity;
	}

	public int get(int key) {
		forEach()
		return m.get(key);

     else
		return -1;
	}

	public void put(int key, int value) {
		if(capacity==top)
		{
			m.remove(LRU);
			top--;
		}
		m.put(key,value);
		top++;
	}
}

class cacheelement{
	int key;
	int value;
	int retrieval;

}