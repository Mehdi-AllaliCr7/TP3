package projet_point;

public class Point_Nom extends Point_2 {
	

	public void SetPointNom(String P_Nom, int P_x, int P_y) {
		SetNom(P_Nom);
		super.setPoint(P_x, P_y);
	}
	
	public void SetNom(String P_Nom) {
		this.Nom = P_Nom;
		
	}
	public void Afficher() {
		
		afficheCoords();
		System.out.println("Nom"+ Nom);
	}
	
	private String Nom;
	
}
