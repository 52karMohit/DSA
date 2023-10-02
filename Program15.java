
// Sum of distinct elements in an array:

import java.io.*;
class ArrayBasic15{
	
	void distinctSum(int arr[], int N){
	int sum = 0;
	for(int i = 0; i <= arr.length-1; i++){

		boolean unique = true;

		for(int j = 0 ; j <= arr.length-1;j++){

			if(i != j && arr[i] == arr[j]){

				unique = false;

			}
		
			if(unique){

				sum = sum + arr[i];
			}

		}
	}

		System.out.println(sum);
	}

	public static void main(String[] args)throws IOException{


		ArrayBasic15 obj = new ArrayBasic15();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		int arr1[] = new int[n];

		for(int i = 0; i <= arr1.length-1; i++){

			arr1[i] = Integer.parseInt(br.readLine());

		}

		obj.distinctSum(arr1,n);
	}
}

		
	
