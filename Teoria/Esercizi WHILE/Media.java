/**
Scrivere un programma che legge da stdin una sequenza di interi positivi terminata da 0 e ne scrive su stdout la media
*/

public class Media {
    public static void main (String[] args){
        // dichiarazioni di variabili
        int n = 0; //n preso in input
        int s = 0; //somma degli n
        int c = -1; //count dei numeri inseriti
        // c = -1 perché se si inseriscono 3 numeri + lo 0 per concludere
            //il contatore conterebbe 4 numeri totali -> 4-1 = 3 -> i numeri effettivi inseriti
        do {
            System.out.print("Inserisci un numero intero positivo: ");
            n = SavitchIn.readLineInt();
            s += n;
            c++;
        } while (n != 0);
        System.out.println("Media =  " + (double)s/c);
    }
}
