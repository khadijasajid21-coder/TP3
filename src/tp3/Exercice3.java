package tp3;

import java.util.Scanner;

public class Exercice3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Combien de valeurs : ");
		int n = sc.nextInt();

		int[] tab = new int[n];

		for (int i = 0; i < n; i++) {
			tab[i] = 2 * (i + 1) - 1;
		}

		for (int i = 0; i < n; i++) {
			int x = tab[i];
			int carre = x * x;
			System.out.println(x + " a pour carre " + carre);
		}
	}
}
