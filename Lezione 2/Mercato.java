public class Mercato{
    public static void main(String[] args){
        final float p_orecchiette = 1.50f; //prezzo di un pacco di orecchiette
        final float p_pomodori = 2.50f; //prezzo di 1kg di pomodori

        System.out.print("Inserisici il numero di pacchi di orecchiette acquistati: ");
        int n_orecchiette = SIn.readInt(); //numero di pacchi di orecchiette
        System.out.print("Inserisici la quantita' di pomodori acquistati (in kg): ");
        double n_pomodori = SIn.readDouble(); //numero di pomodori al kg

        double tot = (n_orecchiette*p_orecchiette) + (n_pomodori*p_pomodori);
        System.out.println("Il prezzo totale e' di: " + tot);
    }
}