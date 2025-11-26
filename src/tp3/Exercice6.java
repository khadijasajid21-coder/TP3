package tp3;

import java.util.Scanner;

public class Exercice6 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			int t[] = new int[n];

			for (int i = 0; i < n; i++) {
				t[i] = sc.nextInt();

			}
			int MAXV = 100000;
			int[] freq = new int[MAXV + 1];
			int distinct = 0;

			for (int i = 0; i < k; i++) {
				int x = t[i];
				if (freq[x] == 0) {
					distinct++;
				}
				freq[x]++;
			}

		
		  System.out.print(distinct);
		  for (int i = k; i < n; i++) {

	            int out = t[i - k];  
	            int in = t[i];       

	         
	            freq[out]--;
	            if (freq[out] == 0) {
	                distinct--;
	            }
	            if (freq[in] == 0) {
	                distinct++;
	            }
	            freq[in]++;

	          
	            System.out.print(" " + distinct);
	        }

	        System.out.println();
	    }
	}
	

}
