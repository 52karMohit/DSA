

class ArrayBasic{

	void eleSearch(int arr[],int N,int key){

		for(int i = 0;i < arr.length-1;i++){

			if(arr[i] == key){

				System.out.println(i);
				break;
			}

		}
	}

	public static void main(String[] args){

		int arr1[] = new int[]{10,20,30,40,50};

		ArrayBasic obj = new ArrayBasic();

		obj.eleSearch(arr1,5,30);
	}
}



