/**
 * EE43 est la classe qui simule  des lancers d'une paire dès un après l'autre 
 * jusqu'à ce que le total des deux soit égal à 2. 
 * Elle nous donne l'information de combien de dès a-t-on eu besoin pour avoir ce total
 * 
 */
package	myPackage.two;
	public class EE43 {
		/**
		    * Simule des lancers de dès jusqu'à avoir le total de 2.
		    * Condition: il faut entrer une somme de dès supérieure à 2 et inférieure à 12 
		    * @param nb la somme des dès désirée
		    * @return Le nombre de fois qui a nécessité pour avoir la somme désirée
		    * @throws IllegalArgumentException si l'argument nb n'est pas un nombre ou ne respecte pas 
		    *       la condition de l'intervale
		    */
		public static int Lancer_de(int nb)
		{
			if(nb < 2 || nb > 12)
			{
				throw new IllegalArgumentException("Le nombre de lancée doit être compris entre 2 et 12");
			}
			int d1, d2, compteur=0;

			do {
				d1 = (int) (Math.random()*6.0+1);
				d2 = (int) (Math.random()*6.0+1);
				compteur++;
			}while(d1+d2 != nb);

			return compteur;
		}




		public static void main(String[] args) 
		{
			System.out.println("Nobre de lancer nécessaire le faire : " + Lancer_de(2));     
		}


	} //Fin de la classe EE43