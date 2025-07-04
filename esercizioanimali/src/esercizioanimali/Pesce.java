package esercizioanimali;

public class Pesce extends Animale implements ComportamentoAnimali, Mangiante{
	private String colore;
	private String specie;
	private int pesoKg;
	
	// Costruttore
	public Pesce() {
		super();
		this.colore = "N/A";
		this.specie= "N/A";
		this.pesoKg = 0;
	}
	
	public Pesce(String nome, String habitat, String dieta, int pesoKg, String colore, String specie) {
		super(nome, habitat, dieta);
		setColore(colore);
		setPeso(pesoKg);
		setSpecie(specie);
	}
	
	// Metodi Getters e Setters
	public int getPeso() {
		return pesoKg;
	}

	public void setPeso(int pesoKg) {
		this.pesoKg = pesoKg;
	}
	
	public String getSpecie() {
		return specie;
	}

	public void setSpecie(String specie) {
		this.specie = specie;
	}

	public String getColore() {
		return colore;
	}

	public void setColore(String colore) {
		this.colore= colore;
	}
	
	
	// Metodi implementati dall'interfaccia ComportamentoAnimali
	public void emettiVerso() {
		System.out.println("Il pesce " + getNome() + " non emette suono udibile.");
	};

	public void muoviti() {
		System.out.println("Il pesce " + getNome() + " nuota.");
	};
	
	public void mostraInfo() {
		System.out.println("Il pesce con nome: " + getNome() + ", ha peso: " + getPeso() + ", ha habitat: " + getHabitat() + ", è di colore: " + getColore() + ", appartiene alla specie: " + getSpecie() + " ed infine ha una dieta: " + getDieta() + ".");
	};
	
	
	// Metodi implementati dall'interfaccia Mangiante
	public void mangia() {
		System.out.println("Il pesce " + getNome() + " sta mangiando.");
	};
}