import java.util.*;


public class Fibonacci{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of fibonacci sequence to be displayed :");
		int a = sc.nextInt();
		int num1 = 0;
                int num2 = 1;
                System.out.println(num1);
                System.out.println(num2);
                for(int i = 0; i<a-2 ; i++){
                        int nextfibo = num1 + num2;
                        num1 = num2;
                        num2 = nextfibo;
                        System.out.println(nextfibo);
                }
 
	}
}
		
