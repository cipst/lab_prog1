public class ControllaA{
    public static void main(String[] args){
        char c = ' ';
        boolean isA = false;
        for(int i = 1; i<=5; i++){
            System.out.print(i + ")Inserisci un carattere: ");
            c = SIn.readNonwhiteChar();
            if(c == 'a'){
                isA = true;
            }//if
        }//for
        System.out.println("E' presente almeno un carattere 'a': " + isA);
    }//main
}//class