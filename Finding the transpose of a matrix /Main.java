import java.util.Scanner;
class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int row_size = sc.nextInt();
		int col_size = sc.nextInt();
		int mat[][] = new int[row_size][col_size];
		for(int i = 0; i < row_size; i++)
		{
			for(int j = 0; j < col_size; j++)	
			{
				mat[i][j] = sc.nextInt();
			}
		}
		int transpose[][] = new int[col_size][row_size];
		for(int i = 0; i < row_size; i++)
		{
			for(int j = 0; j < col_size; j++)
			{
				transpose[j][i] = mat[i][j];
			}
		}
		for(int i = 0; i < col_size; i++)
		{
			for(int j = 0; j < row_size; j++)
			{
				System.out.print(transpose[i][j] + " ");
			}
			System.out.println();
		}
	}
}
