public class SelezioneOperazioni{
    public static void main(String[] args){
        int x1, x2, x3, operatore;
        System.out.print("Inserisci un numero intero x1: ");
        x1 = SIn.readLineInt();
        System.out.print("Inserisci un numero intero x2: ");
        x2 = SIn.readLineInt();
        System.out.print("Inserisci un numero intero x3: ");
        x3 = SIn.readLineInt();
        
        do{
            System.out.println("Quale operazione vuoi effettuare?\n    1> Somma\n    2> Moltiplicazione\n    3> Media");
            operatore = SIn.readLineInt();
            if(operatore<1 || operatore>3)
                System.out.println("Operazione non presente!");
        }while(operatore<1 || operatore>3);
        
        if(operatore == 1)
            System.out.println("x1+x2+x3= " + (x1+x2+x3));

        if(operatore == 2)
            System.out.println("x1*x2*x3= " + (x1*x2*x3));
            
        if(operatore == 3)
            System.out.println("(x1+x2+x3)/3.0= " + ((double)(x1+x2+x3)/3.0));
    }//main
}//class