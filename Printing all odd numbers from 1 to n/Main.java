import java.util.Scanner;
class Main {
	public static void main (String[] args){
	Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      for(int i=1; n >= i; i++)
      {
        if(i%2 != 0)
        {
          System.out.println(i);
        }
      }
    
    }
}