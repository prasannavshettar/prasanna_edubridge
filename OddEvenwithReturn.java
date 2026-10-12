package basic;

public class OddEven {
	
	public static boolean isEven(int num)
	{
		if(num %2 == 0) {
			return true;
		}
		else
			return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isEven(10));
		System.out.println(isEven(7));
		
	}

}