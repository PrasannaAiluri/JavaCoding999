import java.util.*;
interface ilinear<T>
{
	void insert(T x);
	int search(T x);
}
class lsearch<T extends Comparable<T>> implements ilinear<T>
{
	private int count;
	private T a[];
	public lsearch(int sz){
		a=(T[])(new Comparable[sz]);
		count=0;
	}
	public void insert(T ele){
		a[count]=ele;
		count++;
	}
	public int search(T n){
		int i;
		for(i=0;i<a.length;i++)
			if(a[i].compareTo(n)==0){
			   return(i);
		}
		return(-1);
	}
}
class linearg
{
	public static void main(String arg[]){
		Scanner s=new Scanner(System.in);
		System.out.println("enter number of elements");
		//System.out.println("enter number of double values");
		int n=s.nextInt();
		lsearch l=new lsearch(n);
		for(int i=0;i<n;i++){
			System.out.println("enter "+i+" element");
			//l.insert(s.nextInt());
			l.insert(s.nextDouble());
		}
		System.out.println("enter a value to be searched for:");
		//int k=s.nextInt();
		double k=s.nextDouble();
		int x=l.search(k);
		if(x!=-1)
			System.out.println("the element "+k+" is at position "+x);
		else
			System.out.println("value not found");
	}
}/*OUTPUT

enter number of elements
7
enter 0 element
83
enter 1 element
52
enter 2 element
96
enter 3 element
27
enter 4 element
46
enter 5 element
56
enter 6 element
40
enter a value to be searched for:
77
value not found

2)
enter number of elements
8
enter 0 element
3.3
enter 1 element
785.90
enter 2 element
33.6
enter 3 element
55.7
enter 4 element
12.8
enter 5 element
32.9
enter 6 element
19.5
enter 7 element
100.8
enter a value to be searched for:
12.8
the element 12.8 is at position 4*/