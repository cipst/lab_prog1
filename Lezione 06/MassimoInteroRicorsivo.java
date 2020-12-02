public class MassimoInteroRicorsivo{
    
    public static int massimoIntero(int max){
        System.out.print("Inserisci un intero: ");
        int n = SIn.readLineInt();
        if(n==0) return max;
        else if (n>max) return massimoIntero(n);
        else return massimoIntero(max);
    }
    
    public static void main(String[] args){
        System.out.println("Il massimo e': " + massimoIntero(0));
    }//main 
}//class