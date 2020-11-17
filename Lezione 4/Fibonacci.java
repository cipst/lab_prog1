public class Fibonacci{
    public static void main(String[] args){
        int n=0;
        int m=1;
        int k=n+m;
        System.out.print("Inserisci un numero: ");
        int input = SIn.readLineInt();
        
        System.out.print(n + " " + m + " ");

        for(int i=0; i<input-2; i++){
            m=n;
            n=k;
            k=m+n;
            System.out.print(k + " ");
        }
    }//main
}//class