public class Saluti{
    public static void main(String[] args){
        System.out.print("Inserisci l'ora (0-23): ");
        int h = SIn.readLineInt();
        if(h>=0 && h<=5)
            System.out.println("Buona notte");
        if(h>=6 && h<=12)
            System.out.println("Buon giorno");
        if(h>=13 && h<=17)
            System.out.println("Buon pomeriggio");
        if(h>=18 && h<=23)
            System.out.println("Buona sera");
    }
}