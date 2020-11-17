public class Floyd{
    public static void main(String[] args){
        System.out.print("Inserisci un numero N di righe: ");
        int n = SIn.readLineInt();

        int a = 1;
        int j=0;
        for(int i = 1; i<=n; i++){
            for(j = a; j<a+i; j++){
                System.out.print(j + " ");
            }
            a = j;
            System.out.println("");
        }
    }//main
}//class