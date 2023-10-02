
// Last Index of One;

import java.io.*;


class ArrayBasic16{

	int lastIndexOne(int arr[], int N){
		
		int lastIndex = 0;
		for(int i = arr.length-1; i >= 0; i--){

			if(arr[i] == 1){

				lastIndex = i;
				break;
			}
			else
				return -1;
		}
		return lastIndex;
	}

	public static void main(String[] args)throws IOException{
		
		ArrayBasic16 obj = new ArrayBasic16();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		int arr1[] = new int[n];

		for(int i = 0; i <= arr1.length-1;i++){

			arr1[i] = Integer.parseInt(br.readLine());

		}
		
		System.out.println(obj.lastIndexOne(arr1,n));
	}
}


