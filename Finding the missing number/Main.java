import java.util.Scanner;
class Main 
{ 
    public static void main(String args[]) 
    { 
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n]; 
		for(int idx = 0; idx < n; idx++)
		{
			arr[idx] = sc.nextInt();
		}
		/* Check whether the 'value' is present in the given array
           If it is true, then reset 'is_found' value as false
           and stop your searching for the particular value.
           Otherwise, search till the end of an array
           If it is not existing, then store the 'value' in a variable'missing_val'
           and stop your searching further.
         */
		int missing_val = 0;
		for(int val = 1; val <= n; val++)
		{
			boolean is_found = false;
			for(int idx = 0; idx < n; idx++)
			{
				if(arr[idx] == val)
				{
					is_found = true;
					break;
				}
			}
			if(is_found == false)
			{
				missing_val = val;
				System.out.println(missing_val);
			}
		}
    } 
} 