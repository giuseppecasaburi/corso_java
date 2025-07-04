package esercizioanimali;

public class Cane extends Animale implements ComportamentoAnimali, Riportante, Mangiante {
	private int eta;
	private String razza;
	
	// Costruttore
	public Cane() {
		super();
		this.eta = 0;
		this.razza = "N/A";
	}
	
	public Cane(String nome, String habitat, String dieta, int eta, String razza) {
		super(nome, habitat, dieta);
		setEta(eta);
		setRazza(razza);
	}
	
	// Metodi Getters e Setters
	public int getEta() {
		return eta;
	}

	public void setEta(int eta) {
		this.eta = eta;
	}

	public String getRazza() {
		return razza;
	}

	public void setRazza(String razza) {
		this.razza = razza;
	}
	
	
	// Metodi implementati dall'interfaccia ComportamentoAnimali
	public void emettiVerso() {
		System.out.println("Il cane " + getNome() + " abbaia.");
	};

	public void muoviti() {
		System.out.println("Il cane " + getNome() + " corre.");
	};
	
	public void mostraInfo() {
		System.out.println("Il cane con nome: " + getNome() + ", ha età: " + getEta() + ", ha habitat: " + getHabitat() + ", e di razza: " + getRazza() + " ed infine ha una dieta: " + getDieta() + ".");
	};
	
	
	// Metodi implementati dalle interfacce Riportante e Mangiante
	public void riporto() {
		System.out.println("Il cane " + getNome() + " riporta l'oggetto.");
	};
	
	public void mangia() {
		System.out.println("Il cane " + getNome() + " sta mangiando.");
	}
}