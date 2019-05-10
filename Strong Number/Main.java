import java.util.Scanner;
class Main{
	public static void main(String[] args){
			Scanner in = new Scanner(System.in);
			int n = in.nextInt();
			int temp = n, sum=0;
			int fact = 1;
			int lastDigit = n % 10;
			int mDigit = (n/10)%10;
			int firstDigit = (n/10)/10;
			for(int i = 1; i <= lastDigit; i++)
			{
				fact = fact * i;
				
			}
			int fact2 = 1;
			for(int j = 1; j<=mDigit; j++)
			{
				fact2 = fact2 * j;
			}
			int fact3 = 1;
			for(int k = 1; k<=firstDigit; k++)
			{
				fact3 = fact3 * k;
			}
			sum = fact + fact2 + fact3;
			if(temp == sum)
			{
				System.out.println("Yes");
	
			}
            else
			{
				System.out.println("No");
	
			}
		
	}
}