public class LeggiArray {

    // metodo wrapper
    public static int[] leggiArrayInt() {
        return leggiArrayIntRic(0);
    }// leggiArrayInt

    // metodo ricorsivo
    public static int[] leggiArrayIntRic(int i) {
        // dichiarazione dell'array che verrà restituito al metodo wrapper
        int[] a;

        System.out.print("Inserisci un numero intero (0 per terminare): ");
        int n = SIn.readInt();

        // se l'utente inserisce 0 creo l'array di i elementi --> dove i è il contatore
        // che mi dice quanti elementi ha inserito l'utente
        if (n == 0)
            return new int[i];
        else {
            // a questo punto l'array punterà allo stesso array delal chiamata ricorsiva con
            // indice + 1
            a = leggiArrayIntRic(i + 1);
            // salvo il valore di n inserito dall'utente
            a[i] = n;
            // restituisco l'array con il numero appena inserito
            return a;
        }
    }// leggiArrayIntRic

    public static void stampaArrayIntRic(int[] intArray, int i) {
        // se i ha raggiunto intArray.length - 1 --> devo solo stampare l'ultimo
        // elemento e non richiamare più nulla
        if (i == intArray.length - 1)
            System.out.println(intArray[i]);
        else {
            // altrimenti: stampo l'elemento nella posizione corrente e richiamo su i + 1
            System.out.println(intArray[i]);
            stampaArrayIntRic(intArray, i + 1);
        }
    }// stampaArrayIntRic

    public static void main(String[] args) {
        int[] array = leggiArrayInt();
        stampaArrayIntRic(array, 0);

    }// main
}// class