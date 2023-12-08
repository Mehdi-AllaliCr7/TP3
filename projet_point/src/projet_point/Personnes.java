package projet_point;

public class Personnes {
	
	public Personnes(String P_Nom) {
        this.nom = P_Nom;
    }
	
	private String nom;
	
	public void Afficher() {
		System.out.println("Je suis une personne. Mon nom est " + nom);
	}

}

