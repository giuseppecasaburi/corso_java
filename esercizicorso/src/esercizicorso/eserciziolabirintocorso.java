package esercizicorso;

public class eserciziolabirintocorso {
	private int posx;
	private int posy;
	private int numRighe;
	private int numColonne;
	private int[][] lab;
	private boolean haiVinto;
	
	
	// Il costruttore vuoto perché si è scelto di inizializzare tutto il labrinto nella classe, compresa la posizione del giocatore.
	eserciziolabirintocorso() {
		haiVinto = false;
		inizializza();
		stampaLabirinto();
	}
	
	
	// Metodo per il movimento nel labirinto, invocato da testLabirinto.
	public boolean move(String x) {
		switch(x) {
			case "w":
				if(movimentoValido(posx-1, posy)) { 	// se c'è un muro, il movimento non viene effettuato
					swap(posx, posy, --posx, posy);		// se il movimento può essere effettuato, si cambiano pos corrente con pos della cella in cui ci si sposta
				}
				break;
			case "a":
				if(movimentoValido(posx, posy-1)) {
					swap(posx, posy, posx, --posy);
				}
				break;
			case "s":
				if(movimentoValido(posx+1, posy)) {
					swap(posx, posy, ++posx, posy);
				}
				break;
			case "d":
				if(movimentoValido(posx, posy+1)) {
					swap(posx, posy, posx, ++posy);
				}
				break;
			default: 
				System.out.println("Input invalido");
		}
		
		stampaLabirinto();
		if(haiVinto) {
			System.out.println("Hai vinto!");
			return true;
		}
		return false;
	}
	
	// Effettua due controlli: 
		// Il primo verifica che il movimento non esca dai bordi del labirinto.
		// Il secondo verifica se c'è un muro. 
		// In caso di movimento valido si restituisce true, altrimenti false.
	private boolean movimentoValido(int posx, int posy) {
		if(lab[posx][posy] == 1) {
			System.out.println("ATTENZIONE");
			System.out.println("C'è un muro");
			return false;
		}
		
		return true;
	}
	
	// Il metodo consente al giocatore di muoversi nel labirinto, cambiando la posizione di 0 e di 7. Se c'è un 9 il giocatore ha vinto la partita.
	private void swap(int posx, int posy, int newposx, int newposy) {
		
		//Se viene trovata l'uscita si setta haiVinto a true e si sostituisce la posizione del giocatore con l'uscita.
		if(lab[newposx][newposy] == 9) {
			haiVinto = true;
			lab[newposx][newposy] = 7;
			lab[posx][posy] = 0;
			return;
		}
		
		// Se non si trova l'uscita, si scambiano i valori della cella corrente e della cella in cui ci si sposta.
		int oldval = lab[posx][posy];
		lab[posx][posy] = lab[newposx][newposy];
		lab[newposx][newposy] = oldval;
	}
	
	
	//Inizilizziamo la scacchiera con dei valori di default
	private void inizializza() {
		int[][] lab = {
				{1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                {1, 7, 0, 1, 0, 0, 0, 1, 0, 1},
                {1, 1, 0, 1, 0, 1, 0, 1, 0, 1},
                {1, 0, 0, 0, 0, 1, 0, 0, 0, 1},
                {1, 0, 1, 1, 1, 1, 1, 1, 0, 1},
                {1, 0, 0, 0, 0, 0, 0, 0, 0, 1},
                {1, 1, 1, 0, 1, 1, 1, 1, 0, 1},
                {1, 1, 1, 1, 1, 1, 1, 1, 9, 1}
	    };
		
		// Due for innestati per contare il numero di righe e di colonne che ci possono servire per evitare di andare fuori dai bordi dell'array.
		// Ci memorizziamo anche la posizione del giocatore (identificata da 7).
		for(int i=0; i<lab.length; i++) {
			numRighe++;
				for(int j=0; j<lab[i].length; j++) {
					if(numRighe == 1) numColonne++;
					if(lab[i][j] == 7) {
						posx = i;
						posy = j;
					}
			}
		}
		
		this.lab = lab;
	}
	
	// La stampa del labirinto, con una piccola miglioria grafica.
	private void stampaLabirinto() {
        System.out.println("======= LABIRINTO =======");
        for (int[] riga : lab) {
            for (int cella : riga) {
                switch (cella) {
                    case 1 -> System.out.print("||");
                    case 0 -> System.out.print("  ");
                    case 7 -> System.out.print("PG"); // Giocatore
                    case 9 -> System.out.print("EX"); // Uscita
                    default -> System.out.print("? ");
                }
            }
            System.out.println();
        }
        System.out.println("=========================");
    }
}