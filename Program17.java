// Product of maximum of first array and minimum of second array
import java.io.*;
class ArrayBasic17{

	static int maxminProduct(int arr1[],int arr2[]){

		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int prod = 1;

		for(int i = 0; i <= arr1.length-1;i++){

			if(arr1[i] > max){

				max = arr1[i];
			}
		}
		for(int j = 0; j <= arr2.length-1;j++){

			if(arr2[j] < min){

				min = arr2[j];
			}
		}

		prod = max * min;
		return prod;
	}

	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n1 = Integer.parseInt(br.readLine());
		int n2 = Integer.parseInt(br.readLine());

		int arr1[] = new int[n1];

		int arr2[] = new int[n2];

		for(int i = 0; i <= arr1.length-1;i++){

			arr1[i] = Integer.parseInt(br.readLine());
		}

		for(int j = 0; j <= arr2.length-1;j++){

			arr2[j] = Integer.parseInt(br.readLine());
		}

		int ret = maxminProduct(arr1,arr2);

		System.out.println(ret);
	}
}


		




