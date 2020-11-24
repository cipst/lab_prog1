public class MetodiRicorsiviSuArray {

    // metodo ricorsivo co-variante tuttiPari(int[] a) che ritorna true se tutti gli
    // elementi di un array sono pari
    public static boolean tuttiPari(int[] a) {
        // se l'array a è null, vuol dire che ha puntatore null e quindi l'array non è
        // stato inizializzato ==> non può avere elementi pari perché non ha elementi ->
        // return false
        if (a != null && a.length != 0)
            return tuttiPariRic(a, a.length - 1);
        else
            return false;
    }// tuttiPari

    public static boolean tuttiPariRic(int[] a, int i) {
        // se i==0, sono arrivato al primo elemento -> se è pari return true altrimenti
        // return false;
        // altrimenti se non sono al primo elemento (i>0) -> controllo se l'elemento in
        // posizione i è pari e dopo faccio la chiamata ricorsiva per controllare che lo
        // siano anche tutti gli altri numeri nelle posizioni i fino ad arrivare a 0
        if (i == 0)
            return a[i] % 2 == 0;
        else
            return (a[i] % 2 == 0) & tuttiPariRic(a, i - 1);
    }// tuttiPariRic

    public static boolean esisteMultiplo(int[] a, int m) {
        // se l'array a è null, vuol dire che ha puntatore null e quindi l'array non è
        // stato inizializzato ==> non può avere elementi multipli di m perché non ha
        // elementi OPPURE il multiplo inserito è 0 ==> nessun numero è multiplo di 0 ->
        // return false
        if (a != null && a.length != 0 && m != 0)
            return esisteMultiploRic(a, m, 0);
        else
            return false;
    }// esisteMultiplo

    public static boolean esisteMultiploRic(int[] a, int m, int i) {
        // se i == a.length -1 -> controllo se a[i] è multiplo di m
        // altrimenti controllo se a[i] è multiplo di m OPPURE chiamo ricorsivamente per
        // vedere se c'è un multiplo di m
        if (i == a.length - 1)
            return a[i] % m == 0;
        else
            return (a[i] % m == 0) | esisteMultiploRic(a, m, i + 1);
    }// esisteMultiploRic

    /******
     * ESERCIZIO 5
     ******/

    public static int sommaDispari(int[] a) {
        // l'array a non deve essere null e deve avere una lunghezza maggiore di 0
        if (a != null && a.length > 0)
            return sommaDispariDicotomico(a, 0, a.length - 1);
        else
            return 0;
    }// sommaDispari

    public static int sommaDispariDicotomico(int[] a, int i, int j) {
        if (i == j) {
            if (a[i] % 2 != 0)
                return a[i];
            else
                return 0;
        } else {
            int m = (i + j) / 2;
            return (sommaDispariDicotomico(a, i, m) + sommaDispariDicotomico(a, m + 1, j));
        }
    }// sommaDispariDicotomico

    /*****
     * ESERCIZIO 6
     *****/

    public static int indiceMassimo(int[] a) {
        // l'array a non deve essere null e deve avere una lunghezza maggiore di 0
        if (a != null && a.length > 0)
            return indiceMassimoDicotomico(a, 0, a.length - 1);
        else
            return Integer.MIN_VALUE;
    }// indiceMassimo

    public static int indiceMassimoDicotomico(int[] a, int i, int j) {
        if (i == j)
            return i;
        else {
            int m = (i + j) / 2, x, y;
            x = indiceMassimoDicotomico(a, i, m);
            y = indiceMassimoDicotomico(a, m + 1, j);
            if (a[x] > a[y])
                return x;
            else
                return y;
        }
    }// indiceMassimoDicotomico

    /*****
     * ESERCIZIO 7
     *****/

    public static int[] filtraMaggioriDi(int[] a, int limiteInferiore) {
        // l'array a non deve essere null e deve avere una lunghezza maggiore di 0
        if (a != null && a.length > 0)
            return filtraMaggioriDiRic(a, limiteInferiore, a.length - 1, 0);
        else
            return null;
    }// filtraMaggioriDi

    // count tiene conto del numero di elementi che andranno nel nuovo array
    public static int[] filtraMaggioriDiRic(int[] a, int limiteInferiore, int i, int count) {
        // dichiaro b
        int[] b;

        // se i == 0 sono arrivato all'inizio
        if (i == 0) {

            // controllo se il valore a[i] >= limiteInferiore
            if (a[i] >= limiteInferiore) {

                // inizializzo b al valore di count + 1 perché andrò ad inserire anche quel
                // valore appena controllato (b[count] = a[i])
                b = new int[count + 1];
                b[count] = a[i];
            } else {

                // altrimenti inzializzo al valore di count
                b = new int[count];
            }
            return b;
        } else {

            // controllo se il valore di a[i] >= limiteInferiore
            if (a[i] >= limiteInferiore) {

                // l'array risultato dalla chiamata ricorsiva con i - 1 e count + 1 punterà a b
                b = filtraMaggioriDiRic(a, limiteInferiore, i - 1, count + 1);
                // salvo il valore di a[i] nella cella corrispondente a b[count]
                b[count] = a[i];
                return b;
            } else {

                // se il valore di a[i] < limiteInferiore chiamo ricorsivamente decrementando i
                // e lasciando count invariato perchè non ho trovato un nuovo valore che
                // rispetti la condizione
                return filtraMaggioriDiRic(a, limiteInferiore, i - 1, count);
            }
        }
    }// filtraMaggioriDiRic

    /*****
     * ESERCIZIO 9
     *****/

    public static int eDue(int[] a, int[] b) {
        // gli array a e b non devono essere null
        if (a != null && b != null) {
            return eDueRic(a, b, 0);
        } else {
            return -1;
        }
    }// eDue

    public static int eDueRic(int[] a, int[] b, int i) {

        // controllo che l'indice sia diventato la lunghezza dell'array più piccolo - 1
        // ((a.length > b.length) ? b.length : a.length) ==> if compatto che mi
        // restituisce la lunghezza dell'array più piccolo
        if (i == ((a.length > b.length) ? b.length : a.length) - 1)
            if (a[i] > b[i])
                return a[i] - b[i];
            else
                return b[i] - a[i];

        if (i < ((a.length > b.length) ? b.length : a.length) - 1) {
            if (a[i] > b[i])
                return (a[i] - b[i]) + eDueRic(a, b, i + 1);
            else
                return (b[i] - a[i]) + eDueRic(a, b, i + 1);
        } else
            return 0;
    }// eDueRic

    public static void main(String[] args) {
        int[] a = LeggiArray.leggiArrayInt();
        System.out.println("Tutti i numeri inseriti sono pari: " + tuttiPari(a));

        System.out.print("Inserisci un numero per trovare se esiste almeno un multiplo nell'array: ");
        int m = SIn.readInt();
        System.out.println("Esiste almeno un numero multiplo di " + m + ": " + esisteMultiplo(a, m));

        final int[] a0 = { 0, 1, 2, 3, 4, 5, 6, 7 };
        final int[] a1 = { 3, 7, 9, 4, 5, 12, 11 };
        final int[] a2 = null;
        final int[] a3 = { 0, 10, 40, 60, 20 };

        System.out.println("Somma dispari di a0 = " + sommaDispari(a0));
        System.out.println("Somma dispari di a1 = " + sommaDispari(a1));
        System.out.println("Somma dispari di a2 = " + sommaDispari(a2));
        System.out.println("Somma dispari di a3 = " + sommaDispari(a3));

        System.out.println("____________");

        final int[] altezze = { 5895, 4810, 6194, 4897, 4884, 8848, 6962 };
        final String[] nomi = { "Kilimangiaro", "Monte Bianco", "Monte Denali", "Massiccio Vinson", "Puncak Jaya",
                "Everest", "Aconcagua" };
        int i_max = indiceMassimo(altezze);
        if (i_max == Integer.MIN_VALUE)
            System.out.println("Impossibile stabilire l'indice di un valore inesistente (vettore null o length <= 0)");
        else
            System.out.println("Il monte piu' alto e' " + nomi[i_max] + " alto " + altezze[i_max] + " metri");

        System.out.println("____________");

        int[] filtro_a0 = filtraMaggioriDi(a0, 3);
        int[] filtro_a1 = filtraMaggioriDi(a1, 3);
        int[] filtro_a2 = filtraMaggioriDi(a2, 3);
        int[] filtro_a3 = filtraMaggioriDi(a3, 3);

        for (int x : filtro_a0)
            System.out.print(x + " | ");

        System.out.println("");

        for (int x : filtro_a1)
            System.out.print(x + " | ");

        System.out.println("");

        if (filtro_a2 != null)
            for (int x : filtro_a2)
                System.out.print(x + " | ");
        else
            System.out.print("L'array e' null");

        System.out.println("");

        for (int x : filtro_a3)
            System.out.print(x + " | ");

        System.out.println("\n____________");

        System.out.println(eDue(a0, a1));
        System.out.println(eDue(a1, a0));
        System.out.println(eDue(a2, a3));
        System.out.println(eDue(a0, a3));

    }// main
}// class