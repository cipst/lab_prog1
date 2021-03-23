public class Esercizio2{
    
    //dato n>0 restituisca la migliore approssimazione intera della radice quadrata di n
    public static int sr(int n, int i){
        if((i+1)*(i+1) > n) return i;
        else return sr(n, i+1);
    }//sr

    public static void main(String[] args){
        System.out.println(sr(5, 1));
    }//main
}//class