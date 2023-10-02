
// First and Last occurences of X

import java.io.*;
class ArrayBasic12{

	void firstlastOccurence(int arr[],int key)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));



		for(int i = 0 ; i <= arr.length-1;i++){
			
		//	arr[i] = Integer.parseInt(br.readLine());

			if(arr[i] == key){

				System.out.println(i);
				break;
			}
		}
		for(int j = arr.length-1; j >= 0; j--){

		//	arr[j] = Integer.parseInt(br.readLine());

			if(arr[j] == key){

				System.out.println(j);
				break;
			}
		}
	}

	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int index = Integer.parseInt(br.readLine());
		ArrayBasic12 obj = new ArrayBasic12();
		
		int arr1[] = new int[n];
		for(int i = 0; i <= arr1.length-1;i++){

			arr1[i] = Integer.parseInt(br.readLine());
		}

		obj.firstlastOccurence(arr1,index);
	}
}

		



