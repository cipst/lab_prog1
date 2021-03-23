/**
Scrivere un programma che legge un intero da stdin e scrive su stdout tutti i suoi divisori
*/

public class Divisori {
    public static void main (String[] args){
        System.out.print("Scrivi un intero positivo: ");
        int x = SavitchIn.readLineInt();
        int d = x;
        while (d>0) {
            if(x%d == 0)
                System.out.println(d);
            d--;    
        }//while
    }//main
}//class