import java.util.Scanner;
class Main{ 
	public static void main(String args[]) 
	{ 
		Scanner sc = new Scanner(System.in);
		int row_size = sc.nextInt();
		int column_size = sc.nextInt();
		int mat1[][] = new int[row_size][column_size];
		for(int i = 0; i <= row_size - 1; i++)
		{
			for(int j = 0; j <= column_size - 1; j++)
			{
				mat1[i][j] = sc.nextInt();
			}
		}
		int mat2[][] = new int[row_size][column_size];
		for(int i = 0; i <= row_size - 1; i++)
		{
			for(int j = 0; j <= column_size - 1; j++)
			{
				mat2[i][j] = sc.nextInt();
			}
		}
		int sub[][] = new int[row_size][column_size];
		substruction_of_2_matrices(mat1, mat2, sub);
		//display_the_matrix(sum); //if use display function
	} 
	public static void substruction_of_2_matrices(int mat1[][], int mat2[][], int sub[][]) 
	{ 
		for (int i = 0; i <= sub.length - 1; i++){
			for (int j = 0; j <= sub[i].length - 1; j++){ 
			sub[i][j] = mat1[i][j] - mat2[i][j];
			System.out.print(sub[i][j] + " ");
			}
			System.out.println();
		}
	}
}