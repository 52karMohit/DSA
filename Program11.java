
// Product of maximum in first array and minimum in second.

import java.io.*;
class ArrayBasic11{

	void maxminProd(int arr1[],int arr2[])throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		

		for(int i = 0; i <= arr1.length-1;i++){
			
			arr1[i] = Integer.parseInt(br.readLine());
			if(arr1[i] > max){

				max = arr1[i];
			}
		}
		for(int j = 0; j <= arr2.length-1;j++){
			arr2[j] = Integer.parseInt(br.readLine()); 
			if(arr2[j] < min){

				min = arr2[j];
			}
		}
		int prod = max * min;

		System.out.println(prod);
	}

	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n1 = Integer.parseInt(br.readLine());
		int n2 = Integer.parseInt(br.readLine());

		int arr1[] = new int[n1];
	      	int arr2[] = new int[n2];	

		ArrayBasic11 obj = new ArrayBasic11();
				
		obj.maxminProd(arr1,arr2);
	}
}






