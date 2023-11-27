package LeetCode;

public class trycatchfinally{
	public static void main(String[] args) {
		int i1=method();
		System.out.println(i1);
	}
	public static int method(){
		try{
			return 2;
		}
		catch(Exception e){
			System.out.println("hello");
		}
		finally {
			System.out.println("hello2");
		}
		return 4;
	}
}