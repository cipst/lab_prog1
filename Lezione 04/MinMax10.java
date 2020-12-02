public class MinMax10{
    public static void main(String[] args){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int n = 0;
        for(int i=0; i<10; i++){
            System.out.print((i+1) + ") Inserisci un numero: ");
            n = SIn.readLineInt();
            if(n>max)
                max = n;
            if(n<min)
                min = n;
        }
        System.out.println("Il massimo e': " + max);
        System.out.println("Il minimo e': " + min);
    }//main
}//class

