package by.home.maxzzzit;

public class VivodDvumernogoMassiva {
	public static void main(String[]args) {
		int [][]mas= {{3,4,7,2},{8,3,2,6},{7,4,5,9}};
			for (int row=0; row<mas.length; row++) {
				for (int col=0; col<mas[row].length; col++) {
					System.out.print(mas[row][col]+" ");
				}
			System.out.println();
			}
	}
}
