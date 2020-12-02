public class EserciziWhile{
    public static void main(String[] args){
        System.out.print("Inserisci un numero intero positivo: ");
        int n = SIn.readLineInt();

        int i=0;
        while(i<=n){
            System.out.println(i);
            i++;
        }
        for(i=n; i>=0; i--){
            System.out.println(i);
        }
        System.out.println("---");
        for(i=0; i<=n; i++){
            if(i%2 != 0)
                System.out.println(i);
        }
        System.out.println("---");
        int q = 1;
        for(i=1; i<=n; i++){
            q *= i;
        }
        System.out.println("Fattoriale di " + n + " : " + q);
    }//main
}//class