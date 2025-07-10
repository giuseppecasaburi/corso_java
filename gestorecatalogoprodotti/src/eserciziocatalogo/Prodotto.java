package eserciziocatalogo;

public class Prodotto {
	private int id;
	private String nome;
	private String categoria;
	
	
	// Costruttori
	public Prodotto() {
		super();
		this.id = 0;
		this.nome = "N/A";
		this.categoria = "N/A";
	}
	
	public Prodotto(int id, String nome, String categoria) {
		super();
		this.id = id;
		this.nome = setNome(nome);
		this.categoria = setCategoria(categoria);
	}
	
	
	// Setters e Getters
	public int getId() {
		return id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getCategoria() {
		return categoria;
	}
	
	public String setNome(String nome) {
		this.nome = nome;
		return nome;
	}
	
	public String setCategoria(String categoria) {
		this.categoria = categoria;
		return categoria;
	}
	
	
	// Override dei metodi da Object
	@Override
	public boolean equals(Object obj) {
		// Controllo che l'oggetto corrente sia dello stesso tipo dell'oggetto passato come parametro
		if (this == obj) {
			return true;
		}
		
		// Controllo che l'oggetto passato come parametro non sia null e sia della stessa classe dell'oggetto corrente
		if (obj == null || getClass() != obj.getClass()) {
			return false;
		}
		
		// Salvo il cast dell'oggetto passato come parametro a Prodotto e confronto l'id con quello dell'oggetto corrente
		Prodotto prodotto = (Prodotto) obj;
        return id == prodotto.id;
	}
	
	@Override
	public String toString() {
		return "Prodotto [id = " + id + ", nome = " + nome + ", categoria = " + categoria + "]";
	}
}
