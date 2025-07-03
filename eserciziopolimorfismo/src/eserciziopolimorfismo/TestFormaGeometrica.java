package eserciziopolimorfismo;

public class TestFormaGeometrica {
	public static void main(String[] args) {
		FormaGeometrica cerchio = new Cerchio("Cerchio Snake", "Nero", 10.0d);
		FormaGeometrica rettangolo = new Rettangolo("Rettangolo Liquid", "Magenta", 25.0d, 20.0d);
		FormaGeometrica triangolo = new Triangolo("Triangolo Colonello", "Fucsia", 10.0d, 8.0d, 6.0d);
		
		/*
		if(cerchio instanceof Figura) {
			((Figura) cerchio).mostraInfo();
			System.out.println("Area: " + cerchio.calcolaArea());
			System.out.println("Perimetro: " + cerchio.calcolaPerimetro());
			System.out.println("################################################################################");
		}
		
		if(rettangolo instanceof Figura) {
			((Figura) rettangolo).mostraInfo();
			System.out.println("Area: " + rettangolo.calcolaArea());
			System.out.println("Perimetro: " + rettangolo.calcolaPerimetro());
			System.out.println("################################################################################");
		}
		
		if(triangolo instanceof Figura) {
			((Figura) triangolo).mostraInfo();
			System.out.println("Area: " + triangolo.calcolaArea());
			System.out.println("Perimetro: " + triangolo.calcolaPerimetro());
			System.out.println("################################################################################");
		}
		*/
		
		// Versione ciclo foreach
		FormaGeometrica[] forme = {cerchio, rettangolo, triangolo};
		
		for (FormaGeometrica forma : forme) {
			System.out.println("-------------------------------------");
		    if (forma instanceof Figura) {
		    	((Figura) forma).mostraInfo();
		    }
		            
		    System.out.println("Area: " + forma.calcolaArea());
		    System.out.println("Perimetro: " + forma.calcolaPerimetro());
		}
	}
}