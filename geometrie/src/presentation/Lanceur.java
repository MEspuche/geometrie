package presentation;

import metier.Carre;
import metier.Ellipse;
import metier.Rectangle;

public class Lanceur {

	public static void main (String[]args) {
	Carre c = new Carre(8);
	Rectangle r = new Rectangle(10,3);
	Ellipse e = new Ellipse(20, 4);
	
	System.out.println(c);
	System.out.println("le perimètre du carre est de " + c.perimetre());
	System.out.println("la surface du carre est de " + c.surface());
	System.out.println("le coefficient d'étalement du carre est de " + c.coefficientEtalement());
	
	System.out.println("-------------------------------------------------------");
	
	System.out.println(r);
	System.out.println("le perimètre du rectagle est de " + r.perimetre());
	System.out.println("la surface du rectagle est de " + r.surface());
	System.out.println("le coefficient d'étalement du rectangle est de " + r.coefficientEtalement());
	
	System.out.println("-------------------------------------------------------");
	
	System.out.println(e);
	System.out.println("le perimètre de l'ellipse est de " + e.perimetre());
	System.out.println("la surface de l'ellipse est de " + e.surface());
	System.out.println("le coefficient d'étalement de l'ellipse est de " + e.coefficientEtalement());
	
	}
	
}
