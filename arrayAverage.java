public class Array {
	
	public static void main(String[] args) {
		
		int[] arr = {10, 20, 30, 40};
		int size = arr.length;
		int total = 0, avg;
		
		System.out.println("Size of the array: "+ size);
		
		for(int i = 0; i < size; i++) {
			total += arr[i];
		}
		
		avg = total / size;
		
		System.out.println("Total of all numbers: "+ total);
		System.out.println("Average of all numbers: "+ avg);
		
	}

}