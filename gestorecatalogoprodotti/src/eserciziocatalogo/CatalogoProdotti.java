package eserciziocatalogo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class CatalogoProdotti {
    private final Map<Integer, Prodotto> prodotti = new TreeMap<>();

    // Aggiunta prodotto
    public boolean aggiungiProdotto(Prodotto p) {
        if (prodotti.containsKey(p.getId())) {
            System.out.println("Errore: prodotto con id=" + p.getId() + " già presente.");
            return false;
        }
        prodotti.put(p.getId(), p);
        System.out.println("Prodotto id=" + p.getId() + " aggiunto.");
        return true;
    }

    // Rimozione prodotto
    public boolean rimuoviProdotto(int id) {
        Prodotto rimosso = prodotti.remove(id);
        if (rimosso == null) {
            System.out.println("Errore: prodotto con id=" + id + " non trovato.");
            return false;
        }
        System.out.println("Prodotto id=" + id + " rimosso.");
        return true;
    }

    // Ritorna tutti i prodotti
    public List<Prodotto> getTutti() {
        return new ArrayList<>(prodotti.values());
    }

    // Ricerca caseinsensitive filtrando la mappa
    public Set<Prodotto> cercaPerCategoria(String categoriaInput) {
        String cerca = categoriaInput.toLowerCase();
        Set<Prodotto> risultati = new HashSet<>();
        for (Prodotto p : prodotti.values()) {
            if (p.getCategoria().toLowerCase().equals(cerca)) {
                risultati.add(p);
            }
        }
        return risultati;
    }
}