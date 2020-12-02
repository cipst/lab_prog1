public class AritNatIter {

    // metodo che implementa la somma di due numeri x e y, 
    // attraverso incrementi progressivi di +1. 
    // L'argomento y non può essere negativo.
    public static int somma(int x, int y) { // x, y parametri formali
        int s = x;
        int i = 0;
        while (i < y) {
            s = s + 1;
            i = i + 1;
        }
        return s;
    }

    // il metodo moltiplicazione restituisce il prodotto tra x ed y.
    // Il prodotto viene realizzato attraverso incrementi successivi di +1.
    public static int moltiplicazione(int x, int y) { // x, y parametri formali 
        int m = 0;
        int i = 0;
        while (i < y) {
            m = somma(m, x); // chiamiamo somma sui parametri attuali m e x
            // risultato: m' = m+x
            i = i + 1;
        }
        return m;
    }


    public static int max(int n, int m){
        int max = m;
        if(n>max)
            max = n;
        return max;
    }

    public static int sommatoria(int n){
        int s = 0;
        for(int i=1; i<=n; i++){
            s = s + i;
        }
        return s;
    }

    public static int fattoriale(int n){
        if(n==0)
            return 1;
        else
            return (n*fattoriale(n-1));
    }

    public static int potenza(int x, int y){
        int p=1;
        for(int i=0; i<y; i++){
            p*=x;
        }
        return p;
    }

    public static void main(String[] args) {
        // Test della somma
        System.out.println("33 + 3 = " + somma(33, 3) + ", atteso: " + (33+3));
        System.out.println("4 + 0 = " + somma(4, 0) + ", atteso: " + (4+0));

        // Verifica commutatività della somma
        System.out.println(somma(33, 3) == somma(3, 33));
        System.out.println(somma(4, 0) == somma(0, 4));

        // ESERCIZIO: verificare assocatività somma con alcuni esempi di test
        //            (x+y)+z == x+(y+z)


        // Test metodo moltiplicazione 
        System.out.println("523 * 13 = " + moltiplicazione(523, 13) 
            + ", atteso: " + (523*13));
        System.out.println("523 * 0 = " + moltiplicazione(523, 0) 
            + ", atteso: " + (523*0));

        // Test commutatività moltiplicazione 
        System.out.println(moltiplicazione(523, 13) == moltiplicazione(13, 523));
        System.out.println(moltiplicazione(523, 0) == moltiplicazione(0, 523));
        System.out.println(moltiplicazione(0, 13) == moltiplicazione(13, 0));

        // ESERCIZIO: verificare assocatività moltiplicazione con alcuni esempi di test
        //            (x*y)*z == x*(y*z)

        System.out.println("max 1, 10 = " + max(1, 10) + ", atteso: " + 10);
        System.out.println("max 523, 13 = " + max(523, 13) + ", atteso: " + 523);

        System.out.println("1+2+3+4+5+6+7+8+9+10 = " + sommatoria(10) + ", atteso: " + (1+2+3+4+5+6+7+8+9+10));
        System.out.println("1+2+3+4+5+6 = " + sommatoria(6) + ", atteso: " + (1+2+3+4+5+6));

        System.out.println("5! = " + fattoriale(5) + ", atteso: " + (1*2*3*4*5));
        System.out.println("0! = " + fattoriale(0) + ", atteso: " + (1));

        System.out.println("2^3 = " + potenza(2,3) + ", atteso: " + (2*2*2));
        System.out.println("2^0 = " + potenza(2,0) + ", atteso: " + (1));

    }
}
