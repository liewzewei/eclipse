import java.util.Scanner;

public class demo_1{
	public static void main(String[]args){
		Scanner r = new Scanner(System.in);
		System.out.println("Please enter the number of prime numbers that you need");
		int limit = r.nextInt();
		int[] primeNumbers = new int[limit];
		primeNumbers[0]=2;
		int i = 1;
		int tryer = 2;
		while(i<primeNumbers.length){
			boolean [] numberUsed;
			for(int e = 3;;e++){
				float number = (float)e;
				while(tryer<number)
					if(number / (float)tryer != 0){
						
					}
				}	
			}
		}
	}
}