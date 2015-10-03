package microsoft_competition;

import java.util.ArrayList;
import java.util.Scanner;

public class MatrixMultiplication {
	private int a[][];
	private int b[][];
	private int sum[][];

	public void calculateSum(int a[][], int b[][]) {
		sum = new int[a.length][b[0].length];

		// Iterate through rows of a
		for (int i = 0; i < a.length; i++) {
			
			// In the current row of A, loop through each column value
			for (int j=0; j<b[0].length; j++){
				
				for(int k=0; k< a[0].length; k++){
					sum[i][j] += a[i][k]*b[k][j];
				}
			}

		}
	}
	public void ReadMatrix(String s){
		Scanner sc= new Scanner(s).useDelimiter("/n");

		ArrayList<ArrayList<Integer>> aValues = new ArrayList<ArrayList<Integer>>();
		ArrayList<ArrayList<Integer>> bValues = new ArrayList<ArrayList<Integer>>();
		aValues.clear();
		bValues.clear();

		while(sc.hasNext()) {
			String currentLine = sc.nextLine();

			// We have one line with one or more matrix rows
			// e.g. |1 2 3| |3 4|

			ArrayList<Integer> currentAValues = new ArrayList<Integer>();
			ArrayList<Integer> currentBValues = new ArrayList<Integer>();

			currentAValues.clear();
			currentBValues.clear();

			// See if we should add values to A or B
			//If A: line starts with "|"
			//If B: line starts with " "

			if (currentLine.charAt(0) == '|') {
				// Add values to A

				Boolean bStarted = false;
				int indexWhereBStarted = -1;
				String currentNum = "";
				
				for (int i = 1; i < currentLine.length(); i++) {

					if (currentLine.charAt(i) != '|' && !bStarted) {
						// Add to A
						
						if ((currentLine.charAt(i) != ' ')) {
							
							String currentChar = String.valueOf(currentLine.charAt(i));
							currentNum += currentChar;
							// currentAValues.add(Integer.parseInt(currentChar));
						}
						else {
							// we have found a space
							// currentNum has all digits
							if (currentNum != "") {
								currentAValues.add(Integer.parseInt(currentNum));
								currentNum = "";
							}
						}
					}
					else {
						if (bStarted == false) {
							// Start adding to B
							bStarted = true;
							indexWhereBStarted = i;
						}

						// if the next char is also '|', then b started
						if (currentLine.charAt(indexWhereBStarted+2) != '|') {
							break;
						}
						else if (currentLine.charAt(i) != ' ' && currentLine.charAt(i) != '|') {
							// add values to b
							String currentChar = String.valueOf(currentLine.charAt(i));
							currentBValues.add(Integer.parseInt(currentChar));
						}
					}
				}
			} // end check if A values present

			// In this case, only B values are present, e.g. " | 4 5 5 |"
			else if (currentLine.charAt(0) == ' ') {
				// Add values to B

				for (int i = 1; i < currentLine.length(); i++) {
					if (currentLine.charAt(i) != '|' && (currentLine.charAt(i) != ' ')) {
						// Add to B
						String currentChar = String.valueOf(currentLine.charAt(i));
						currentBValues.add(Integer.parseInt(currentChar));
					}
				}
			}

			if (currentAValues != null && !currentAValues.isEmpty()) {
				aValues.add(currentAValues);
			}

			if (currentBValues != null && !currentBValues.isEmpty()) {
				bValues.add(currentBValues);
			}

		} // end for loop that processes entire line

		// At this point, we have 2d arrays in nested lists
		// need to translate them to 2d arrays
		a=new int[aValues.size()][aValues.get(0).size()];
		b=new int[bValues.size()][bValues.get(0).size()];

		for (int i=0; i< a.length;i++) {
			if (aValues.size() > 0) {
				for (int j=0; j<a[i].length; j++){
					a[i][j]=aValues.get(i).get(j);
				}
			}
		}

		for (int i=0; i<b.length;i++) {
			if (bValues.size() > 0) {
				for (int j=0; j<b[i].length; j++){
					b[i][j]=bValues.get(i).get(j);
				}
			}
		}
	}

	public static void main(String argc[]){
		MatrixMultiplication mm= new MatrixMultiplication();
		mm.ReadMatrix("| 10 2 3 | |  7  8 |\n"
				+ "| 4 5 6 | |  9 10 |\n" 
          + " | 11 12 |");
		mm.calculateSum(mm.a, mm.b);

		for (int i = 0; i < mm.sum.length; i++) {
			System.out.print("|");
			for (int j = 0; j < mm.sum[i].length; j++) {
				System.out.print(mm.sum[i][j] + " ");
			}
			System.out.print("|\n");
		}
	}
}
