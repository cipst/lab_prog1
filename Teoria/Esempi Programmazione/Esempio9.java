class Esempio9{
    public static void main (String[] args){
        System.out.print("Scrivi un numero intero positivo: ");
        int n = SavitchIn.readLineInt();
        for(int i = n; i >= 0; i--){
            System.out.println(i);
        }
    }
}