
// Even Occurring elements:


class ArrayBasic8{

	void evenOccurring(int arr[], int N){
		int count = 0;
		for(int i = 0 ; i <= arr.length-1;i++){

			int rem = arr[i];
			for(int j = 0; j <= arr.length-1; j++){

				if(arr[j] == rem){
					count++;
				}
			}
			if(count % 2 == 0){

				System.out.println(rem);
			}
		}
	}
	public static void main(String[] args){

		ArrayBasic8 obj = new ArrayBasic8();
		
		int arr1[] = new int[]{9,12,23,10,12,12,15,23,14,12,15};
		obj.evenOccurring(arr1,11);
	}
}
