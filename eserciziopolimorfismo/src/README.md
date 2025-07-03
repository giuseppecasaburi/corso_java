# Esercizio Polimorfismo
## Obiettivo:
Creare una gerarchia di classi utilizzando una combinazione di classe astratta e interfacce per rappresentare forme geometriche.
L'obiettivo è usare il polimorfismo per definire comportamenti comuni che saranno implementati in modo specifico nelle classi concrete.

## Descrizione del Compito:
1. Definire un'interfaccia FormaGeometrica con due metodi astratti:
	double calcolaArea() ;
	double calcolaPerimetro() .
2. Definire una classe astratta Figura che non implementa direttamente l'interfaccia, ma definisce alcuni attributi comuni a tutte le forme geometriche, come ad esempio:
	String nome ;
	String colore .
Deve inoltre contenere un metodo mostraInfo() che visualizza informazioni generiche sulla figura, come il nome e il colore.
3. Creare almeno tre classi concrete che estendano Figura e implementino l'interfaccia FormaGeometrica:
Cerchio con attributo raggio;
Rettangolo con attributi base e altezza;
Triangolo con attributi latoA , latoB , latoC (triangolo scaleno).

Il metodo calcolaArea() per il triangolo deve utilizzare la formula di Erone:

Dove:
Ognuna di queste classi deve implementare entrambi i metodi calcolaArea() e calcolaPerimetro() e
sovrascrivere il metodo mostraInfo() mostrando informazioni specifiche sulla forma e le dimensioni.
4. Creare una classe di test TestFormeGeometriche che:
Istanzi almeno un oggetto per ciascun tipo di forma;
Utilizzi il polimorfismo per gestire gli oggetti tramite riferimenti di tipo FormaGeometrica ;
Invochi il metodo mostraInfo() e visualizzi l'area e il perimetro calcolati per ciascuna forma.

Area = s ⋅ (s − a) ⋅ (s − b) ⋅ (s − c)

s = (semiperimetro del triangolo)
2
a + b + c

Esercizio Polimorfismo 1

Istruzioni per lo Svolgimento:
1. Scrivere il codice Java per le classi e interfacce richieste.
2. Eseguire e testare il codice.
3. Zippare le classi create (almeno 5, compreso il test, la classe astratta e l'interfaccia) in un file .zip .
4. Caricare il file zip nella cartella EserciziStudenti .
5. Naming Convention:
Esercizio Polimorfismo - Nome Gruppo.zip