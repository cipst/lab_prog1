public class ScelteSuInteri{
    public static void main(String[] args){
        System.out.print("Inserisci un numero intero: ");
        int x = SIn.readLineInt();
        if(x%2 == 0){
            System.out.print("L'intero e' un numero pari ");
            if(x%4 == 0)
                System.out.println("ed e' multiplo di 4");
            else
                System.out.println("ma non e' multiplo di 4");
        }else{
            System.out.print("L'intero e' un numero dispari ");
            if(x%3 == 0)
                System.out.println("ed e' multiplo di 3");
            else
                System.out.println("ma non e' multiplo di 3");
        }//else

    }//main
}//class