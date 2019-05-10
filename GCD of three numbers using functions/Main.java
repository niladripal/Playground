import java.util.Scanner;
class Main{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	int n1 = sc.nextInt();
	int n2 = sc.nextInt();
	int n3 = sc.nextInt();
	int result = myGCD(n1,n2);
	System.out.print(myGCD(n1,n2));
	
	}
	//function for gcd of 2 number
	public static int myGCD(int num1,int num2){
			
		int min;
		if(num1<num2)
		{
			min = num1;
		}	
		else
		{
			min = num2;
		}
	
		while(min >=1)
		{
			if((num1 % min == 0) && (num2 % min == 0))
			{
				return min;
			}
			--min;
			
		}
		return 0;
		
	}
}
	
