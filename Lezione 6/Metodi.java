public class Metodi{
    
    public static boolean palindroma(String text){
        boolean palindroma = true;
        for(int i=0; i<text.length()/2; i++){
            if(text.charAt(i) != text.charAt(text.length()-1-i)){
                palindroma = false;
            }//if
        }//for
        return palindroma;
    }//palindroma
    
    public static boolean elementiComuni(String a, String b){
        boolean comune = false;
        for(int i=0; i<a.length(); i++){
            for(int j=0; j<b.length(); j++){
                if(a.charAt(i) == b.charAt(j)){
                    comune = true;
                }
            }
        }
        return comune;
    }//elementiComuni

    public static void main(String[] args){
        System.out.print("Inserisci una stringa: ");
        String text = SIn.readLine();
        System.out.println("La stringa (" + text + ") e' palindroma: " + palindroma(text));
        System.out.println("----------------------");
        System.out.print("Inserisci una stringa: ");
        String a = SIn.readLine();
        System.out.print("Inserisci una stringa: ");
        String b = SIn.readLine();
        System.out.println("La stringa \"" + a + "\" ha dei caratteri in comune con la stringa \"" + b + "\": " + elementiComuni(a,b));
    }//main
}//class