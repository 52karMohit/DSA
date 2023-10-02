
// 9. Remove an element at specific index from an array:
import java.io.*;
class ArrayBasic9{

	void removeElement(int arr[],int key){

	//	int arr1[] = new int[N-1];

		for(int i = 0; i < arr.length-1;i++){

			if(i != key){
				arr[i] =arr[i];
			}

			System.out.println(arr1[i]);
		}

	}

	public static void main(String[] args)throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		ArrayBasic9 obj = new ArrayBasic9();
		
		int arrn[] = new int[5];
		for(int i = 0; i <= arrn.length-1;i++){
			arrn[i] = Integer.parseInt(br.readLine());
		}

		obj.removeElement(arrn,2);
	}
}
	


