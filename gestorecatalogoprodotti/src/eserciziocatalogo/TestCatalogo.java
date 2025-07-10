package eserciziocatalogo;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.Set;

public class TestCatalogo {
	// Capitalizzazione della risposta
	public static String capitalizza(String parola) {
        if (parola == null || parola.isEmpty()) {
            return parola;
        }
        return parola.substring(0, 1).toUpperCase() + parola.substring(1).toLowerCase();
    }
	
    public static void main(String[] args) {
        // Creazione del catalogo
        CatalogoProdotti catalogo = new CatalogoProdotti();

        // Aggiunta dei prodotti
        catalogo.aggiungiProdotto(new Prodotto(1, "Prodotto A", "Elettronica"));
        catalogo.aggiungiProdotto(new Prodotto(2, "Prodotto B", "Elettronica"));
        catalogo.aggiungiProdotto(new Prodotto(3, "Prodotto C", "Guardaroba"));
        catalogo.aggiungiProdotto(new Prodotto(4, "Prodotto D", "Guardaroba"));
        catalogo.aggiungiProdotto(new Prodotto(5, "Prodotto E", "Elettronica"));
        catalogo.aggiungiProdotto(new Prodotto(6, "Prodotto F", "Guardaroba"));
        catalogo.aggiungiProdotto(new Prodotto(7, "Prodotto G", "Elettronica"));
        
        
        // TEST
        // Rimozione di un prodotto
     	catalogo.rimuoviProdotto(2);
     		
     	// Tentativo di rimozione di un prodotto inesistente
     	catalogo.rimuoviProdotto(4);


        // Scrittura su file
        try {
            FileWriter writer = new FileWriter("catalogo.txt");
            for (Prodotto p : catalogo.getTutti()) {
                writer.write(p.toString() + "\n");
            }
            writer.close();
            System.out.println("Catalogo salvato correttamente su 'catalogo.txt'.");
        } catch (IOException e) {
            System.out.println("Errore durante il salvataggio del file.");
            e.printStackTrace();
        }
        

        // Visualizzazione iniziale del catalogo
        System.out.println("===== CATALOGO COMPLETO =====");
        for (Prodotto p : catalogo.getTutti()) {
            System.out.println(p);
        }
        
        
        // Scanner per input utente
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nVuoi cercare prodotti per categoria? (si/no): ");
        String risposta = scanner.nextLine();
        


        if (risposta.equalsIgnoreCase("si")) {
            System.out.print("Inserisci il nome della categoria: ");
            String categoria = capitalizza(scanner.nextLine());
            Set<Prodotto> risultati = catalogo.cercaPerCategoria(categoria);
            
            if (categoria.isEmpty() || categoria.length() < 3 || categoria == null) {
				System.out.println("Categoria non valida.");
				scanner.close();
				return;
			}
            
            if (risultati.isEmpty()) {
                System.out.println("Nessun prodotto trovato per la categoria: " + categoria);
            } else {
                System.out.println("Prodotti nella categoria '" + categoria + "':");
                for (Prodotto p : risultati) {
                    System.out.println(p);
                }
            }
        } else {
            System.out.println("Uscita dal programma.");
        }

        scanner.close();
    }
}