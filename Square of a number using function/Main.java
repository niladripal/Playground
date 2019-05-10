import java.util.Scanner;
class Main{
	public static int SquareNumber(int m){
	int result = m * m;
	return result ;
	}
public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int sn = SquareNumber(n);
	n = sn;
	System.out.println(n);
	
	
}
}