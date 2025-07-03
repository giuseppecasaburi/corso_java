package eserciziodispositivi;

public class Dispositivo {
	protected String nome;
	protected boolean acceso;
	protected boolean spento;
	
	
	// Costruttore
	public Dispositivo(String nome) {
		super();
		this.nome = nome;
	};
	
	// Metodi
	public void Accendi() {
		this.acceso = true;
		System.out.println("Dispositivo "+ nome + " acceso.");
	};
	
	public void Spegni() {
		this.spento = true;
		System.out.println("Dispositivo "+ nome + " spento.");
	};
	
	public void MostraInfo() {
		System.out.println("Dispositivo "+ nome);
	};
	
	// Overload
	public void MostraInfo(String nome) {
		if(nome != null) {
			System.out.println("Dispositivo "+ nome + " stato: " + (acceso ? "acceso" : "spento"));
		} else {
			MostraInfo();
		}
	};
};




