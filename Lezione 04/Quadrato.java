public class Quadrato{
    public static void main(String[] args){
        System.out.print("Inserisci il lato del quadrato: ");
        int n = SIn.readLineInt();

        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                if(i==j)
                    System.out.print("\\");
                if(i>j)
                    System.out.print("*");
                if(i<j)
                    System.out.print(":");
            }
            System.out.println("");
        }
    }//main
}//class