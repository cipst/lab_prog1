public class StringaMax{
    public static void main(String[] args){
        int max = 0;
        String text = "";
        do{
            System.out.print("Inserisci una stringa (stringa vuota per terminare): ");
            text = SIn.readLine();
            if(text.length() > max) max = text.length();
        }while(text.length() != 0);
        System.out.println("Il massimo e': " + max);
    }//main
}//class