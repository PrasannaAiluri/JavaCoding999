package JavaConcepts;
public class deadLock{
	public static Object Lock1=new Object();
	public static Object Lock2=new Object();

	public static void main(String[] args) {
     new Thread1().run();
	 new Thread2().run();
	}

	public static class Thread1 extends Thread{
		public void run(){
			synchronized(Lock1){
				System.out.println("Thread-1 acquired lock1");
				try{
					Thread.sleep(10000);
				}
				catch(InterruptedException e){
					System.out.println("Thread-1 interrupted.");
				}
			}
			System.out.println("Thread-1 waiting for Lock2.");
			synchronized(Lock2){
				System.out.println("Thread-1 acquired lock2");
				try{
					Thread.sleep(1000);
				}
				catch(InterruptedException e){
					System.out.println("Thread-1 interrupted.");
				}
			}

		}
	}
	public static class Thread2 extends Thread{
		public void run(){
			synchronized(Lock2){
				System.out.println("Thread-2 acquired lock2");
				try{
					Thread.sleep(10000);
				}
				catch(InterruptedException e){
					System.out.println("Thread-2 interrupted.");
				}
			}
			System.out.println("Thread-2 waiting for Lock1.");
			synchronized(Lock1){
				System.out.println("Thread-2 acquired lock1");
				try{
					Thread.sleep(1000);
				}
				catch(InterruptedException e){
					System.out.println("Thread-2 interrupted.");
				}
			}

		}
	}
}


	Can u swap two variables ? Each containing an integer



int a,b;
int temp;
temp=a;
a=b;
b=temp;

a=a+b;
b=a-b;
a=a-b;

		Find the second largest in a list / array


int[] a={2,5,6,3,6,0};
int large,secondlarge=Integer.min;
for(int i=0;i<a.length;i++){
	    if(a[i]>large)
		{
			large=a[i];
		secondlarge=large;
		}
		else if(a[i]>secondlarge){
		secondlarge=a[i];
		}

		}
return secondlarge;

