public class EserciziBooleani {

    public static void main(String[] args) {
        System.out.print("Inserisci un numero intero: ");
        int a = SIn.readLineInt();
        System.out.print("Inserisci un altro numero intero: ");
        int b = SIn.readLineInt();;
        
        // a) dati due interi, stampi true se il primo intero è multiplo del secondo, false altrimenti;
        System.out.println(a%b == 0);

        // b) dato un intero (un voto), stampi true se tale intero è compreso fra 1 e 30 (inclusi), false altrimenti;
        System.out.print("Inserisci un numero intero: ");
        int c = SIn.readLineInt();
        System.out.println(c>=1 && c<=30);

        // c) dati due booleani b1 e b2, stampi a video il booleano false, se b1 e b2 sono entrambi veri, true altrimenti;
        System.out.print("Inserisci un valore booleano: ");
        boolean b1 = SIn.readLineBoolean();
        System.out.print("Inserisci un altro valore booleano: ");
        boolean b2 = SIn.readLineBoolean();

        System.out.println(!(b1 && b2));

        // d) dati due interi, stampi a video il massimo; se sono uguali stampi a video "I due valori sono uguali".
        System.out.print("Inserisci un numero intero: ");
        int x = SIn.readLineInt();
        System.out.print("Inserisci un altro numero intero: ");
        int y = SIn.readLineInt();
        if(y == x)
            System.out.println("I due valori sono uguali");
        else {
            if(x > y)
                System.out.println("Il valore massimo e': " + x);
            else
                System.out.println("Il valore massimo e': " + y);
        }
            
        
        // e) dati tre interi, stampi a video il massimo (si usi una variabile di supporto max); 
        System.out.print("Inserisci un numero intero x1: ");
        int x1 = SIn.readLineInt();
        System.out.print("Inserisci un numero intero x2: ");
        int x2 = SIn.readLineInt();
        System.out.print("Inserisci un numero intero x3: ");
        int x3 = SIn.readLineInt();
        int max = x1;
        if(x2 > max)
            max = x2;
        if(x3 > max)
            max = x3;
        System.out.println("Il valore massimo e': " + max);

        // f) dati tre interi, stampi a video true se questi sono ordinati in modo crescente
        System.out.print("Inserisci un numero intero y1: ");
        int y1 = SIn.readLineInt();
        System.out.print("Inserisci un numero intero y2: ");
        int y2 = SIn.readLineInt();
        System.out.print("Inserisci un numero intero y3: ");
        int y3 = SIn.readLineInt();
        if(y1<y2 && y2<y3)
            System.out.println("true, i valori sono ordinati in ordine crescente");
        else
            System.out.println("false, i valori NON sono ordinati in ordine crescente");
    }
}
