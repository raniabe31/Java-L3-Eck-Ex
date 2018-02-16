# Java-L3-Eck-Ex
public static void main(String[] args) {
   
           
       char ch;        
       boolean charac;
       String ligne;
       
       System.out.println("Entrez une ligne:");
		
       Scanner sc = new Scanner(System.in);
     
       String[] ligne= sc.nextLine();
       
       System.out.println();
       charac = true;
       
       for (int i = 0;  i < ligne.length();  i++ ) {
          ch = line.charAt(i);
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
