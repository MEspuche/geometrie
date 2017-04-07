package metier;

public class Carre extends Forme {

	private int cote;
	
	@Override
	public float perimetre() {
		return 4* cote;
	}

	@Override
	public float surface() {
		return cote * cote;
	}

	public int getCote() {
		return cote;
	}

	public void setCote(int cote) {
		this.cote = cote;
	}

	public Carre(int cote) {
		super();
		this.cote = cote;
	}

	@Override
	public String toString() {
		return "Carre [cote=" + cote + "]";
	}
	
	

}
