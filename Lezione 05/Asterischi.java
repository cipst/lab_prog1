public class Asterischi{

    public static void rettangoloAsterischi(int x, int y){
        for(int i = 0; i<x; i++){
            for(int j = 0; j<y; j++)
                System.out.print("*");
            System.out.println("");
        }//for i
        System.out.println("________________________\n");
    }//rettangolo Asterischi

    public static void main(String[] args){
        System.out.print("Inserisci la lunghezza del rettangolo: ");
        int x = SIn.readLineInt();
        System.out.print("Inserisci l'altezza del rettangolo: ");
        int y = SIn.readLineInt();

        //Test metodo rettangoloAsterischi
        rettangoloAsterischi(x, y);
        rettangoloAsterischi(5, 3);
        rettangoloAsterischi(12, 4);
        rettangoloAsterischi(8, 23);
        rettangoloAsterischi(3, 3);
    }//main
}//class