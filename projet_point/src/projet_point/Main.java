package projet_point;

public class Main {

	public static void main(String[] args) {
		
//		Point Le_Point = new Point();
//		Point_A Le_Point_A = new Point_A();
//		
//		Le_Point.initialise(1, 2);
//		Le_Point_A.initialise(5, 6);
////		Le_Point_A.Afficher();
		
		//Point_Nom Le_Point_Nom = new Point_Nom();
		 Personnes[] personnes = new Personnes[3];
	        personnes[0] = new Inge_Reseau("Paul");
	        personnes[1] = new Inge_Logiciel("Philippe");
	        personnes[2] = new Inge_Reseau("Pierre");

	        for (int i = 0; i < personnes.length; i++)
	            personnes[i].Afficher();
		
	}

}
