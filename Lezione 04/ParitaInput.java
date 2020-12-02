public class ParitaInput{
    public static void main(String[] args){
        int n = 0;
        int pari = 0;
        int dispari = 0;
        
        do{
            System.out.print("Inserisci un numero: ");
            n = SIn.readLineInt();
            if(n%2 == 0){
                if(n != 0)
                    pari++;
            }
            else{
                dispari++;
            }
        }while(n != 0);

        if(dispari==0 & pari==0)
            System.out.println("Non hai inserito numeri!");
        else if(dispari == 0)
            System.out.println("Tutti i numeri inseriti sono pari");
        else if(pari == 0)
            System.out.println("Tutti i numeri inseriti sono dispari");
        else if(dispari>0 & pari>0)
            System.out.println("Ci sono sia numeri pari(" + pari + ") che dispari(" + dispari + ")");
        
        
    }//main
}//class