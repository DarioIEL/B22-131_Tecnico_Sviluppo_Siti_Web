# Esercitazione Java – 6 ore: Biblioteca di Istituto

## Blocco 1 – Riscaldamento: tipi, cast, stringhe (40 min)

Obiettivo: riattivare i primitivi, il cast e i metodi di `String` visti in `TipiDiDato.java`, `CastDelDato.java` e `Stringhe.java`. Tutto in un unico `main` della classe `Riscaldamento`. Prima di eseguire, ogni studente scrive su carta l'output che si aspetta.

### 1.1 Lo scontrino (10 min)

Un libro costa `12.99` euro e se ne comprano `3`. Calcola il totale in un `double`, poi usa il cast per separare euro e centesimi.

**Output atteso:**

```
Totale: 38.97
38 euro e 97 centesimi
```

Suggerimento: `(int) totale` tronca, per i centesimi serve `Math.round((totale - euro) * 100)`. Chiedi perché senza `Math.round` a volte esce 96.

### 1.2 Pagine al giorno (10 min)

Un libro ha `250` pagine e va letto in `7` giorni. Stampa: pagine intere al giorno, pagine avanzate, valore esatto, e infine `(double) (pagine / giorni)`.

**Output atteso:** `35`, `5`, `35.714285714285715`, `35.0`. Domanda per la classe: perché l'ultimo vale 35.0 e non 35.71?

### 1.3 Il codice di inventario (15 min)

Data `String codice = "LIB-2026-JAVA-0042";` stampa, una riga per punto:

1. la lunghezza (18)
2. il primo carattere (`L`)
3. l'anno, con `substring` (`2026`)
4. il numero finale, con `lastIndexOf("-")` + `substring` (`0042`)
5. la posizione di `"JAVA"` (9)
6. se contiene `"java"` minuscolo (false), poi lo stesso controllo senza distinguere maiuscole (true)
7. il numero finale + 1, convertito con `Integer.parseInt` (43) — metodo nuovo, va presentato

### 1.4 `==` oppure `equals`? (5 min)

```java
String a = "Java";
String b = "Java";
String c = new String("Java");
System.out.println(a == b);
System.out.println(a == c);
System.out.println(a.equals(c));
```

Output: `true`, `false`, `true`. Collegamento diretto al `E.equals(F)` lasciato in sospeso in `TesterGeometria.java`: `==` confronta i riferimenti, `equals` il contenuto. Per i `Punto` restituisce `false` finché la classe non ridefinisce `equals`.

## Blocco 2 – Controllo del flusso, Scanner, array (60 min)

Obiettivo: il registro giornaliero della biblioteca, scritto tutto nel `main` di `Registro.java` con un solo `Scanner`. È il livello di `esercitazione1.md`, ma ogni esercizio diventa poi un pezzo del progetto.

### 2.1 Fascia utente (10 min)

Chiedi l'età. Se è minore di 0 **oppure** maggiore di 120 stampa `Età non valida` (usa `||`). Altrimenti: sotto i 14 `Ragazzi`, da 14 a 18 `Studente`, oltre `Adulto`.

Test: 15 → `Studente`; 14 → `Studente`; 13 → `Ragazzi`; -3 → `Età non valida`.

### 2.2 Orari di apertura (10 min)

Chiedi il giorno (1-7) e usa uno `switch` con case raggruppati: 1-5 `Aperto 8:00-17:00`, 6 `Aperto 9:00-13:00`, 7 `Chiuso`, altrimenti `Giorno non valido`. Fai notare cosa succede se si dimentica un `break`.

### 2.3 Statistiche settimanali (15 min)

```java
int[] prestiti = {12, 7, 0, 15, 9, 4, 0};
String[] nomiGiorni = {"Lun", "Mar", "Mer", "Gio", "Ven", "Sab", "Dom"};
```

Con un solo ciclo `for` calcola totale, media (`double`), massimo con il suo giorno e numero di giorni a zero.

**Output atteso:**

```
Totale: 47 - Media: 6.714285714285714
Max: 15 (Gio) - Giorni a zero: 2
```

### 2.4 Cerca un titolo (15 min)

Con l'array `{"Il nome della rosa", "Se questo e' un uomo", "La coscienza di Zeno", "Il barone rampante"}` chiedi un titolo e stampa la posizione oppure `Titolo non presente`. Il confronto non deve distinguere maiuscole e minuscole. Usa una variabile `posizione = -1` e `break`, come nel controllo duplicati del Lotto in `Menu.java`.

Test: `la coscienza di zeno` → `Trovato in posizione 2`.

**Attenzione:** se prima si è letto un numero con `nextInt()`, il `nextLine()` successivo restituisce una stringa vuota. Serve un `scan.nextLine();` subito dopo l'ultimo `nextInt()`. Lasciate che il bug si presenti, poi discutetelo.

### 2.5 Rate della multa (10 min)

Un utente ha `7.50` euro di multa e paga al massimo `2` euro a settimana. Con un `while` stampa ogni rata finché il debito è zero.

**Output atteso:**

```
Settimana 1: pago 2.0 - residuo 5.5
Settimana 2: pago 2.0 - residuo 3.5
Settimana 3: pago 2.0 - residuo 1.5
Settimana 4: pago 1.5 - residuo 0.0
```

Variante per chi finisce prima: riscrivilo con `do-while` e spiega quando i due cicli danno risultati diversi (debito iniziale 0).

## Blocco 3 – Metodi static, overload, varargs (50 min)

Obiettivo: trasformare la logica dei blocchi precedenti in una classe di servizio `Utility`, sul modello di `GiocoDadi` e `Overload_metodi.java`. Tutti i metodi sono `public static`: si chiamano con `Utility.nomeMetodo(...)` senza creare oggetti.

### 3.1 Firme da implementare

| Metodo | Cosa fa | Esempio → risultato |
| --- | --- | --- |
| `int giorniRitardo(int giorniEffettivi, int giorniConcessi)` | Ritardo, mai negativo | `(20, 14)` → `6`; `(10, 14)` → `0` |
| `double calcolaMulta(int giorniRitardo)` | 0,50 euro al giorno | `(6)` → `3.0` |
| `double calcolaMulta(int giorniRitardo, boolean isStudente)` | Overload: studenti pagano metà, riusa il metodo sopra | `(6, true)` → `1.5` |
| `double calcolaMulta(int giorniRitardo, double tariffa)` | Overload: tariffa personalizzata | `(6, 1.0)` → `6.0` |
| `double media(int... valori)` | Varargs; 0 se non arriva nessun valore | `(12, 7, 0, 15, 9, 4, 0)` → `6.714285714285714`; `()` → `0.0` |
| `int massimo(int... valori)` | Varargs | `(12, 7, 0, 15, 9, 4, 0)` → `15` |
| `String sigla(String testo)` | Prime 4 lettere senza spazi, maiuscole; se sono meno di 4 restituisce quelle che ci sono | `("Il nome della rosa")` → `ILNO`; `("Io")` → `IO` |
| `int numeroCasuale(int min, int max)` | Intero casuale, estremi inclusi | `(1, 6)` → da 1 a 6 |

La tariffa 0,50 va in una costante: `public static final double TARIFFA_GIORNALIERA = 0.50;`.

### 3.2 Test nel main (10 min)

Un `main` dentro `Utility` stampa ogni esempio della tabella. Per `numeroCasuale` si chiama il metodo 10.000 volte e si stampano minimo e massimo osservati: deve uscire `1-6`.

### 3.3 Trova il bug (10 min)

In `Prj1_Giochi/GiocoDadi.java` c'è `rand.nextInt(1, numFacce)`. Con il test di 3.2 gli studenti verificano che il dado rosso non esce mai sul 6, perché il secondo estremo è escluso. Correzione: `rand.nextInt(1, numFacce + 1)`.

### 3.4 Domande di verifica (orali)

1. Si può aggiungere `double calcolaMulta(int giorni, int bonus)` accanto a `calcolaMulta(int, double)`? Compila? Cosa chiama `calcolaMulta(6, 2)`? (Compila: con due `int` Java preferisce la firma esatta.)
2. Perché due metodi che differiscono solo per il tipo restituito non sono un overload valido? (Vedi il commento a riga 22 di `Overload_metodi.java`.)
3. Dentro `media(int... valori)`, che tipo ha `valori`?

## Blocco 4 – Classi e oggetti: Libro, Utente, Prestito (80 min)

Obiettivo: modellare il dominio come in `lezione05_Classi`. `Libro` e `Utente` ricalcano `Persona` e `Studente`; `Prestito` contiene due oggetti come `Segmento` contiene due `Punto`.

### 4.1 Classe `Libro` (25 min)

- Attributi: `codice`, `titolo`, `autore` (String), `anno` (int), `disponibile` (boolean).
- Attributo di classe `private static int contatore = 0;`.
- Costruttore `Libro(String titolo, String autore, int anno)`: imposta `disponibile = true`, incrementa `contatore` e genera `codice = "LIB-" + contatore + "-" + Utility.sigla(titolo)`.
- `public static int getContatore()`.
- `boolean presta()`: se il libro non è disponibile restituisce `false`; altrimenti lo segna come non disponibile e restituisce `true`.
- `void restituisci()` e `toString()` generato con Eclipse (Alt + Shift + S).

**Perché un contatore e non `Math.random()`?** In `Studente.java` la matricola è `Math.ceil(Math.random() * 1000)`: con 40 studenti la probabilità di almeno due matricole uguali supera il 50%. Un contatore `static` dà codici unici. Fatelo calcolare alla classe prima di dare la risposta.

**Output atteso** per il primo libro creato:

```
Libro [codice=LIB-1-ILNO, titolo=Il nome della rosa, autore=Umberto Eco, anno=1980, disponibile=true]
```

### 4.2 Classe `Utente` (20 min)

- Attributi: `nome`, `cognome`, `eta`, `tessera` (int).
- Costanti e attributi di classe: `public static final int MAX_PRESTITI = 3;` e `private static int ultimaTessera = 1000;`. La prima tessera vale 1001.
- `String fascia()`: riusa la logica di 2.1 restituendo la stringa invece di stamparla.
- `boolean isStudente()`: `true` se la fascia è `Studente`. Usare `equals`, non `==` (Blocco 1.4).

L'attributo `List<Libro> libriInPrestito` e il metodo `puoPrendereInPrestito()` arrivano nel Blocco 5.

### 4.3 Classe `Prestito` (15 min)

- Attributi: `Libro libro`, `Utente utente`, `int giorniConcessi`.
- `double calcolaMulta(int giorniEffettivi)`: usa `Utility.giorniRitardo` e `Utility.calcolaMulta(ritardo, utente.isStudente())`.
- `toString()` nel formato `Prestito [Il nome della rosa -> Anna Verdi, 14 giorni]`.

Navigazione tra oggetti, come `segm2.puntoB.x`: dato un prestito `p`, stampare `p.utente.nome` e `p.libro.anno`.

### 4.4 Tester e domande (20 min)

In `TesterBiblioteca` creare 4 libri e 2 utenti (Anna, 16 anni; Marco, 34) e stampare tutto.

1. Togliete il `toString()` da `Libro`: cosa stampa `System.out.println(libro)` e perché?
2. Aggiungete `new Libro()` nel tester. Perché non compila? Come si risolve? (Collegamento al commento in `Persona.java`.)
3. Si può scrivere `this.titolo` dentro `getContatore()`? Perché no?
4. Dopo aver creato 4 libri, quanto vale `Libro.getContatore()`? Cambia se lo si chiede a un libro specifico?
5. Un `Prestito` vale 14 giorni e il libro rientra dopo 20. Quanto paga Anna? E Marco? (1.5 e 3.0 euro.)

## Blocco 5 – ArrayList: la classe Biblioteca (80 min)

Obiettivo: gestire collezioni di oggetti con `List<...> = new ArrayList<>()`, come in `Studio_ArrayList.java` e `Aula.java`. Qui gli array del Blocco 2 vengono sostituiti da liste.

### 5.1 Completare `Utente` (5 min)

Aggiungere `List<Libro> libriInPrestito`, inizializzata nel costruttore come `materie` in `Studente`, e `boolean puoPrendereInPrestito()`: vero se `size() < MAX_PRESTITI`.

### 5.2 Struttura di `Biblioteca` (10 min)

Attributi: `String nome`, `List<Libro> catalogo`, `List<Prestito> prestitiAttivi`. Il costruttore riceve il nome e crea due `ArrayList` vuoti. Metodo `void aggiungiLibri(Libro... libri)`, identico a `aggiungiStudenti` di `Aula`.

### 5.3 Metodi da implementare (50 min)

| Metodo | Comportamento | Test (catalogo: Eco 1980, Calvino 1957, Calvino 1972, Svevo 1923) |
| --- | --- | --- |
| `String elencoCatalogo()` | Una riga per libro: `codice - titolo (autore, anno) - disponibile/in prestito` | 4 righe |
| `Libro cercaPerCodice(String codice)` | Restituisce il libro o `null`; ignora maiuscole | `"lib-2-ilba"` → Il barone rampante; `"LIB-99-XXXX"` → `null` |
| `List<Libro> cercaPerAutore(String testo)` | Nuova lista con gli autori che contengono il testo | `"italo"` → 3; `"calvino"` → 2 |
| `List<Libro> libriDisponibili()` | Nuova lista dei soli disponibili | 4 a inizio test |
| `String prestaLibro(String codice, Utente u, int giorni)` | Controlla nell'ordine: codice esistente, limite utente, disponibilità. Se va bene aggiorna libro, `u.libriInPrestito` e `prestitiAttivi` | Vedi sequenza sotto |
| `double restituisciLibro(String codice, int giorniEffettivi)` | Trova il prestito, calcola la multa, rimette il libro disponibile, lo toglie dall'utente e da `prestitiAttivi`. `-1` se non c'è prestito | Anna, 20 gg → `1.5` |
| `String statistiche()` | Totale libri, disponibili, prestiti attivi, anno medio e più recente usando `Utility.media` e `Utility.massimo` | Vedi sotto |

**Sequenza di test per `prestaLibro`** (Anna ha 16 anni, Marco 34):

```
Prestito registrato: Il nome della rosa a Anna
"Il nome della rosa" e' gia' in prestito          <- Marco ci prova
Prestito registrato: Il barone rampante a Anna
Prestito registrato: Le citta' invisibili a Anna
Anna ha gia' 3 libri in prestito                 <- quarto tentativo
Libri: 4 - disponibili: 1 - prestiti attivi: 3 - anno medio: 1958.0 - piu' recente: 1980
Multa Anna (20 gg): 1.5
Prestito registrato: La coscienza di Zeno a Marco
Multa Marco (20 gg): 3.0
Gia' restituito: -1.0
```

Per passare un `int[]` ai metodi varargs serve copiare gli anni della lista in un array: è lo stesso passaggio lista → array visto in `Studio_ArrayList.java`.

### 5.4 Rimuovere durante il ciclo (15 min)

Metodo `int rimuoviPrimaDel(int anno)`: elimina dal catalogo i libri **disponibili** pubblicati prima dell'anno dato e restituisce quanti ne ha tolti.

1. Prima versione con `for (Libro l : catalogo) { ... catalogo.remove(l); }`: eseguitela e osservate la `ConcurrentModificationException`.
2. Seconda versione con `Iterator` e `it.remove()`, come negli appunti `13_JCF.md`.

Test a fine sequenza (Il barone rampante è ancora in prestito): `rimuoviPrimaDel(1960)` → `1`, perché viene rimosso solo La coscienza di Zeno.

## Blocco 6 – Menu integrato e consegna (50 min)

Obiettivo: un `MainBiblioteca` con menu `do-while` + `switch`, come `MainMenu.java`, che usa solo i metodi già scritti. Nel `main` non va logica di business: solo input, chiamate e stampe.

### 6.1 Dati iniziali (5 min)

6 libri con `aggiungiLibri` (Eco, Levi ×2, Svevo, Calvino ×2) e 3 utenti in `List.of(...)`: Anna 16, Marco 34, Luca 12.

### 6.2 Voci del menu (35 min)

1. **Catalogo** → `elencoCatalogo()`
2. **Cerca per autore** → chiede il testo, stampa i risultati o `Nessun libro trovato`; stampa con `forEach(l -> System.out.println(l))`
3. **Libri disponibili** → codice e titolo
4. **Presta un libro** → mostra gli utenti numerati, chiede numero utente e codice, prestito di 14 giorni; controlla che il numero sia nell'intervallo
5. **Restituisci un libro** → chiede codice e giorni effettivi, stampa la multa oppure `Nessun prestito attivo`
6. **Statistiche** → `statistiche()`

**x** → esce. Deve funzionare sia con `x` sia con `X`: in `MainMenu.java` si esce solo con la maiuscola, mentre `Menu.java` accetta solo la minuscola. Soluzione: `scan.nextLine().toLowerCase()` prima di `charAt(0)`.

**Robustezza richiesta:** se l'utente preme solo Invio, `charAt(0)` su stringa vuota lancia `StringIndexOutOfBoundsException`. Controllare `isEmpty()` prima. Dopo ogni `nextInt()` serve il `nextLine()` di pulizia (Blocco 2.4).

### 6.3 Collaudo e consegna (10 min)

Ogni studente esegue questa sequenza e consegna lo screenshot dell'output insieme al progetto zippato:

```
1  →  catalogo (6 libri, LIB-1-ILNO ... LIB-6-ILSI)
2  →  calvino          → 2 libri
4  →  0, lib-4-ilba    → Prestito registrato: Il barone rampante a Anna
4  →  0, LIB-4-ILBA    → "Il barone rampante" e' gia' in prestito
5  →  LIB-4-ILBA, 20   → Restituito. Multa: 1.5 euro
6  →  Libri: 6 - disponibili: 6 - prestiti attivi: 0 - anno medio: 1959.0 - piu' recente: 1980
(Invio vuoto) → Scelta non valida
X  →  Arrivederci!
```
