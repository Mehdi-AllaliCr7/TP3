package projet_point;

public class Point_2 {

	public void setPoint (int x, int y) {
	this.x = x ;
	this.y = y ;
	}
	public void deplace (int dx, int dy) {
	x += dx ;
	y += dy ;
	}
	public void afficheCoords () {
	System.out.println ("Coordonnées : " + x + " " + y) ;
	}
	private int x, y ;
	
}
