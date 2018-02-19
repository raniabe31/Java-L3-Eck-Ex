import java.util.*;
import java.io.*;

public class EE47Quizz {

        private static int[] n1;
        private static int[] n2;
        private static int[] answer;
   
        public static void generateQuizz(int taille)
              {
                        for(int i = 0; i<taille; i++)
                        {
                                n1[i] = (int)(Math.random()*30+1);
                                n2[i] = (int)(Math.random()*30+1);
                                answer[i] = 0;
                        }
        
              }
        
        public static void quizz(int taille)
              {
                Scanner sc = new Scanner(System.in);
                System.out.println("Let's start the quizz");
                for(int i = 0; i<taille; i++)
                   {
                        System.out.println("Question " +(i+1) + " : "+n1[i]+" + "+n2[i]+ " = ?");
                        answer[i] = Integer.parseInt(r.nextLine());
                        
                        if(answer[i] == n1[i] + n2[i])
                        {
                                System.out.println("Great ! 10 points for Gryffondor");
                        }
                        else
                        {
                                System.out.println("Oups, sorry! The answer was : " +(n1[i]+n2[i]));
                        }
                    }
                sc.close();
        }
        
       public static void grade(int taille)
        {
                int score = 0;
                for(int i = 0; i<taille;i++)
                {
                        if(answer[i] == n1[i] + n2[i])
                        {
                                score+=10;
                        }
                }
                
                System.out.println("Your score is " + score+"/100");
        }
        public static void main(String[] args) {
              
                int taille = 10;
                n1 = new int[taille];
                n2 = new int[taille];
                answer = new int[taille];
                generateQuizz(taille);
                quizz(taille);
                grade(taille);
        }
        
}
