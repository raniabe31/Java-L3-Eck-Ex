import java.io.*;
import java.util.*;
  
public class EE34ChaineDeCar {

   public static void main(String[] args) {
   
           
       char ch;        
       boolean charac;
       String ligne;
       
       System.out.println("Entrez une ligne:");
		
       Scanner sc = new Scanner(System.in);
     
       //String[] line= sc.nextLine();
       
       System.out.println();
       charac = true;
       
     String line = null;
	for (int i = 0;  i < line.length();  i++ ) {
          String line1 = null;
		ch = line1.charAt(i);
          if ( Character.isLetter(ch) ) {
             System.out.print(ch);
             charac = false;
          }
          else {
             if ( charac == false ) {
                System.out.println();
                charac = true;
             }
          }
       }
       
       System.out.println();
         
   } 
}
