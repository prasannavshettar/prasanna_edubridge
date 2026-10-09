package basic;

public class Array2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = {{10,20,30,40},{50,60,70,80}};
		for(int i =0;i<matrix.length;i++)
			for(int j=0;j<matrix[i].length;j++)
			{
				System.out.println(matrix[i][j] + " ");
			}
		System.out.println();

	}

}