public class SommaPrimi {

    /*
        n ==> numero inserito in input
        sum ==> contiene la somma ad ogni ricorsione
        i ==> numero che aumenta per vedere se è primo --> parte da 2 perchè è il primo numero primo
                --> ad ogni ricorsione viene incrementato per vedere se il successivo è primo
    */
    public static int sommaPrimi(int n, int sum, int i) {
        if (n == 0)
            return sum;
        else if (isPrimo(i, 2)) {
            sum += i;
            //se i è primo, il numero n di numeri primi deve essere decrementato
            //i viene incrementato perchè si vuole trovare il successivo numero primo
            return sommaPrimi(n - 1, sum, i + 1);
        } else {
            //se i non è primo, cerco il successivo numero primo
            return sommaPrimi(n, sum, i + 1);
        }
    }// sommaPrimi

    /*
        n ==> corrisponde al valore di i nel metodo sommaPrimi
        i ==> variabile contatore che viene incrementata ad ogni ricorsione per vedere se n è divisibile per i
                --> condizioni d'uscita: 
                    - n primo: i>n/2 -> perchè se non sono presenti numeri divisibili nella sua "prima" metà, non ce ne saranno neanche nella sua "seconda"
                    - n non primo: n%i==0 -> trovo un numero per il quale n è divisibile
    */
    public static boolean isPrimo(int n, int i) {
        if (i > n/2)
            return true;
        if (n % i == 0)
            return false;
        else
            return isPrimo(n, i + 1);
    }// isPrimo

    public static boolean naturale(int n) {
        if (n < 0) {
            System.out.println("Il numero deve essere >= 0");
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int n;
        do {
            System.out.print("Inserisci un numero: ");
            n = SIn.readLineInt();
        } while (!naturale(n));

        System.out.println("Somma dei primi " + n + " numeri primi: " + sommaPrimi(n, 0, 2));
    }// main
}// class