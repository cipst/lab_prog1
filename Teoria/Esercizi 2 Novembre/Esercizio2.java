public class Esercizio2{

    //scrivere un metodo ricorsivo che calcola il quadrato di un numero naturale 
        // (anche in questo caso, partiamo chiedendoci come dipende il quadrato di n dal quadrato di n – 1?)

    public static int quadrato(int n){
        if(n == 0) return 0;
        else return n + (n - 1) + quadrato(n-1); // n^2 = n + (n-1) + (n-1)^2 == n + n - 1 + n^2 - 2n + 1 == n^2
    }//quadrato

    public static void main(String[] args){
        System.out.println(quadrato(5));
    }//main
}//class