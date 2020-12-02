public class TestInitArray {
    public static void main(String[] args) {
        // ESERCIZIO 1
        int[] a = MetodiSuArray.initArrayInt();
        MetodiSuArray.stampaArrayInt(a);

        // ESERCIZIO 2
        int[] b = MetodiSuArray.clonaArray(a);
        System.out.println("Clone di array a:");
        MetodiSuArray.stampaArrayInt(b);

        // ESERCIZIO 3
        System.out.print("Inserisci un limite: ");
        int limiteSuperiore = SIn.readInt();
        MetodiSuArray.stampaArrayInt(MetodiSuArray.filtroMinoriDi(a, limiteSuperiore));

        System.out.print("Inserisci un minimo: ");
        int min = SIn.readInt();
        System.out.print("Inserisci un massimo: ");
        int max = SIn.readInt();
        System.out.println("Numeri dispari compresi tra " + min + " e " + max);
        MetodiSuArray.stampaArrayInt(MetodiSuArray.filtroIntervalloDisp(a, min, max));
        
        System.out.println("Array di boolean degli elementi di a che sono minori di " + limiteSuperiore);
        MetodiSuArray.stampaArrayBoolean(MetodiSuArray.trasduttore(a, limiteSuperiore));
    }
}