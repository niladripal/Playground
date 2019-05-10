import java.util.Scanner;
class Main	{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int temp = n;
		int count = 0;
		if(n < 0)
		{
			n = n * -1;
			
		}
		while(n>0)
		{
			count++;
			n=n/10;
		}
		if(temp < 0)
		{
			count++;
		}
		char str[] = new char[count];
		if(temp < 0)
		{
			temp = temp * -1;
			str[0] = '-';
		}
		count = count - 1;
		while(temp > 0)
		{
			char ch = (char)((temp%10)+'0');
			str[count] = ch;
			temp /= 10;
			--count;
		}
		System.out.println(str);
	}
}