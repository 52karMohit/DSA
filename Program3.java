
// Largest element in array;


class ArrayBasic3{

	void largestElement(int arr[],int N){
	
		int max = Integer.MIN_VALUE;
		for(int i = 0; i <= arr.length-1; i++){

			if(arr[i] > max){

				max = arr[i];

			}
		}

		System.out.println(max);

	}

	public static void main(String[] args){

		int arr1[] = new int[]{1,8,7,56,90};

		ArrayBasic3 obj = new ArrayBasic3();

		obj.largestElement(arr1,5);
	}
}


