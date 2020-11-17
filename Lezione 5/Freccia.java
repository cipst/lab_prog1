public class Freccia{

    public static void stampaRiga(int nPunti, int nAsterishi){
        //Stampo la prima parte della freccia
        for(int i = 0; i <= nPunti; i++){
            for(int j = 0; j<i; j++){
                System.out.print(".");
            }
            for(int j = 0; j<nAsterishi; j++){
                System.out.print("*");
            }
            System.out.println("");
        }

        //Stampo la sceconda parte della freccia
        for(int i = 1; i <= nPunti; i++){
            for(int j = nPunti-1; j>=i; j--){
                System.out.print(".");
            }
            for(int j = 0; j<nAsterishi; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }//stampaRiga

    public static void main(String[] args){
        System.out.print("Inserisci un numero: ");
        int n = SIn.readLineInt();
        
        stampaRiga(n-1, 2);
    }//main
}//class