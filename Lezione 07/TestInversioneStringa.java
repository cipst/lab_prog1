public class TestInversioneStringa {
    public static void main(String[] args) {
        System.out.print("Inserisci la stringa da invertire: ");
        String s = SIn.readLine();
        System.out.println("Inversa: " + MetodiRicorsivi.stringaInversa(s));
    }
}