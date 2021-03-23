/**
Esercizio
Determinare se una sequenza di numeri interi positivi scritta su stdin (uno per riga) e terminata da 0 contiene almeno un numero pari
*/
public class AlmenoUnPari {
    public static void main (String[] args){
        int x = 0; // variabile di lettura
        boolean pari = true;
        do {
            System.out.print("Inserisci un numero intero positivo: ");
            x = SavitchIn.readLineInt();
            if(x%2 == 0 && x != 0)
                pari = true;
            else
                pari = false;
        } while (x != 0);
        System.out.println("C'e' almeno un numero pari: " + pari);
    }
}