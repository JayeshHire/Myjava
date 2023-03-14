import java.util.*;

class Prime{
	static int [] primeArray;
	static void GenPrime(int len){
		primeArray = new int[len];
		int i=0 , num=2 , nextnum=3;
		primeArray[0]=2;
		while(i<len){
			int k =0;
			while(primeArray[k] != 0){
				if (nextnum % primeArray[k] == 0){
					nextnum++;
					break;
				} else{
					if (k==i-1){
						primeArray[i] = nextnum;
						nextnum++;
						break;
					}
				}
			
				k++;
			}
			if (primeArray[i] != 0){
				i++;
			}
		}
	}
	static void printPrime(){
		System.out.println("List of prime nos :");
		for (int i = 0; i<primeArray.length;i++){
			System.out.println(primeArray[i]);
		}
	}
	static void printEnd(int pos){
		System.out.println("prime no at position "+pos+" is " +primeArray[pos-1] );
	}
	
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the position of prime number :");
		int pos = sc.nextInt();
		GenPrime(pos);
		printEnd(pos);
	}
}




