public class Fattoriale{

    static int fattoriale(int n){
        if(n == 0)
            return 1;
        else
            return n*fattoriale(n-1);
    }

    public static void main(String[] args){
        System.out.print("Scrivi un numero naturale intero: ");
        int x = SavitchIn.readLineInt();
        System.out.println("Fattoriale: " + fattoriale(x));
    }
}