
// Find the common elements in three sorted array:

import java.io.*;
class ArrayBasic19{

	static void commonElement(int arr1[], int arr2[], int arr3[],int n1,int n2,int n3){

		int i = 0;
		int j = 0;
		int k = 0;

		while(i < n1 && j < n2 && k < n3){

			if(arr1[i] == arr2[j] && arr1[i] == arr3[k]){

				System.out.println(arr1[i]);
				i++;
				j++;
				k++;

			}

			else if(arr1[i] < arr2[j] && arr1[i] < arr3[k]){

				i++;

			}

			else if(arr2[j] < arr3[k] && arr2[j] < arr1[i]){

				j++;

			}

			else{

				k++;

			}

		}
	}



	public static void main(String[] args)throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


		int n1 = Integer.parseInt(br.readLine());
		int n2 = Integer.parseInt(br.readLine());
		int n3 = Integer.parseInt(br.readLine());

		int arr1[] = new int[n1];
		int arr2[] = new int[n2];
		int arr3[] = new int[n3];

		for(int i = 0; i < n1;i++){

			arr1[i] = Integer.parseInt(br.readLine());
		}

		for(int j = 0; j < n2; j++){

			arr2[j] = Integer.parseInt(br.readLine());
		}

		for(int k = 0; k < n3;k++){

			arr3[k] = Integer.parseInt(br.readLine());
		}


		commonElement(arr1,arr2,arr3,n1,n2,n3);

	}
}

