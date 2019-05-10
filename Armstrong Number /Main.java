import java.util.Scanner;
import java.lang.Math;

class Main{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int digits = 0, n = num;
	    int temp = num, rem, result = 0;

		while(n != 0)
		{
			n = n / 10;
			digits++;
		}
		while(num != 0)
		{
			rem = num % 10;
			result = result + (int)(Math.pow(rem,digits));
			num = num / 10;
		}
		if(result == temp)
		{
			System.out.println("Armstrong Number");
		}
		else
        {
          System.out.println("Not a Armstrong Number");
        }
	}
}