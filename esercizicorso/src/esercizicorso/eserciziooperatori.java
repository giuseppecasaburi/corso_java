package esercizicorso;

import java.util.Scanner;

public class eserciziooperatori {
	public static void main(String[] args) {
		// Avvio scanner
		Scanner input = new Scanner(System.in);
		
		
		// Messaggi per l'utente
		System.out.println("L'intero processo richiederà l'inserimento di 3 numeri.");
		System.out.print("Inserisci il primo numero:");
		
		
		// Prelievo dei numeri
		int numOne = input.nextInt();
		input.nextLine();
		
		System.out.print("Inserisci il secondo numero:");
		int numTwo = input.nextInt();
		input.nextLine();
		
		System.out.print("Inserisci il terzo numero:");
		int numThr = input.nextInt();
		input.nextLine();
		
		// Chiusura dello scanner
		input.close();
		
		
		// Calcolo numero più grande
		int bigNum;
		if ( numOne > numTwo ) {
		    bigNum = numOne;
	    } else {
		    bigNum = numTwo;
	    }
		
		if (bigNum < numThr) {
			bigNum = numThr;
		}
		
		
		// Confronto tra i numeri
		int sumOneTwo = numOne + numTwo;
		String comparazione = sumOneTwo > numThr ? "La somma dei primi due numeri è maggiore del terzo numero" : "La somma dei primi due numeri è minore o uguale al terzo numero";
		
		
		// Pari o dispari
		String pariODispari = "Tutti i numeri sono dispari";
		if ( numOne % 2 == 0 || numTwo % 2 == 0 || numThr % 2 == 0 ) {
		    pariODispari = "C'è almeno un numero pari";
	    }
		
		
		// Stampa degli output
		System.out.println("Il numero più grande è "+bigNum);
		System.out.println(comparazione);
		System.out.println(pariODispari);
	};
};