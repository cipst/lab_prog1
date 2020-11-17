public class TestRicorsione {

    public static void main(String[] args) {
        System.out.println("La somma dei numeri inseriti e': " + MetodiRicorsivi.sommatoriaRicorsiva());

        System.out.print("Inserisci una stringa: ");
        String s = SIn.readLine();
        System.out.println("Nella stringa " + s + " e' presente il carattere 'o': " + MetodiRicorsivi.trovaCarattere(s, 'o'));
        System.out.println("Nella stringa " + s + " sono presenti " + MetodiRicorsivi.contaCaratteri(s, 'o') + " occorrenze del carattere 'o'");
    }// main
}// class