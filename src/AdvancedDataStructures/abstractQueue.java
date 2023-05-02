/*PROGRAM TO IMPLEMENT QUEUE ADT USING ARRAYS
DATE:5-1-15
13251A1203*/
import java.util.*;
interface queue<T>
{
	void insert(T x);
	T delete();
	boolean isEmpty();
	void display();
}
class arrayqueue<T> implements queue<T>
{
	private T[] a;
	private int rear,front;
	private final int capacity=3;
	public arrayqueue(){
		a=(T[])(new Object[capacity]);
		front=rear=-1;
	}
	public boolean isEmpty(){
		return((front==-1)||(front>rear));
	}
	public void insert(T x){
		if(rear==capacity-1)
			System.out.println("overflow");
		else
		{
			a[++rear]=x;
			if(front==-1)
				front=0;
		}
	}
	public T delete(){
		if(isEmpty()){
			System.out.println("underflow");
			return null;
		}
		return(a[front++]);
	}
	public void display(){
		if(isEmpty())
			System.out.println("empty");
		else
			for(int i=front;i<=rear;i++)
				System.out.print(" "+a[i]);
		System.out.println();
	}
}
class aqueue
{
	public static void main(String arg[]){
		Scanner s=new Scanner(System.in);
		int ch;
		//String d;
		Double d;
		//arrayqueue<String> aq=new arrayqueue<String>();
		arrayqueue<Double> aq=new arrayqueue<Double>();
		do{
			System.out.println("enter\n1-insert\n2-delete\n3-display\n4-quit");
			ch=s.nextInt();
			//s.nextLine();
			switch(ch){
				case 1:System.out.println("enter a value to insert");
				          aq.insert(s.nextDouble());
						  //aq.insert(s.nextLine());
						  break;
				case 2:d=aq.delete();
				          System.out.println("the deleted element is "+d);
						  break;
				case 3:aq.display();break;
			}
		}while(ch!=4);
	}
} 
/*Output

enter
1-insert
2-delete
3-display
4-quit
2
underflow
the deleted element is null
enter
1-insert
2-delete
3-display
4-quit
1
enter a value to insert
frog is in
enter
1-insert
2-delete
3-display
4-quit
3
 frog is in
enter
1-insert
2-delete
3-display
4-quit
2
the deleted element is frog is in
enter
1-insert
2-delete
3-display
4-quit
2
underflow
the deleted element is null
enter
1-insert
2-delete
3-display
4-quit
1
enter a value to insert
apple
enter
1-insert
2-delete
3-display
4-quit
1
enter a value to insert
ball
enter
1-insert
2-delete
3-display
4-quit
1
enter a value to insert
cat
overflow
enter
1-insert
2-delete
3-display
4-quit
1
enter a value to insert
dog
overflow
enter
1-insert
2-delete
3-display
4-quit
3
 apple ball
enter
1-insert
2-delete
3-display
4-quit
4

2)


enter
1-insert
2-delete
3-display
4-quit
2
underflow
the deleted element is null
enter
1-insert
2-delete
3-display
4-quit
1
enter a value to insert
45.7
enter
1-insert
2-delete
3-display
4-quit
1
enter a value to insert
33.6789
enter
1-insert
2-delete
3-display
4-quit
1
enter a value to insert
100.03
enter
1-insert
2-delete
3-display
4-quit
2
the deleted element is 45.7
enter
1-insert
2-delete
3-display
4-quit
2
the deleted element is 33.6789
enter
1-insert
2-delete
3-display
4-quit
3
 100.03
enter
1-insert
2-delete
3-display
4-quit
2
the deleted element is 100.03
enter
1-insert
2-delete
3-display
4-quit
2
underflow
the deleted element is null
enter
1-insert
2-delete
3-display
4-quit
4*/
