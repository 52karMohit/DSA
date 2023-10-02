
// Replace 0's with 5 in Integer;


class ArrayBasic5{

	void replace(int N)throws IOException{
		
		int rem = 0;
		int rev = 0;
		int mul = 1;

		while(N != 0){

			rem = N % 10;
			if(rem == 0){

				rev = rev + 5 * mul;
			}
			else{
				rev = rev + rem * mul;
			}

			mul = mul * 10;
			N = N /10;
		}
		System.out.println(rev);
	}
	public static void main(String[] args){

		ArrayBasic5 obj = new ArrayBasic5();

		obj.replace(1005);
	}
}




