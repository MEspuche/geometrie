package metier;

public class Rectangle extends Forme {

	private int longueur;
	private int largeur;
	
	
	
	public Rectangle(int longueur, int largeur) {
		super();
		this.longueur = longueur;
		this.largeur = largeur;
	}

	public int getLongueur() {
		return longueur;
	}

	public void setLongueur(int longueur) {
		this.longueur = longueur;
	}

	public int getLargeur() {
		return largeur;
	}

	public void setLargeur(int largeur) {
		this.largeur = largeur;
	}
	
	@Override
	public float perimetre() {
		return 2* (longueur + largeur);
	}

	@Override
	public float surface() {
		return longueur * largeur;
	}

	@Override
	public String toString() {
		return "Rectangle [longueur=" + longueur + ", largeur=" + largeur + "]";
	}
	
	
}
