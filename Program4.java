

// Product of array element:

import java.io.*;
class ArrayBasic4{

	void product(int arr[])throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int prod = 1;

		for(int i = 0; i <= arr.length-1; i++){
			arr[i] = Integer.parseInt(br.readLine());
			prod = prod * arr[i];

		}
		System.out.println(prod);
	}

	public static void main(String[] args)throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int testCases = Integer.parseInt(br.readLine());
		int n = Integer.parseInt(br.readLine());
		int arr1[] = new int[n];

		ArrayBasic4 obj = new ArrayBasic4();
		while(testCases != 0){
			
	//		int arr1[] = new int[n];
			obj.product(arr1);
			testCases--;
		}
	}
}

		



			

			
