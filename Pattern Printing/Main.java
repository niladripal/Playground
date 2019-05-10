import java.util.Scanner;
class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		//System.out.println("Enter the number of Rows: ");
		int row = sc.nextInt();
		//System.out.println("Enter the number of Columns: ");
		int col = sc.nextInt();
		//System.out.println("The required Pattern is:");
		for(int i = row; i > 0; i--)
		{
			for(int j = col; j > i; j--)
			{
				System.out.print(j);
			}
			for(int j = i; j > 0; j--)
			{
				System.out.print(i);
			}
			System.out.println();
		}	
	}
}