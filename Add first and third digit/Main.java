import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		// Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int digit1 =(n/10)/10;
      int digit2 =(n%10);
      int sum = digit1 + digit2;
      System.out.println(sum);
      
	}
}