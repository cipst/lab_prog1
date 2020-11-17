public class TestEqArray {
    public static void main(String[] args) {

        // ##############
        // ESERCIZIO 4
        // ##############
        int[] a1 = { 0, 2, 3, 5, -4, 9, 10 };
        int[] a2 = { 6, 4, 4, 8, 12, 4, 22 };
        int[] a3 = { 10, 7, 5, 99, 31, 20 };
        int[] a4 = { 5, 7, 8, 9, 12 };
        int[] a5 = MetodiSuArray.clonaArray(a2);
        System.out.println(MetodiSuArray.eqArray(a1, a2));
        System.out.println(MetodiSuArray.eqArray(a4, a2));
        System.out.println(MetodiSuArray.eqArray(a5, a2));
        System.out.println(MetodiSuArray.eqArray(a3, a3));

        System.out.println();

        System.out.println(MetodiSuArray.tuttiPariMaggioriDi(a1, 0));
        System.out.println(MetodiSuArray.tuttiPariMaggioriDi(a2, 2));
        System.out.println(MetodiSuArray.tuttiPariMaggioriDi(a2, 8));
        System.out.println(MetodiSuArray.tuttiPariMaggioriDi(a4, -5));

        // ##############
        // ESERCIZIO 5
        // ##############

        int[] b1 = {1, 2, 3, 1, 2, 1, 1};
        int[] b2 = {1, 2, 4};
        System.out.print("Array 1: ");
        MetodiSuArray.stampaArrayInt(b1);
        System.out.print("Array 2: ");
        MetodiSuArray.stampaArrayInt(b2);

        System.out.println();

        System.out.println("La sottosequenza array 2 inizia in posizione " + MetodiSuArray.indiceSubSeq(b1, b2) + " nell'array 1");
    }
}