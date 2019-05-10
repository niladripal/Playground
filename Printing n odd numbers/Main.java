import java.util.Scanner;
class Main {
	public static void main (String[] args){
	Scanner in = new Scanner(System.in);
      int n = in.nextInt();
     
      for(int i=1; (i+1)/2 <=n ;i+=2)
 		System.out.println(i);
      /*
      int Odd=1;
      for(int count=1; n >= count; count++)
      {
        System.out.println(Odd);
        Odd += 2;
      }	*/
    }
}