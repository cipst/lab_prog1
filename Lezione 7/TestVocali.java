public class TestVocali {

    public static void main(String[] args) {
        System.out.print("Inserisci una stringa: ");
        String s = SIn.readLine();
        stampa(s, 'a');
        stampa(s, 'e');
        stampa(s, 'i');
        stampa(s, 'o');
        stampa(s, 'u');
    }// main

    public static void stampa(String s, char c) {
        if (MetodiRicorsivi.trovaCarattere(s, c))
            System.out.println("Numero occorrenze vocale '" + c + "': " + MetodiRicorsivi.contaCaratteri(s, c));
        else
            System.out.println("La vocale '" + c + "' non e' presente.");
    }// stampa

}// class