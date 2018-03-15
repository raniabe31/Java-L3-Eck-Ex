package myPackage.two;

import java.util.Scanner;
/**
 * Ce programme génère unquiz de 10 questions, leurs réponses doivents être de type entier
 * A la fin, le programme affiche la note de l'utilisateur, en donnant un résumé des réponses (bonnes et mauvaises)
 * @author ballra17
 *
 */
public class EE57 {


	 static class AdditionQuestion implements IntQuestion {
		private int x;
		private int y;
		public AdditionQuestion() { // on initialise le constructeur en determinant les valeurs x et y
			x = (int)(Math.random() * 50 + 1);
			y = (int)(Math.random() * 50);
		}
		@Override
		public String getQuestion() {

			return "A quoi est égal"+ x + "+"+ y +"?";
		}

		@Override
		public int getCorrectAnswer() {
			return x+y;
		}

	}
	 static class SubtractionQuestion implements IntQuestion {
		 private int x;
		 private int y;
		 public SubtractionQuestion() { // on initialise le constructeur en determinant les valeurs x et y
			 x = (int)(Math.random() * 50 + 1);
			 y = (int)(Math.random() * 50);
			 if (y > x) { 
				 // pour empêcher que le résultat soit inférieur à zero, on valeur intermediaire aux 
				 int aux = x;
				 x = y;
				 y = aux;
			 }
		 }

		 @Override
		 public String getQuestion() {
			 return  "A quoi est égal"+ x + "-"+ y +"?";
		 }
		 @Override
		 public int getCorrectAnswer() {
			 return x-y;
		 }

	 }
	 
	 private static IntQuestion[] questions;
	 
	 private static int[] reponses;
	 /**
	     * Cree un tableau d'objets qui contient les questions du quiz
	     */
	 private static void creer_quiz() {
		 
		 questions = new IntQuestion[10];
		 for ( int i = 0; i < 7; i++ ) {
			 if (Math.random() < 0.5)
				 questions[i] = new AdditionQuestion();
			 else
				 questions[i] = new SubtractionQuestion();
		 }
		 
		 questions[7] = new IntQuestion() 
		 {
			 
			 public String getQuestion() {
				 return "Combien y a-t-il de ligne de métro à Paris";
			 }
			 
			 public int getCorrectAnswer() {
				 return 15;
			 }
		 };
		 
		 questions[8] = new IntQuestion()
		 {
			 public String getQuestion() {
				 return "Combien de bosse(s) à un chameau";
			 }
			 public int getCorrectAnswer() {
				 return 2;
			 }
		 };
		 
		 questions[9] = new IntQuestion() 
		 {
			 public String getQuestion() {
				 return "Quel est le nombre d'élève en L3 MIAGE en apprentissage";
			 }
			 public int getCorrectAnswer() {
				 return 24;
			 }
		 };
}
	 private static void administerQuiz() {
		 Scanner sc = new Scanner(System.in);
		 reponses = new int[10];
		 for (int i = 0; i < 10; i++) {
			 int questionNum = i + 1;
			 System.out.printf("Question %2d:  %s ",
					 questionNum, questions[i].getQuestion());

			 reponses[i] = sc.nextInt();
		 }
	 }
	    private static void note_du_quiz() {
	        System.out.println();
	        System.out.println("Les résultats du quiz");
	        System.out.println();
	        int nb_correct = 0;
	        int note;
	        for (int i = 0; i < 10; i++) {
	            System.out.println("Question numéro " + (i+1) + ":");
	            System.out.println("    " + questions[i].getQuestion());
	            System.out.println("    Correct answer:  " + questions[i].getCorrectAnswer());
	            if ( reponses[i] == questions[i].getCorrectAnswer() ) {
	                System.out.println("    Vous avez raison.");
	                nb_correct++;
	            }
	            else {
	                System.out.println("    Vous avez répondu " + reponses[i] + ", ce qui est incorrect");
	            }
	            System.out.println();
	        }
	        note = nb_correct * 10;
	        System.out.println();
	        System.out.println("Vous avez " + nb_correct + " réponses correctes.");
	        System.out.println("Votre note finale " + note);
	        System.out.println();
	    }
}
		 
		 
		 
		 
		 
		 
		 
		 
		 