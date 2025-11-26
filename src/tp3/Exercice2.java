package tp3;

import java.util.Scanner;

public class Exercice2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Entrer le nombre de ligne : ");
		int L = scanner.nextInt();
		int i;
		int j;
		int n;
		for (i = 1; i <= L; i++) {
			for (j = 1; j <= L - i; j++) {
				System.out.print(" ");
			}
			for (n = 1; n <= (2 * i - 1); n++) {

				System.out.print("*");

			}
			System.out.println();
		}

		scanner.close();
	}

}
