public class StringaMaxRicorsiva{
    
    public static int stringaMaxRicorsiva(int max){
        System.out.print("Inserisci una stringa: ");
        String text = SIn.readLine();
        if(text.length()==0) return max;
        else if (text.length()>max) return stringaMaxRicorsiva(text.length());
        else return stringaMaxRicorsiva(max);
    }
    
    public static void main(String[] args){
        System.out.println("Il massimo e': " + stringaMaxRicorsiva(0));
    }//main 

}//class