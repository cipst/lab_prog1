public class MediaInput{
    public static void main(String[] args){
        int n = 0;
        int somma = 0;
        int count = 0;
        do{
            System.out.print("Inserisci un numero: ");
            n = SIn.readLineInt();
            somma += n;
            count++;
        }while(n!=0);
        if(count != 0)
            System.out.println("La media intera dei numeri inseriti e': " + (somma/(count-1)));
        else
            System.out.println("Non hai inserito numeri --- Sequenza vuota! ");
    }//main
}//class