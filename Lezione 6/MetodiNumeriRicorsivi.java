public class MetodiNumeriRicorsivi{
    
    public static int esponenziale(int b, int e){
        if(e == 0) return 1;
        else return b*esponenziale(b,e-1);
    }//esponenziale
    
    public static int somma(int a, int b){
        if(b==0) return a;
        else return 1+somma(a,b-1);
    }//somma

    public static int prodottoMultipli(int n, int m, int q){
        if(m<n) return 1;
        if(m%q == 0) return m*prodottoMultipli(n, m-1, q);
        else return prodottoMultipli(n, m-1, q);
    }//prodottiMultipli

    public static void stampaInteroAlRovescio(int n){
        System.out.println(n);
        if(n!=0) stampaInteroAlRovescio(n-1);
    }//stampaInteroAlRovescio

    public static void main(String[] args){
        System.out.print("Inserisci un numero (base): ");
        int b = SIn.readLineInt();
        System.out.print("Inserisci un numero (esponente): ");
        int e = SIn.readLineInt();
        System.out.println(esponenziale(b, e));

        System.out.println("-------------------------------");

        System.out.print("Inserisci un numero: ");
        int x = SIn.readLineInt();
        System.out.print("Inserisci un altro numero : ");
        int y = SIn.readLineInt();
        System.out.println(somma(x, y));

        System.out.println("-------------------------------");

        System.out.print("Inserisci un numero (n): ");
        int n = SIn.readLineInt();
        System.out.print("Inserisci un numero (m) : ");
        int m = SIn.readLineInt();
        System.out.print("Inserisci un numero (q) : ");
        int q = SIn.readLineInt();
        System.out.println(prodottoMultipli(n, m, q));

        System.out.println("-------------------------------");

        System.out.print("Inserisci un numero: ");
        int z = SIn.readLineInt();
        stampaInteroAlRovescio(z);
    }//main
}//class