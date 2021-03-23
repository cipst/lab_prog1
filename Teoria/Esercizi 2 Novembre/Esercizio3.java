public class Esercizio3{
    
    //trasformare metodo Itm con iterazione, in un metodo Recm ricorsivo

    public static void Itm(int n){
        int i = 1;
        while(i <= n){
            if (n % i == 0) 
                System.out.println(i);
            i++;
        }
    }//Itm

    public static void Recm(int i, int n) {
        
        if(i <= n){
            if(n % i == 0){
                System.out.println(i);
            }
            Recm(i+1, n);
        }
    }//Recm

    public static void main(String[] args){
        System.out.print("Inserisci un numero: ");
        int n = SavitchIn.readLineInt();
        System.out.println("Itm(" + n +")");
        Itm(n);
        System.out.println("----------------");
        System.out.println("Recm(1, " + n +")");
        Recm(1, n);
    }//main
}//class