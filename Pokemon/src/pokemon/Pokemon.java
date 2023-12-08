package pokemon;
public class Pokemon {

	private String nom;
	private int pv;
	private int atk;
	
	public String getNom() {
		return nom;
	}
	
	public int getAtk() {
		return atk;
	}
	
	public int getPv() {
		return pv;
	}
	
	public boolean estKo() {
		return pv<=0;
	}
	
	protected void Infligerdegat(int degats) {
		pv-=degats;
		if(pv<0)
		pv=0;
	}
	
	public void blessePar( Pokemon autrePokemon) {
		autrePokemon.Infligerdegat(autrePokemon.atk);
	}
	
	public void attaquer( Pokemon autrePokemon) {
		autrePokemon.blessePar(this);
	}
}
