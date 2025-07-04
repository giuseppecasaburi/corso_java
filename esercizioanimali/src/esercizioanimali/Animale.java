package esercizioanimali;

public abstract class Animale implements ComportamentoAnimali {
	private String nome;
	private String habitat;
	private String dieta;
	
	// Costruttore
	public Animale() {
		super();
		this.nome = "N/A";
		this.habitat = "N/A";
		this.dieta = "N/A";
	};
	
	public Animale(String nome, String habitat, String dieta) {
		super();
		setNome(nome);
		setHabitat(habitat);
		setDieta(dieta);
	};
	
	
	// Metodi
	public String getNome() {
		return nome;
	};
	
	public String getHabitat() {
		return habitat;
	};
	
	public String getDieta() {
		return dieta;
	};
	
	public void setHabitat(String habitat) {
		this.habitat = habitat;
	};
	
	public void setNome(String nome) {
		this.nome = nome;
	};
	
	public void setDieta(String dieta) {
		this.dieta = dieta;
	};
}