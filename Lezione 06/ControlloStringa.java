public class ControlloStringa{
    
    public static boolean tutteCifre(String s){
        return tutteCifreRic(s, 0);
    }//tutteCifre

    public static boolean tutteCifreRic(String s, int i){
        if(i==s.length()) return true;
        if(s.charAt(i) == '0' || s.charAt(i) == '1' || s.charAt(i) == '2' || s.charAt(i) == '3' || s.charAt(i) == '4' || s.charAt(i) == '5' || s.charAt(i) == '6' || s.charAt(i) == '7' ||s.charAt(i) == '8' || s.charAt(i) == '9')
            return true && tutteCifreRic(s, i+1);
        else return false;
    }//tutteCifreRic
    
    public static void main(String[] args){
        System.out.print("Inserisci una stringa: ");
        String s = SIn.readWord();
        System.out.println("Tutti i cratteri della stringa \"" + s + "\" sono cifre: " + tutteCifre(s));
    }//main
}//class