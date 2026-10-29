// Jvdroid-main: 
public class Ex3{
	public static void main(String...args){
		try{
			System.out.println("Start");
			//int a = 10/0;
			int[] a = {10,20,20};
			System.out.println(a[0]);
			System.out.println(a[1]);
			System.out.println(a[2]);
			System.out.println(a[3]);
			
		}catch(ArithmeticException e1) {
			System.out.println("Arithmetic " + e1);
		}catch(ArrayIndexOutOfBoundsException e2) {
			System.out.println("Array Index : "+ e2);
		}catch(Exception e){
			System.out.println("exception handling "+e);
		}
      
		System.out.println("Stop");
	}
}