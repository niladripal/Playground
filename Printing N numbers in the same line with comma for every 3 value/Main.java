import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
	Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = 3;
		for(int commacount = 1 ; commacount <= n ; commacount++) {
			System.out.print(commacount);
			if((commacount % m == 0) && (commacount != n))
			{
    			System.out.print(",");			
			}
		}  }
}