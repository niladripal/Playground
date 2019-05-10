import java.util.Scanner;
class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int arr_size = sc.nextInt();
		int arr[] = new int[arr_size];
		for(int idx = 0; idx < arr_size; idx++)
		{
			arr[idx] = sc.nextInt();
		}
		int front = 0;
		int end = arr_size -1;
		boolean is_palindrome = true;
		
		while(front < end)
		{
		/* Compare arr[front] and arr[end] elements
           and when these two elements are not equal. 
           Reset the is_palindrome value as false and stop comparing.
        */
			if(arr[front] != arr[end])
			{
				is_palindrome = false;
				break;
			}
			front++;
			end--;
		}
		if(is_palindrome == true)
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
	}
}