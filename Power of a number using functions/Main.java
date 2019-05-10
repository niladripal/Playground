import java.util.Scanner;
class Main{
	public static int PowFun(int b, int e){
		long result = 1;
		while(e != 0){
			result *= b;
			e--;
		}
	return (int)result;
	}
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	int base = sc.nextInt();
	int exponent = sc.nextInt();
	int mpf = PowFun(base,exponent);
	System.out.println(mpf);
	}
	
}