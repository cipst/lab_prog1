public class EserciziStringhe{
    
    //metodo testVocale che prende in input un carattere e ritorna true se è una vocale
    public static boolean testVocale(char c){
        if("AEIOUaeiou".indexOf(c) != -1)
            return true;
        else
            return false;
    }//testVocale

    //metodo contieneVocali che prende in input una stringa e ritorna true se contiene almeno una vocale
    public static boolean contieneVocali(String testo){
        boolean hasVocale = false;
        for(int i = 0; i<testo.length() & !hasVocale; i++){
            hasVocale = testVocale(testo.charAt(i));
        }
        return hasVocale;
    }//contieneVocali

    //metodo stampaVocali che prende in input una stringa e ne stampa a video solo le lettere che corrispondono alle vocali
    public static void stampaVocali(String testo){
        for(int i = 0; i<testo.length(); i++){
            if(testVocale(testo.charAt(i))){
                System.out.print(testo.charAt(i) + "| ");
            }
        }
    }//stampaVocali

    public static void main(String[] args){
        System.out.print("Inserisci una stringa: ");
        String testo = SIn.readWord();
        boolean check = contieneVocali(testo);
        if(contieneVocali(testo))
            stampaVocali(testo);
        else
            System.out.println("La stringha non contiene vocali!");
    }//main
}//class