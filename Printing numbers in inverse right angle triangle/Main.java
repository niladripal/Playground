import java.util.Scanner;
class Main{
	public static void main (String[] args){
	Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    for(int cur_row = n; cur_row >= 1; cur_row--)
   {
    
	for(int cur_col = cur_row; cur_col >= 1; cur_col--)
    {
      System.out.print(cur_col);
    }
    System.out.print("\n");
  }
 }
}