
// Esercizio: Scambio di variabili all'interno del metodo main
// utilizzando delle variabili di supporto
public class ScambioVariabili {

    /* main è il metodo principale, che avvia il programma. 
     * Serve alla macchina virtuale, cioè al comando java per 
     * iniziare l'esecuzione del codice Java 
     * nel file ScambioVariabili.class */
    public static void main(String[] args) {
        System.out.print("Inserisci il valore di x: ");
        int x = SIn.readInt();
        System.out.print("Inserisci il valore di y: ");
        int y = SIn.readInt();

        boolean b1 = true;
        boolean b2 = false;

        System.out.println("Prima dello scambio: x = " + x + ", y = " + y + ", b1 = " + b1 + ", b2 = " + b2);

        // ESERCIZIO: scambia il valore di x con quello di y
        // scrivere qui il codice
        /*
            int z = x;
            x=y;
            y=z;
        */
        x = x+y;
        y = x-y;
        x = x-y;

        b1 = !b1;
        b2 = !b2;

        System.out.println("Dopo lo scambio: x = " + x + ", y = " + y + ", b1 = " + b1 + ", b2 = " + b2);

    } // fine del main
    
} // fine della classe
