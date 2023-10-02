// Maximum repeating element in an array:
import java.io.*;
class ArrayBasic14{

	static int repeatingEle(int arr[], int N){
		int maxCount = 0;
		int value = 0;
		for(int i = 0; i <= arr.length-1;i++){
			//int cnt = 0;
			int count = 1;

			for(int j = i + 1; j <= arr.length-1;j++){
				
				if(arr[i] == arr[j]){
					value = arr[i];;
					count++;
				}
			}
		
			if(count > maxCount){

				//System.out.println(value);
				break;
			}
		}
		return value; 		
	}
	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		ArrayBasic14 obj = new ArrayBasic14();

		int n = Integer.parseInt(br.readLine());

		int arr1[] = new int[n];

		for(int i = 0; i <= arr1.length-1;i++){

			arr1[i] = Integer.parseInt(br.readLine());

		}

		int ret = repeatingEle(arr1,n);

		System.out.println(ret);
	}
}








