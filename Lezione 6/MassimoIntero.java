public class MassimoIntero{

    public static void main(String[] args){
        int n, max = 0;
        do{
            System.out.print("Inserisci un numero (0 per terminare): ");
            n = SIn.readLineInt();
            if(n > max) max = n;
        }while(n != 0);
        System.out.println("Il massimo e': " + max);
    }//main

}//class