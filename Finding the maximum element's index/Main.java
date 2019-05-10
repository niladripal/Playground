import java.util.Scanner;
class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] =  new int [n];
		for(int idx = 0; idx <= n - 1; idx++)
		{
			arr[idx] = sc.nextInt();
		}
		int max_no;
        // Compare first two elements in an array and find the largest element
        // Store the largest element in one variable
        if(arr[0] > arr[1])
        {
            max_no = 0;
        }
        else{
             max_no = 1;
        }
        // Scan each element in an array 
        // Compare each element with largest element which is stored in that variable 
        for(int idx = 2; idx <= n - 1; idx++)
        {
            if(arr[max_no] < arr[idx])
            {
                max_no = idx;
            }
        }
        System.out.println(max_no);
	
	}
}
	
