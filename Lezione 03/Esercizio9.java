public class Esercizio9{
    public static void main(String[] args){
        char scelta;
        System.out.println("a.  New document");
        System.out.println("b.  Open document");
        System.out.println("c.  Save as ...");
        System.out.println("d.  Mail document to ...");
        do{
            System.out.println("Please, make your choice (a-d): ");
            scelta = SIn.readNonwhiteChar();
            if(scelta != 'a' && scelta != 'b' && scelta != 'c' && scelta != 'd')
                System.out.println("Choose one of the option in the menu!");
        }while(scelta != 'a' && scelta != 'b' && scelta != 'c' && scelta != 'd');

        if(scelta == 'a')
            System.out.println("You chose to create a new document!");
        if(scelta == 'b')
            System.out.println("You chose to open a document!");
        if(scelta == 'c')
            System.out.println("You chose to save the current document!");
        if(scelta == 'd')
            System.out.println("You chose to send the current document by email!");
    }//main
}//class