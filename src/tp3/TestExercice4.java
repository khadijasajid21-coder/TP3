package tp3;

public class TestExercice4 {
	
	    public static void main(String[] args) {

	        double[][] t1 = {
	            {1, 2, 3},
	            {4, 5, 6}
	        };

	        double[][] t2 = {
	            {10, 20, 30},
	            {40, 50, 60}
	        };

	        System.out.println("=== Tableau t1 ===");
	        Exercice4.affiche(t1);

	        System.out.println("Régulier ? " + Exercice4.regulier(t1));

	        System.out.println("\n=== Somme des lignes de t1 ===");
	        double[] somme = Exercice4.sommeLignes(t1);
	        for (double x : somme) System.out.println(x);

	        System.out.println("\n=== Somme t1 + t2 ===");
	        double[][] result = Exercice4.somme(t1, t2);

	        if (result != null) {
	        	Exercice4.affiche(result);
	        } else {
	            System.out.println("Somme impossible (tableaux non réguliers ou dimensions différentes)");
	        }
	    }
	}
