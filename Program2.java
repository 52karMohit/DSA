
// Find the minimum and maximum element in ana array.

class ArrayBasic1{

	void minmaxElement(int arr[], int N){

		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;

		for(int i = 0; i < arr.length-1; i++){

			if(arr[i] > max){

				max = arr[i];
			}
		}

		for(int i = 0; i < arr.length-1; i++){

			if(arr[i] < min){

				min = arr[i];

			}

		}
		
		System.out.println(min + " " + max);
	}

	public static void main(String[] args){

		int arr1[] = new int[]{3,2,1,56,10000,167};
		

		ArrayBasic1 obj1 = new ArrayBasic1();

		obj1.minmaxElement(arr1,6);
	}
}



