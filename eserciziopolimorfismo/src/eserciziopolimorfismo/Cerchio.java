package eserciziopolimorfismo;

public class Cerchio extends Figura implements FormaGeometrica{
	private double raggio;
	
	// Costruttore
	public Cerchio () {
		super();
		this.raggio = 0.0d;
	}
	
	public Cerchio (String nome, String colore, double raggio) {
		super(nome, colore);
		this.raggio = raggio;
	}
	
	// Metodi
	@Override
	public void mostraInfo() {
		System.out.println("Nome: " + this.getNome() + " Colore: " + this.getColore() + " Raggio: " + raggio);
	}
	
	@Override
	public double calcolaArea() {
		return Math.PI*raggio*raggio;
	};
	
	@Override
	public double calcolaPerimetro() {
		return 2*Math.PI*raggio;
	};
}