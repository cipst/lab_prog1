public class TestPermutazioni {
    public static void main(String[] args) {
        // System.out.print(MetodiRicorsivi.eliminaCarattere("pippo", 2));
        System.out.print("Inserisci una stringa da permutare: ");
        String s = SIn.readLine();
        MetodiRicorsivi.permutazioniStringa(s);
    }
}// class