package eserciziopolimorfismo;

abstract public class Figura {
	// Attributi
	private String nome;
	private String colore;

	// Costruttore
	public Figura () {
		super();
		this.nome = "N/A";
		this.colore = "N/A";
	};
	
	public Figura (String nome, String colore) {
		super();
		this.setNome(nome);
		this.setColore(colore);
	};
	
	// Metodi
	abstract void mostraInfo();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getColore() {
		return colore;
	}

	public void setColore(String colore) {
		this.colore = colore;
	};
};