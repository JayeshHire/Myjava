import java.util.*;

class FiboRecu{
       	static int num1=0 , num2=1 , num3=0;

	static void printFibo(int len){
		if (len >0){
			num3 = num1 + num2;	
			num1 = num2;
			num2 = num3;
			System.out.println(num3);
			len--;
			printFibo(len);
		}
	}

	public static void main(String [] args){
		System.out.println("Enter the length of the fibonacci sequence to be generated :");
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		len -= 2;
		System.out.println("Generated Fibonacci sequence is as follows :");
		System.out.println(num1);
		System.out.println(num2);
		printFibo(len);
	}
}
				
