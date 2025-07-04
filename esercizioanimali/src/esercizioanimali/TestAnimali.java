package esercizioanimali;

public class TestAnimali {
	public static void main(String[] args) {
		
		// Istanza della classe Zoo e degli animali
		Zoo zoo = new Zoo();
		Animale cane = new Cane("Willy", "Casa", "Carinivoro", 6, "Bassotto");
		Animale uccello = new Uccello("Mimmo", "Albero", "Insettivoro", 2, "Rosso");
		Animale pesce = new Pesce("Wisky", "Mare", "Carnivoro", 1, "Giallo", "Pesce Rosso");
	
		// Aggiunta degli animali allo zoo attraverso il metodo aggiungiAnimale
		zoo.aggiungiAnimale(cane);
		zoo.aggiungiAnimale(uccello);
		zoo.aggiungiAnimale(pesce);
	
		// Mostra gli animali presenti nello zoo
		zoo.mostraAnimale();
		
		
		// Test per verificare il comportamento di aggiunta di animali di numero superiore alla dimensione dello zoo
		Animale uccello1 = new Uccello("Mimmo", "Albero", "Insettivoro", 2, "Rosso");
		Animale pesce1 = new Pesce("Wisky", "Mare", "Carnivoro", 1, "Giallo", "Pesce Rosso");
		Animale uccello2 = new Uccello("Mimmo", "Albero", "Insettivoro", 2, "Rosso");
		zoo.aggiungiAnimale(uccello1);
		zoo.aggiungiAnimale(uccello2);
		zoo.aggiungiAnimale(pesce1);	
		
		zoo.mostraAnimale();
	}
}