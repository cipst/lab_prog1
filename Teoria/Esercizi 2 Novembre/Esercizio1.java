public class Esercizio1{

    //scrivere un metodo ricorsivo che calcola il doppio di un numero naturale (come dipende il doppio di n dal doppio di n – 1?)

    public static int doppio(int n){
        if(n == 0) return 0;
        else return doppio(n-1)+2;
    }//doppio

    public static void main(String[] args){
        System.out.println(doppio(5));
    }//main
}//class