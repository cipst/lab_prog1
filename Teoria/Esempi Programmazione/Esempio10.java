public class Esempio10{
    public static void main(String[] args){
        int x, y, n, m, max;
        System.out.print("Inserisci un numero intero: ");
        n = SavitchIn.readLineInt();
        System.out.print("Inserisci un altro numero intero: ");
        m = SavitchIn.readLineInt();
        x = n;
        y = m;
        while(x!=0 && y!=0){
            y--;
            x--;
            System.out.println(x + "    " + y);
        }
        if(x==0) max = m;
        else max = n;

        System.out.println("Il massimo e': " + max);



        /*while(y>0){
            y--;
            x--;
        }
        if(x>=0){
            System.out.println(n);
        }else{
            System.out.println(m);
        }*/
    }
}