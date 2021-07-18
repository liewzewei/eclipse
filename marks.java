import java.util.Arrays;
import java.util.Scanner;

public class marks {
	

	
	public int sumArray(int[] number) {
		int sum = 0;
		for (int c=0 ; c<number.length; c++) {
			sum = sum + number[c];
		}
		return sum;
	}

	public static void main (String []args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("enter first row answer:");
		char firstRowAnswer[] = new char [20];
		for (int i = 0; i<firstRowAnswer.length; i++ ) {
			firstRowAnswer[i] = input.next().charAt(0);
		}
		
		System.out.println("enter second row answer:");
		char secondRowAnswer[] = new char [20];
		for (int i = 0; i<secondRowAnswer.length; i++ ) {
			secondRowAnswer[i] = input.next().charAt(0);
		}
		
		System.out.println("enter third row answer:");
		char thirdRowAnswer[] = new char [20];
		for (int i = 0; i<thirdRowAnswer.length; i++ ) {
			thirdRowAnswer[i] = input.next().charAt(0);
		}
		
		System.out.println("enter fourth row answer:");
		char fourthRowAnswer[] = new char [10];
		for (int i = 0; i<fourthRowAnswer.length; i++ ) {
			fourthRowAnswer[i] = input.next().charAt(0);
		}
//---------------------------------------------------------------------------------	
		for(int a = 0 ;;) {
			char tempArray1[] = new char[20];
			char tempArray2[] = new char[20];
			char tempArray3[] = new char[20];
			char tempArray4[] = new char[10];
			int tempNum1[] = new int [20];
			int tempNum2[] = new int [20];
			int tempNum3[] = new int [20];
			int tempNum4[] = new int [10];
			
			System.out.println("enter first row:");
			for (int i = 0; i<tempArray1.length; i++ ) {
				tempArray1[i] = input.next().charAt(0);
			}
			
			System.out.println("enter second row:");
			for (int i = 0; i<tempArray2.length; i++ ) {
				tempArray2[i] = input.next().charAt(0);
			}
			
			System.out.println("enter third row:");
			for (int i = 0; i<tempArray3.length; i++ ) {
				tempArray3[i] = input.next().charAt(0);
			}
			
			System.out.println("enter fourth row:");
			for (int i = 0; i<tempArray4.length; i++ ) {
				tempArray4[i] = input.next().charAt(0);
			}
//-------------------------------------------------------------------------------
			
			for (int t = 0; t<tempArray1.length; t++) {
				if (tempArray1[t]==firstRowAnswer[t]) {
					tempNum1[t] = 1;
				}
				else if (tempArray1[t]!=firstRowAnswer[t]) {
					tempNum1[t] = 0;
				}
			}
			for (int t = 0; t<tempArray2.length; t++) {
				if (tempArray2[t]==secondRowAnswer[t]) {
					tempNum2[t] = 1;
				}
				else if (tempArray2[t]!=secondRowAnswer[t]) {
					tempNum2[t] = 0;
				}
			}
			for (int t = 0; t<tempArray3.length; t++) {
				if (tempArray3[t]==thirdRowAnswer[t]) {
					tempNum3[t] = 1;
				}
				else if (tempArray3[t]!=thirdRowAnswer[t]) {
					tempNum3[t] = 0;
				}
			}
			for (int t = 0; t<tempArray4.length; t++) {
				if (tempArray4[t]==fourthRowAnswer[t]) {
					tempNum4[t] = 1;
				}
				else if (tempArray1[t]!=fourthRowAnswer[t]) {
					tempNum4[t] = 0;
				}
			}
			marks arr = new marks();
			System.out.println("First row: " + arr.sumArray(tempNum1));
			System.out.println("Second row: "+ arr.sumArray(tempNum2));
			System.out.println("Third row: "+ arr.sumArray(tempNum3));
			System.out.println("Fourth row: "+ arr.sumArray(tempNum4));
		}
	}
}
