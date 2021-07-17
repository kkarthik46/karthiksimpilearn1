
public class ExInh{
	public static void main(String[] args) {
		System.out.println("hi");
		try {
		int a=50/2;//--->exception obj
		}
		catch(Exception e) {
			System.out.println(e);//exception obj
		}
		System.out.println("hello");
		
	}
}