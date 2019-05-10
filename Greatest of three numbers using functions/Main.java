import java.util.Scanner;
class Main{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	int n1 = sc.nextInt();
	int n2 = sc.nextInt();
	int n3 = sc.nextInt();
	int result = Great3(n1,n2);
	System.out.print(Great3(result,n2));
	
	}
	
	public static int Great3(int num1, int num2){
		if(num1>num2)
		{
			return num1;
		}
		else
		{
			return num2;
		}
	
	}
}
