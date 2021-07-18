import java.util.Arrays;
import java.util.Scanner;

public class yaTidak {
	
	public int sumArray(int[] number) {
		int sum = 0;
		for (int c=0 ; c<number.length; c++) {
			sum = sum + number[c];
		}
		return sum;
	}
	
	public char[] inputArray(char[] Array, String name) {
		Scanner a = new Scanner(System.in);
		char[] tempArray = new char[20];
		System.out.print("Please enter the elements of " + name);
		for (int i =0;i<tempArray.length; i++ ) {
			tempArray[i] = a.next().charAt(0);
		}
		for(int t = 0; t<tempArray.length;t++) {
			Array[t] = tempArray[t];
		}
		return Array;
	}
	
	public int[] numArray(char[] wordArray, int [] numberArray) {
		for (int y = 0; y<wordArray.length;y++) {
			if(wordArray[y] == 'Y') {
				numberArray[y] = 1;
			}
			else {
				numberArray[y] = 0;
			}
		}
		return numberArray;
	}
	
	public static void main(String[]args) {
		yaTidak arr = new yaTidak();
		yaTidak jumlah = new yaTidak();
		yaTidak numArr = new yaTidak();
		Scanner r = new Scanner(System.in);
		char[] row0 = new char [10];
		char[] row1 = new char [20];
		char[] row2 = new char [20];
		char[] row3 = new char [20];
		char[] row4 = new char [20];
		char[] row5 = new char [20];
		char[] row6 = new char [20];
		String name1 = "row 2: ";
		String name2 = "row 3: ";
		String name3 = "row 4: ";
		String name4 = "row 5: ";
		String name5 = "row 6: ";
		String name6 = "row 7: ";
		int[] num0 = new int [10];
		int[] num1 = new int [20];
		int[] num2 = new int [20];
		int[] num3 = new int [20];
		int[] num4 = new int [20];
		int[] num5 = new int [20];
		int[] num6 = new int [20];
		
		
		System.out.println("Please enter the Students' answers: ");
		for(int u = 0;;) {
			
			System.out.print("Please enter the elements of row 1: ");
			for (int i =0;i<row0.length; i++ ) {
				row0[i] = r.next().charAt(0);
			}

			
			arr.inputArray(row1,name1);
			arr.inputArray(row2,name2);
			arr.inputArray(row3,name3);
			arr.inputArray(row4,name4);
			arr.inputArray(row5,name5);
			arr.inputArray(row6,name6);
			
			numArr.numArray(row0, num0);
			numArr.numArray(row1, num1);
			numArr.numArray(row2, num2);
			numArr.numArray(row3, num3);
			numArr.numArray(row4, num4);
			numArr.numArray(row5, num5);
			numArr.numArray(row6, num6);
			
			System.out.println("Row 1 value is: " + jumlah.sumArray(num0));
			System.out.println("Row 2 value is: " + jumlah.sumArray(num1));
			System.out.println("Row 3 value is: " + jumlah.sumArray(num2));
			System.out.println("Row 4 value is: " + jumlah.sumArray(num3));
			System.out.println("Row 5 value is: " + jumlah.sumArray(num4));
			System.out.println("Row 6 value is: " + jumlah.sumArray(num5));
			System.out.println("Row 7 value is: " + jumlah.sumArray(num6));
			System.out.println("\n");

		}
		
	}

}
