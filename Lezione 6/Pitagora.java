public class Pitagora{
    
    public static void tavolaPitagorica(){
        for(int i=1; i<=10; i++){
            for(int j=1; j<=10; j++){
                if(i*j < 10 || j==10 && i!=10)
                    System.out.print(" " + i*j + "\t" );
                else
                    System.out.print(i*j + "\t" );
            }
            System.out.println();
        }
    }//tavolaPitagorica

    public static void main (String[] args){
        tavolaPitagorica();
    }//main
}//class