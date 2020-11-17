public class SommeCifre{

    public static int numeroNcifre(int n){
        int ris = 0;

        for(int i=1; i<=n; i++){
            for(int j=0; j<i; j++){
                ris += i*Math.pow(10, j);
            }
        }
        return ris;
    }

    public static void main(String[] args){
        int n = 0;
        do{
            System.out.print("Inserisci un numero: ");
            n = SIn.readLineInt();
            if(n<1 || n>9)
                System.out.println("Il numero deve essere compreso tra 1 e 9!");
        }while(n<1 || n>9);
        
        int ris = numeroNcifre(n);

        System.out.println("Il risultato e': " + ris);
    }//main
}//class