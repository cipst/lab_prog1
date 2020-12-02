public class SommeCifre{
    public static void main(String[] args){
        System.out.print("Inserisci un numero: ");
        int n = SIn.readLineInt();
        int ris = 0;

        for(int i=1; i<=n; i++){
            for(int j=0; j<i; j++){
                ris += i*Math.pow(10, j);
            }
        }

        System.out.println("Il risultato e': " + ris);
    }//main
}//class