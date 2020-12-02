public class TestPalindromi {

    public static void main(String[] args) {
        System.out.print("Inserisci una stringa: ");
        String s1 = SIn.readLine();
        System.out.print("Inserisci un'altra stringa: ");
        String s2 = SIn.readLine();
        System.out.println("La stringa " + s1 + " e' palindroma: " + MetodiRicorsivi.palindroma(s1));
        System.out.println("La stringa " + s2 + " e' palindroma: " + MetodiRicorsivi.palindroma(s2));
    }// main

}// class