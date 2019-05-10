import java.util.Scanner;
class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		//System.out.println("Enter the base: ");
		int base = sc.nextInt();
		//System.out.println("Enter the exponent: ");
		int exponent = sc.nextInt();
		int exponent_count = 1, result = 1;
		while(exponent_count <= exponent)
		{
			result *= base;
			exponent_count++;
		}
		System.out.println(/*"The value of the number raised to a power is: " + */result);
	}
}