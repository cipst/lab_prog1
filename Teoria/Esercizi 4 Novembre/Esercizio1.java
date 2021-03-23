public class Esercizio1{
    
    //stampare uno per riga tutti i divisori di n

    public static void div(int n, int i){
        if(i<=n){
            if(n%i == 0){
                System.out.println(i);
            }
            div(n, i+1);
        }
    }//div

    public static void main(String[] args){
        div(10,1);  
    }//main
}//class