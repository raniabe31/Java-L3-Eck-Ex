import java.io.*;
import java.util.*;

public class EE36PGDC {

   public static void main(String[] args) {
   
                   
       int divmax; 
       
       int[] divTab = new int[10001]; 
       
       
       
       divmax = 1; 
       divTab[1] = 1;
       
       for ( int i = 2;  i <= 10000;  i++ ) {
       
           int compteur = 0; 
         
           for ( int j = 1;  j <= i;  j++ ) {  
              if ( i % j == 0 )
                 compteur++;
           }
           
           divTab[i] = compteur;  
           
           if (compteur > divmax) {
              divmax = compteur;
           }
       
       }
       
       System.out.println("Among integers between 1 and 10000,");
       System.out.println("The maximum number of divisors was " + divmax);
       System.out.println("Numbers with that many divisors include:");
 
	//for ( int i = 1; i <= 10000; N++ ) {
        //  if (  divTab[i] == divmax ) {
          //     System.out.println( "   " + i);
          // }
       //}
   
   } 
}
