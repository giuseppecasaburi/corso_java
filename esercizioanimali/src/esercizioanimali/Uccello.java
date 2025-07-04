package esercizioanimali;

	public class Uccello extends Animale implements ComportamentoAnimali, Covante, Mangiante {
		private String colorePiumaggio;
		private int pesoKg;
		
		// Costruttore
		public Uccello() {
			super();
			this.colorePiumaggio= "N/A";
			this.pesoKg = 0;
		}
		
		public Uccello(String nome, String habitat, String dieta, int pesoKg, String colorePiumaggio) {
			super(nome, habitat, dieta);
			setPeso(pesoKg);
			setColorePiumaggio(colorePiumaggio);
		}
		
		// Metodi Getters e Setters
		public int getPeso() {
			return pesoKg;
		}

		public void setPeso(int pesoKg) {
			this.pesoKg = pesoKg;
		}

		public String getColorePiumaggio() {
			return colorePiumaggio;
		}

		public void setColorePiumaggio(String colorePiumaggio) {
			this.colorePiumaggio = colorePiumaggio;
		}
		
		
		// Metodi implementati dall'interfaccia ComportamentoAnimali
		public void emettiVerso() {
			System.out.println("L'uccello " + getNome() + " cinquetta.");
		};

		public void muoviti() {
			System.out.println("L'uccello " + getNome() + " vola.");
		};
		
		public void mostraInfo() {
			System.out.println("L'uccello con nome: " + getNome() + ", ha peso: " + getPeso() + ", ha habitat: " + getHabitat() + ", ha il piumaggio di colore: " + getColorePiumaggio() + " ed infine ha una dieta: " + getDieta() + ".");
		};
		
		
		// Metodi implementati dalle interfacce Riportante e Mangiante
		public void cova() {
			System.out.println("L'uccello " + getNome() + " sta covando.");
		};
		
		public void mangia() {
			System.out.println("L'uccello " + getNome() + " sta mangiando.");
		};
	};