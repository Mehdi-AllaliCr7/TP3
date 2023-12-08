package exo3_2;

public class Cercle extends Forme{
	private double rayon;
	
	@Override
	public double getSurface() {
		return rayon * rayon + Math.PI;
	}
	
	@Override 
	public String toString() {
		return "Cercle [rayon =" + rayon + "]";
	}
}
