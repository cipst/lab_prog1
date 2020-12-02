public class Freccia{
    public static void main(String[] args){
        System.out.print("Inserisci un numero: ");
        int n = SIn.readLineInt();
        
        for(int i = 0; i <= n; i++){
            for(int j = 0; j<i; j++){
                System.out.print(".");
            }
            System.out.println("**");
        }
        for(int i = 1; i <= n; i++){
            for(int j = n-1; j>=i; j--){
                System.out.print(".");
            }
            System.out.println("**");
        }
    }//main
}//class