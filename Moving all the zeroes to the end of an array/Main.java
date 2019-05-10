import java.util.Scanner;
class Main{
	public static void ending_zero(int arr_size, int arr[]){	
			int zero_count = 0;
			for(int idx = 0; idx <= (arr_size - 1); idx++)
			{
				if(arr[idx] != 0)
				{
					int temp = arr[idx];
					arr[idx] = arr[zero_count];
					arr[zero_count] = temp;
					zero_count++;					
				}
			}			
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int arr_size = sc.nextInt();
		int arr[] = new int [arr_size];
		for(int idx = 0; idx < arr_size; idx++)
		{
			arr[idx] = sc.nextInt();
		}
		ending_zero(arr_size, arr);
		for(int idx = 0; idx <= (arr_size - 1); idx++)
		{
			System.out.print(arr[idx] + " ");
		}	
	}
}