package eserciziopolimorfismo;

public class Triangolo extends Figura implements FormaGeometrica {
	private double latoA;
	private double latoB;
	private double latoC;
	
	// Costruttore
	public Triangolo () {
		super();
		this.latoA = 0.0d;
		this.latoB = 0.0d;
		this.latoC = 0.0d;
	}
	
	public Triangolo (String nome, String colore, double latoA, double latoB, double latoC) {
		super(nome, colore);
		this.latoA = latoA;
		this.latoB = latoB;
		this.latoC = latoC;
	}
	
	// Metodi
	@Override
	public void mostraInfo() {
		System.out.println("Nome: " + this.getNome() + " Colore: " + this.getColore() + " LatoA: " + latoA + " LatoB: " + latoB + " LatoC: " + latoC);
	}
	
	@Override
	public double calcolaArea() {
		double s = (latoA + latoB + latoC) / 2;
		return Math.sqrt(s * (s - latoA) * (s - latoB) * (s - latoC));
	};
	
	@Override
	public double calcolaPerimetro() {
		double s = (latoA + latoB + latoC);
		return s;
	};
}
