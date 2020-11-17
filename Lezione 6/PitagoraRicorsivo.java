public class PitagoraRicorsivo {

    /*
        n ==> numero di righe e di colonne della tavola pitagorica
        i ==> righe della tavola -> viene inizializzata a 1 perché non può avere 0 righe
        j ==> colonne della tavola -> viene inizializzata a 1 perché non può avere 0 colonne

        condizione d'uscita i*j == n*n
    */

    public static void pitagora(int n, int i, int j) {
        //se i*j == n*n -> vuol dire che sono arrivato alla fine dalla tavola pitagorica
        if (i * j == n * n)
            System.out.format("%5d", i * j);
        else if (j <= n) {
            //se la colonna j è <= n -> vuol dire che devo ancora completare di scrivere le colonne
            
            System.out.format("%5d", i * j);
            //richiamo pitagora incrementando le colonne
            pitagora(n, i, j + 1);

            //se la riga i è < n && la colonna j è == n -> vuol dire che ho completato le colonne ma devo ancora completare le righe
            if (i < n && j == n) {
                System.out.println();
                //richiamo pitagora incrementando la riga
                //      --> settando la colonna a 1 perchè ogni volta che mi sposto alla riga successiva devo ripartire dalla colonna 1
                pitagora(n, i + 1, 1);
            }
        }
    }// pitagora

    public static void main(String[] args) {
        pitagora(10, 1, 1);
    }// main
}// class