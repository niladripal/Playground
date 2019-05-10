import java.util.Scanner;
class Main{
	public static int NumbersSum(int m){
		int sum = 0;
	for(int i = 1; i<=m; i++)
	{
		sum += i; 
	}
	return sum;
	}
public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	
		int son = NumbersSum(n);
		n = son;
		System.out.println(n);
}
}