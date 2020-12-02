public class Ciao{
    public static void main(String[] args){
        String testo = " ";
        boolean isCiao = true;
        for(int i = 1; i<=5; i++){
            System.out.print(i + " inserisci una parola: ");
            testo = SIn.readWord();
            if(!testo.equals("ciao")){
                isCiao = false;
            }
        }//for

        System.out.println("Tutte le stringhe inserite sono \"ciao\": " + isCiao);
    }//main
}//class