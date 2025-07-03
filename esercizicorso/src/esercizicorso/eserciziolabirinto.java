package esercizicorso;
import java.util.Scanner;

// Classe per rappresentare la posizione del giocatore
class Posizione {
    private int x;
    private int y;

    
    // Costruttore
    public Posizione(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    
    // Metodi getter
    public int getX() { return x; }
    public int getY() { return y; }
    
    
    // Metodi setter
    public void setX(int x) { this.x = x; }
    public void setY(int y) { this.y = y; }
}


// Classe principale del gioco
class GiocoLabirinto {
    private char[][] labirinto;
    private Posizione giocatore;
    private Posizione uscita;
    private int righe;
    private int colonne;
    private Scanner scanner;
    
    
    // Costruttore
    public GiocoLabirinto() {
        // Inizializza il labirinto predefinito
        righe = 8;
        colonne = 10;
        scanner = new Scanner(System.in);
        
        
        // Crea il labirinto (# = muro, . = spazio libero, S = start, E = uscita)
        char[][] labTemp = {
            {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#'},
            {'#', 'S', '.', '#', '.', '.', '.', '#', '.', '#'},
            {'#', '#', '.', '#', '.', '#', '.', '#', '.', '#'},
            {'#', '.', '.', '.', '.', '#', '.', '.', '.', '#'},
            {'#', '.', '#', '#', '#', '#', '#', '#', '.', '#'},
            {'#', '.', '.', '.', '.', '.', '.', '.', '.', '#'},
            {'#', '#', '#', '.', '#', '#', '#', '#', 'E', '#'},
            {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#'}
        };
        
        
        labirinto = new char[righe][colonne];
        for (int i = 0; i < righe; i++) {
            for (int j = 0; j < colonne; j++) {
                labirinto[i][j] = labTemp[i][j];
            }
        }
        
        // Trova posizione iniziale e uscita
        trovaPosizioni();
    }
    
    private void trovaPosizioni() {
        for (int i = 0; i < righe; i++) {
            for (int j = 0; j < colonne; j++) {
                if (labirinto[i][j] == 'S') {
                    giocatore = new Posizione(i, j);
                    labirinto[i][j] = '.'; // Sostituisce S con spazio vuoto
                } else if (labirinto[i][j] == 'E') {
                    uscita = new Posizione(i, j);
                }
            }
        }
    }
    
    public void stampaLabirinto() {
        System.out.println("\n=== LABIRINTO ===");
        for (int i = 0; i < righe; i++) {
            for (int j = 0; j < colonne; j++) {
                if (i == giocatore.getX() && j == giocatore.getY()) {
                    System.out.print("P "); // P = Player
                } else {
                    System.out.print(labirinto[i][j] + " ");
                }
            }
            System.out.println();
        }
        System.out.println("\nLegenda: P=Giocatore, #=Muro, .=Spazio, E=Uscita");
        System.out.println("Comandi: w=su, s=giù, a=sinistra, d=destra, q=esci");
    }
    
    public void gioca() {
        System.out.println("=== BENVENUTO NEL GIOCO DEL LABIRINTO ===");
        System.out.println("Obiettivo: Raggiungi l'uscita (E) per vincere!");
        
        while (true) {
            stampaLabirinto();
            
            // Controlla se il giocatore ha vinto
            if (giocatore.getX() == uscita.getX() && giocatore.getY() == uscita.getY()) {
                System.out.println("\n🎉 CONGRATULAZIONI! HAI VINTO! 🎉");
                System.out.println("Hai raggiunto l'uscita!");
                break;
            }
            
            System.out.print("\nInserisci il tuo movimento: ");
            String input = scanner.nextLine().toLowerCase();
            
            if (input.equals("q")) {
                System.out.println("Grazie per aver giocato!");
                break;
            }
            
            muoviGiocatore(input);
        }
        
        scanner.close();
    }
    
    private void muoviGiocatore(String direzione) {
        int nuovaX = giocatore.getX();
        int nuovaY = giocatore.getY();
        
        // Calcola nuova posizione basata sul comando
        switch (direzione) {
            case "w": // su
                nuovaX--;
                break;
            case "s": // giù
                nuovaX++;
                break;
            case "a": // sinistra
                nuovaY--;
                break;
            case "d": // destra
                nuovaY++;
                break;
            default:
                System.out.println("Comando non riconosciuto! Usa w/a/s/d per muoverti.");
                return;
        }
        
        // Controlla se il movimento è valido
        if (movimentoValido(nuovaX, nuovaY)) {
            giocatore.setX(nuovaX);
            giocatore.setY(nuovaY);
        } else {
            System.out.println("Non puoi muoverti lì! C'è un muro o sei fuori dai confini.");
        }
    }
    
    private boolean movimentoValido(int x, int y) {
        // Controlla se è dentro i confini
        if (x < 0 || x >= righe || y < 0 || y >= colonne) {
            return false;
        }
        
        // Controlla se non è un muro
        if (labirinto[x][y] == '#') {
            return false;
        }
        
        return true;
    }
}

// Classe principale per eseguire il gioco
public class eserciziolabirinto {
    public static void main(String[] args) {
        GiocoLabirinto gioco = new GiocoLabirinto();
        gioco.gioca();
    }
}