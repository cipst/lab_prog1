public class DivisoriInput{
    public static void main(String[] args){
        System.out.print("Inserisci un numero per scoprirne i suoi divisori: ");
        int n = SIn.readLineInt();
        for(int i = 1; i <= n; i++){
            if(n%i == 0)
                System.out.println(i);
        }
    }//main
}//class