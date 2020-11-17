public class RipetiTesto{
    public static void main(String[] args){
        System.out.println("Inserisci una stringa:");
        String testo = SIn.readLine();

        for(int i = 0; i<5; i++){
            System.out.println(i + ") " + testo + ", lunghezza: " + testo.length());
        }//for
    }//main
}//class




