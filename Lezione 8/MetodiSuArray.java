public class MetodiSuArray {

    // ##############
    // ESERCIZIO 1
    // ##############
    public static int[] initArrayInt() {
        System.out.print("Inserisci la lunghezza dell'array: ");
        int n = SIn.readInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print((i + 1) + ") Inserisci " + (n - i) + " numeri: ");
            a[i] = SIn.readInt();
            ;
        }
        return a;
    }// initArrayInt

    public static void stampaArrayInt(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }// stampaArrayInt

    // ##############
    // ESERCIZIO 2
    // ##############
    public static void copiaElementi(int[] from, int[] to) {
        for (int i = 0; i < from.length; i++)
            to[i] = from[i];
    }// copiaElementi

    public static int[] clonaArray(int[] a) {
        int[] b = new int[a.length];
        copiaElementi(a, b);
        return b;
    }// clonaArray

    // ##############
    // ESERCIZIO 3
    // ##############
    public static int[] filtroMinoriDi(int[] a, int limiteSuperiore) {
        int dimB = 0;
        for (int i = 0; i < a.length; i++)
            if (a[i] < limiteSuperiore)
                dimB++;

        int[] b = new int[dimB];
        int j = 0;

        for (int i = 0; i < a.length; i++)
            if (a[i] < limiteSuperiore) {
                b[j] = a[i];
                j++;
            }

        return b;
    }// filtroMinoriDi

    public static int[] filtroIntervalloDisp(int[] a, int min, int max) {
        int dimB = 0;
        for (int i = 0; i < a.length; i++)
            if (a[i] % 2 != 0 && a[i] >= min && a[i] <= max)
                dimB++;

        int[] b = new int[dimB];
        int j = 0;

        for (int i = 0; i < a.length; i++)
            if (a[i] % 2 != 0 && a[i] >= min && a[i] <= max) {
                b[j] = a[i];
                j++;
            }

        return b;
    }// filtroIntervalloDisp

    public static boolean[] trasduttore(int[] a, int limiteSuperiore) {
        boolean[] b = new boolean[a.length];
        for (int i = 0; i < a.length; i++)
            if (a[i] < limiteSuperiore)
                b[i] = true;
            else
                b[i] = false;
        return b;
    }// trasduttore

    public static void stampaArrayBoolean(boolean[] a) {
        for (int i = 0; i < a.length; i++)
            System.out.println(a[i]);
    }// stampaArrayBoolean

    // ##############
    // ESERCIZIO 4
    // ITERATIVI
    // ##############
    public static boolean eqArray(int[] a, int[] b) {
        // se le due lunghezze sono diverse vuol dire che i due array sono diversi ==>
        // return false
        if (a.length > b.length || b.length > a.length)
            return false;
        // se i due array puntano allo stesso indirizzo vuol dire che sono lo stesso
        // array ==> return true
        if (a == b)
            return true;

        // se trovo un elemento che non è lo stesso vuol dire che sono diversi ==>
        // return false
        for (int i = 0; i < a.length; i++)
            if (a[i] != b[i])
                return false;

        // se esco dal ciclo vuol dire che tutti gli elementi sono uguali ==> return
        // true
        return true;
    }// eqArray

    public static boolean tuttiPariMaggioriDi(int[] a, int num) {
        // se almeno un elemento non è pari o è minore al numero inserito ==> return
        // false
        for (int i = 0; i < a.length; i++)
            if (a[i] % 2 != 0 || a[i] < num)
                return false;

        // se esco dal ciclo vuol dire che tutti gli elementi sono pari e maggiori o
        // uguali di num ==> return true
        return true;
    }// tuttiPariMaggioriDi

    // ##############
    // ESERCIZIO 5
    // ##############
    public static int indiceSubSeq(int[] a, int[] b) {
        // inizializzo index a -1 --> parto supponendo di non trovarlo
        int index = -1;
        int j = 0;
        boolean trovato = false;

        // rimango dentro il for finché i<a.length e finché non ho trovato la
        // sottosequenza
        for (int i = 0; i < a.length && !trovato; i++) {
            // se l'elemento i di a == all'elemento j di b --> incremento j
            // altrimenti riparto da j = 0 --> perché vuol dire che gli elementi uguali non
            // vengono uno dopo l'altro
            if (a[i] == b[j])
                j++;
            else
                j = 0;

            // se j ha raggiunto la lunghezza di b --> ho trovato la sottosequenza
            // trovato diventa true per poter uscire dal ciclo
            // index diventa i - j + 1
            // => i è il valore della posizione rima di uscire dal ciclo --> cioè
            // l'indice dell'ultimo valore della sottostringa
            // => j è la lunghezza di b
            if (j == b.length) {
                trovato = true;
                index = i - j + 1;
            }
        } // for

        return index;
    }
}// class