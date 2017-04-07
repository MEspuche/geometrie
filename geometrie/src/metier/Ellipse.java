package metier;

public class Ellipse extends Forme {

	private int grandAxe;
	private int petitAxe;
	
	@Override
	public float perimetre() {
		float resultat = 0;
		float pcarre = petitAxe* petitAxe;
		float gcarre = grandAxe * grandAxe;
		float sinus, cosinus;
		
		for (int i=0; i<1000;i++)
		{
			sinus = (float)Math.sin(i*Math.PI/2000);
			cosinus = (float)Math.cos(i*Math.PI/2000);
			resultat += Math.sqrt(pcarre * sinus*sinus +gcarre*cosinus*cosinus);
		}
		resultat *=4*Math.PI/2000;
		return resultat;
	}

	@Override
	public float surface() {
	
		return (float)Math.PI * petitAxe * grandAxe;
	}

	@Override
	public String toString() {
		return "Ellipse [grandAxe=" + grandAxe + ", petitAxe=" + petitAxe + "]";
	}

	public int getGrandAxe() {
		return grandAxe;
	}

	public void setGrandAxe(int grandAxe) {
		this.grandAxe = grandAxe;
	}

	public int getPetitAxe() {
		return petitAxe;
	}

	public void setPetitAxe(int petitAxe) {
		this.petitAxe = petitAxe;
	}

	public Ellipse(int grandAxe, int petitAxe) {
		super();
		this.grandAxe = grandAxe;
		this.petitAxe = petitAxe;
	}
	
	

}
