package metier;

public abstract class Forme {


	public abstract float perimetre();
	public abstract float surface();
	
	public double coefficientEtalement()
	{
		double lePerimetre = perimetre();
		return 16 * surface() / (lePerimetre*lePerimetre);

	}
	
	
}
