

// Elements in range;

import java.io.*;
class ArrayBasic6{

	void range(int arr[],int N, int A,int B)throws IOException{
		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		for(int i = 0; i < arr.length-1; i++){
		
//			arr[i] = Integer.parseInt(br.readLine());
			if(arr[i] >= A && arr[i] <= B){

				System.out.println("Yes");
				break;

			}
			else{
				System.out.println("No");
				break;
			}
		}
	}
	public static void main(String[] args)throws IOException{

		ArrayBasic6 obj = new ArrayBasic6();
		
//		int n = Integer.parseInt(br.readLine());
		int arr1[] = new int[]{1,4,5,2,7,8,3};
		
		obj.range(arr1,7,2,5);
	}
}





