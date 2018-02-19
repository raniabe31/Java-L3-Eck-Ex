import java.io.*;
import java.util.*;
public class EE43DesRoulants {

    public static int rolls(int score)
        {
                if(score < 2 || score > 12)
                {
                        throw new IllegalArgumentException("The desired score must be between 2 and 12");
                }
                int d1, d2, compteur=0;
                
                do {
                        d1 = (int) (Math.random()*6.0+1);
                        d2 = (int) (Math.random()*6.0+1);
                        compteur++;
                }while(d1+d2 != score);
                
                return compteur;
        }
        public static void main(String[] args) {

                System.out.println("Number of throwing for a snake eyes : " + rolls(2));
                
                
        }
        
        
 }
