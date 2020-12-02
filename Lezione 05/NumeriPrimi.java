public class NumeriPrimi{

    public static boolean verificaPrimalita(int n){
        boolean isPrimo = true;
        for(int i = 2; i<n&isPrimo; i++){
            if(n%i == 0)
                isPrimo = false;
        }//for

        return isPrimo;
    }//verificaPrimalita

    public static void main(String[] args){
        System.out.print("Inserisci un numero: ");
        int n = SIn.readLineInt();

        for(int i = 1; i<n; i++){
            if(verificaPrimalita(i)){
                System.out.println(i);
            }//if
        }//for
    }//main
}//class