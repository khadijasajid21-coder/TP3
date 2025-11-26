package tp3;

public class Exercice4 {

	    // 1) Affiche un tableau 2D
	    public static void affiche(double[][] t) {
	        for (int i = 0; i < t.length; i++) {
	            for (int j = 0; j < t[i].length; j++) {
	                System.out.print(t[i][j] + " ");
	            }
	            System.out.println(); // retour à la ligne
	        }
	    }

	    // 2) Vérifie si le tableau est régulier (même nombre de colonnes partout)
	    public static boolean regulier(double[][] t) {
	        int longueur = t[0].length; // longueur de la première ligne

	        for (int i = 1; i < t.length; i++) {
	            if (t[i].length != longueur) {
	                return false; // irrégulier
	            }
	        }
	        return true; // tout est égal
	    }

	    // 3) Somme des lignes
	    public static double[] sommeLignes(double[][] t) {
	        double[] result = new double[t.length];

	        for (int i = 0; i < t.length; i++) {
	            double somme = 0;
	            for (int j = 0; j < t[i].length; j++) {
	                somme += t[i][j];
	            }
	            result[i] = somme;
	        }

	        return result;
	    }

	  
	    public static double[][] somme(double[][] t1, double[][] t2) {

	        // Vérification régularité
	        if (!regulier(t1) || !regulier(t2)) return null;

	        // Vérification dimensions
	        if (t1.length != t2.length || t1[0].length != t2[0].length)
	            return null;

	        double[][] res = new double[t1.length][t1[0].length];

	        for (int i = 0; i < t1.length; i++) {
	            for (int j = 0; j < t1[i].length; j++) {
	                res[i][j] = t1[i][j] + t2[i][j];
	            }
	        }
	        return res;
	    }
	}

