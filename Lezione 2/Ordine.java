public class Ordine{
    public static void main(String[] args){
        int v1, v2, v3;

        do{
            System.out.print("Inserisci il valore di v1: ");
            v1 = SIn.readInt();
            System.out.print("Inserisci il valore di v2: ");
            v2 = SIn.readInt();
            System.out.print("Inserisci il valore di v3: ");
            v3 = SIn.readInt();

            System.out.println("Prima dello scambio: v1 = " + v1 + ", v2 = " + v2 + ", v3 = " + v3);

            if(v1>v2){
                v1=v1+v2;
                v2=v1-v2; //v2 ha il valore vecchio di v1
                v1=v1-v2; //v1 ha il valore vecchio di v2
            }
            if(v2>v3){
                v2=v2+v3;
                v3=v2-v3;
                v2=v2-v3;
            }
            if(v1>v2){
                v1=v1+v2;
                v2=v1-v2;
                v1=v1-v2;
            }

            System.out.println("Dopo lo scambio: v1 = " + v1 + ", v2 = " + v2 + ", v3 = " + v3);

        }while(SIn.readLineBoolean());
        
    }
}