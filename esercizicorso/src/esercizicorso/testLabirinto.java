package esercizicorso;

import java.util.Scanner;

public class testLabirinto {

	public static void main(String[] args) {
		eserciziolabirintocorso lab = new eserciziolabirintocorso();
		Scanner input = new Scanner(System.in);
		String s;
		System.out.println("Legenda: PG = Giocatore, | = Muro, EX = Uscita.");
		System.out.println("Comandi: w = su, s = giù, a = sinistra, d = destra.");
		while(true) {	//il while si interrompe quando il giocatore ha vinto
			System.out.print("Inserisci un movimento: ");
			s = input.nextLine();
			if(lab.move(s)) break;
		}
		input.close();
	}
}