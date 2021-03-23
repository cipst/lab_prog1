public class Mult{
    
    public static int somma(int a, int b){
        while(b>0){
            a++;
            b--;
        }
        return a;
    }//somma

    public static void main(String[] args){
        int x = SavitchIn.readLineInt();
        int y = SavitchIn.readLineInt();
        int z = y;
        int k = x;
        int m = x;
        while(y>0){
            //m = somma(m,x);
            while(x>0){
                m++;
                x--;
            }
            y--;
        }
        System.out.println(k + "*" + z + "= "+ m);
    }//main
}//class