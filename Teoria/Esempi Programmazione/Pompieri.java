public class Pompieri{
    public static void main (String[] args){
        System.out.print("Scrivere il numero di pompieri (almeno 2): ");
        int n = SavitchIn.readLineInt();

        for(int i = 1; i<=n; i++){
            System.out.println(i + ((i<=1)?" pompiere ":" pompieri ") + "+ 1 pompiere = " + (i+1) + " pompieri");
        }
    }
}