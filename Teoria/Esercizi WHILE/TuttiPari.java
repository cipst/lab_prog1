/**
Programma per determinare se tutti i numeri interi positivi letti da stdin (la sequenza è terminata da 0) sono pari
*/

public class TuttiPari {
    public static void main (String[] args){
        int x = 0; // variabile di lettura
        boolean pari = true;
        do {
            System.out.print("Inserisci un numero intero positivo: ");
            x = SavitchIn.readLineInt();
            if(x%2 == 0 && pari)
                pari = true;
            else
                pari = false;
        } while (x != 0);
        System.out.println("I numeri inseriti sono tutti pari: " + pari);
    }
}