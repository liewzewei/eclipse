import java.util.Scanner;

public class demo_1{
	public static void main(String[]args){
		Scanner r = new Scanner(System.in);
		System.out.println("Please enter the number of prime numbers that you need");
		int limit = r.nextInt();
		float[] primeNumbers = new float[limit];
		primeNumbers[0]=2;
		int i = 1;
		int tryer = 2;
		int e = 3;
		while(i<primeNumbers.length){
			for(int e = 3;;e++){
				float number = (float)e;
				boolean usedNumbers = new boolean [number];
				while(tryer<number) {
					if(number / (float)tryer != 0){
						tryer++;
						}
					}
				primeNumbers[i] = number;
				e++;
				i++;
				}	
			}
		}
	}
}