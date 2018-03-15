package myPackage.two;
/**
 * La classe EE53 permet de :
 * Lancer une paire de dès 
 * Demander à l'utilisateur d'entrer la somme des deux dès désirée
 * Afficher combien de fois il a fallut lancer la paire avant d'obtenir le résultat demandé
 * Informer l'utilisateur de la moyenne totale, de l'ècart-type et du maximum des lancers de dès nécessaires
 * @author raniabe31"
 *
 */
public class EE53 {

	public EE53() {
	}
	/**
	 * @param nombre_exper : nombre de fois l'éxperience est répétée
	 */
	static final int nombre_exper = 10000;

	/**
	 * @param dice : Une paire de dès
	 */
	private static PairOfDice dice = new PairOfDice();

	/**
	 * la méthode Roller
	 * @param n total des deux dès
	 * @return la méthode roller renvoie le nombre de fois on a lancé les dès pour obtenir la somme n
	 */

	static int roller(int n) {
	/**
	 *  @param compteur : compte combien de lancers ont été réalisées pour l'obtention de n
	 */
		int compteur = 0;
		//on va répéter les lancers tant qu'on a pas la somme des dès désirée (ici n)
		do {
			dice.roll();
			compteur++;
		}while(dice.getTotal() != n);
		return compteur; 
	}
	public static void main(String[] args) {
		System.out.println("La moyenne **Le total** l'écart-type ** le nombre maximal ");
		for (int i=2; i<=12; i++) {
			StatCalc statistique = new StatCalc();
			for (int j = 0; j < nombre_exper; j++) {
				statistique.enter (roller(i)); 
			}
			System.out.print(i);
			System.out.printf("%18.3f", statistique.getMean());
			System.out.printf("%19.3f", statistique.getStandardDeviation());
			System.out.printf("%14.3f", statistique.getMax());
			System.out.println();


		}


	}
}