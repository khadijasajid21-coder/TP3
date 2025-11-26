package tp3;

import java.util.Scanner;

public class Exercice5 {
	public static void matrice(int[][] m) {

		int n = m.length;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				int temp = m[i][j];
				m[i][j] = m[j][i];
				m[j][i] = temp;

			}

		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n / 2; j++) {
				int temp = m[i][j];
				m[i][j] = m[i][n - 1 - j];
				m[i][n - 1 - j] = temp;

			}
		}

	}

	public static void rotation(int[][] m) {
		for (int i = 0; i < m.length; i++) {
			for (int j = i + 1; j < m.length; j++) {
				int temp = m[i][j];
				m[i][j] = m[j][i];
				m[j][i] = temp;
			}
		}
		for (int j = 0; j < m.length; j++) {
			for (int i = j + 1; j < m.length / 2; i++) {
				int temp = m[i][j];
				m[i][j] = m[m.length - 1 - i][j];
				m[m.length - 1 - i][j] = temp;
			}
		}
	}

	public static void rotat(int[][] A) {
		int N = A.length;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (i * N + j >= (N * N) / 2)
					break;
				int temp = A[i][j];
				A[i][j] = A[N - 1 - i][N - 1 - j];
				A[N - 1 - i][N - 1 - j] = temp;
			}
		}
	}

	public static void afficherMatrice(int[][] A) {
		int N = A.length;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print(A[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int N = sc.nextInt();
			int[][] A = new int[N][N];

			for (int i = 0; i < N; i++)
				for (int j = 0; j < N; j++)
					A[i][j] = sc.nextInt();

			matrice(A);

			afficherMatrice(A);
		}

	}

}
