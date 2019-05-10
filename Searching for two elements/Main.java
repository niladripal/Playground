import java.util.Scanner;
class Main{
	public static void main(String args[]){
	Scanner sc =  new Scanner(System.in);
	int arr_size = sc.nextInt();
	int arr[] = new int[arr_size];
	for(int index = 0; index<= arr_size-1; index++)
	{
		arr[index] = sc.nextInt();
	}
	int search_elem_1 = sc.nextInt();
  	int search_elem_2 = sc.nextInt();
  	int element_1_index = -1;
  	int element_2_index = -1;
	for(int index = 0; index <= arr_size-1; index++)
	{
		if(search_elem_1 == arr[index] )
		{
			element_1_index = index;
		}
		if(search_elem_2 == arr[index])
		{
          element_2_index = index;
		}
    }
  	System.out.println(element_1_index);
  	System.out.println(element_2_index);
	}	
}