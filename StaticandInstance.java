package basic;

public class Method 
{
	
	void Add(int a , int b)
	{
		System.out.println(a+b);
	}
	
	public static void Add1()
	{
		System.out.println(3+4);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Method obj = new Method();
		obj.Add(2,3);
		Add1();
		

	}

}