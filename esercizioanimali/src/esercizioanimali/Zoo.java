package esercizioanimali;

public class Zoo {
	private Animale[] animali;
	private int numeroAnimali;
	
	public Zoo() {
		super();
		this.animali = new Animale[5];
		numeroAnimali = 0;
	};
	
	public Zoo(int dimensione) {
		super();
		if (dimensione > 0) {
			this.animali = new Animale[dimensione];
			numeroAnimali = 0;
		} else {
			System.out.println("La dimensione dello zoo deve essere maggiore di zero.");
			this.animali = new Animale[5]; // Dimensione predefinita
			numeroAnimali = 0;
		}
	};
	
	public void aggiungiAnimale(Animale animale) {
		if (numeroAnimali < animali.length) {
			animali[numeroAnimali] = animale;
			numeroAnimali++;
		} else {
			System.out.println("LO ZOO E' PIENO. NON PUOI AGGIUNGERE ALTRI ANIMALI.\n");
		}
	}
	
	public void mostraAnimale() {
		if (numeroAnimali == 0) {
			System.out.println("Lo zoo non contiene animali.");
		} else {
			System.out.println("Gli animali presenti nello zoo sono:");
			for (int i = 0; i < numeroAnimali; i++) {
				Animale animale = animali[i];
				animale.mostraInfo();
				animale.emettiVerso();
				animale.muoviti();
				
				if (animale instanceof Riportante && animale instanceof Mangiante) {
					((Riportante) animale).riporto();
					((Mangiante) animale).mangia();
				} else if (animale instanceof Covante && animale instanceof Mangiante) {
					((Covante) animale).cova();
					((Mangiante) animale).mangia();
				} else if (animale instanceof Riportante) {
					((Riportante) animale).riporto();
				} else if (animale instanceof Covante) {
					((Covante) animale).cova();
				} else if (animale instanceof Mangiante) {
					((Mangiante) animale).mangia();
				}
				
				System.out.println("####################################################################################################################################################################################\n");
			}
		}
	};
}