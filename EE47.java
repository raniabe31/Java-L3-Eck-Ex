/** 
 	* Ce programme permet d'administrer un quizz d'additions.
 	* Le quizz comporte 10 questions
 	* Chaque question est une addition de nombre générés aléatoirement. Par exemple 1+3=?
 	* L'utilisateur doit répondre à la totalité des questions
 	* Le programme permet ensuite d'afficher la réponse de l'utilisateur et d'indiquer si celle ci est correcte ou erronnée
 	* Si la resultonse est correcte, le user a la bonne réponse et gagne 10 pts
 	* Si la réponse est fausse, le user perd
 	* Le programme affiche  le score du user
 	*/


import java.util.Scanner;

public class EE47 {

        private static int[] nombre1;
        private static int[] nombre2;
        private static int[] result;
        
        public static void main(String[] args) {
                quizz();
                admin();
                note();
        }
        
        private static void quizz()
        {
                nombre1= new int [10];
                nombre2= new int [10];
                        for(int i = 0; i<10; i++)
                        {
                                nombre1[i] = (int)(Math.random()*50+1);
                                nombre2[i] = (int)(Math.random()*50+1);
                        }
        
       } 
        
        private static void admin()
        {
                Scanner scan = new Scanner(System.in);
                result= new int[10];
                for(int i = 0; i<10; i++)
                {
                        System.out.println("Question " +(i+1) + " : "+nombre1[i]+" + "+nombre2[i]+ " = ?");
                        result[i] = Integer.parseInt(scan.nextLine());
                }  
                scan.close();
         } 
        
        private static void note()
        {
                int nbresultok = 0;
                for(int i = 0; i<10;i++)
                {
                        if(result[i] == nombre1[i] + nombre2[i])
                        {
                                System.out.println("Bravo ! La réponse était bien"+(nombre1[i]+nombre2[i]));
                                nbresultok++;
                        }
                        else
                        {
                               System.out.println("Oups ! Vous avez répondu "+ result[i]+ " Mais la réponse etait : " +(nombre1[i]+nombre2[i]));
                         }
                

                }
                nbresultok=nbresultok*10;
                System.out.println("Votre note finale est " + nbresultok+"/100");
        }
}
