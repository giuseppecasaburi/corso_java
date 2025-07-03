package eserciziopolimorfismo;

public class Rettangolo extends Figura implements FormaGeometrica {
	private double base;
	private double altezza;
	
	// Costruttore
	public Rettangolo () {
		super();
		this.base = 0.0d;
		this.altezza = 0.0d;
	}
	
	public Rettangolo (String nome, String colore, double base, double altezza) {
		super(nome, colore);
		this.base = base;
		this.altezza = altezza;
	}
	
	// Metodi
	@Override
	public void mostraInfo() {
		System.out.println("Nome: " + this.getNome() + " Colore: " + this.getColore() + " Base: " + base + " Altezza: " + altezza);
	}
	
	@Override
	public double calcolaArea() {
		return base*altezza;
	};
	
	@Override
	public double calcolaPerimetro() {
		return 2*(base+altezza);
	};
}
