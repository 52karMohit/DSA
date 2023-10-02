
// Find unique element in an array:

import java.io.*;
class ArrayBasic13{

	int uniqueEle(int arr[], int key){

		for(int i = 0; i < arr.length-1;i++){

			boolean isUnique = true;

			for(int j = 0; j <= arr.length-1;j++){
			
				if(i != j && arr[i] == arr[j]){

					isUnique = false;
					break;
				}
			}

			if(isUnique){

				return arr[i];
			}

		}
		return -1;
	}

	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int key = Integer.parseInt(br.readLine());

		int arr1[] = new int[n];

		for(int i = 0; i< arr1.length-1;i++){

			arr1[i] = Integer.parseInt(br.readLine());

		}
		
	

		ArrayBasic13 obj = new ArrayBasic13();

		System.out.println(obj.uniqueEle(arr1,key));
	}
}
		
	

