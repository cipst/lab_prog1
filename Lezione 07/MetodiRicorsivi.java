public class MetodiRicorsivi {

    // #### ESERCIZIO 1 ####
    public static int sommatoriaRicorsiva() {
        System.out.print("Inserisci un numero (0 per terminare): ");
        int n = SIn.readInt();
        if (n == 0)
            return 0;
        else
            return n + sommatoriaRicorsiva();
    }// sommatoriaRicorsiva

    // #### ESERCIZIO 2 ####
    public static boolean trovaCarattere(String s, char c) {
        return trovaCarattereRicorsivo(s, c, 0);
    }// trovaCarattere

    public static boolean trovaCarattereRicorsivo(String s, char c, int index) {
        /*
         * se index ha raggiunto s.length() vuol dire che non ci sono caratteri della
         * stringa s uguali al carattere c; se s.charAt(index) == c --> ho trovato il
         * carattere uguale; altrimenti incremento index per passare al carattere
         * successivo della stringa s
         */
        if (index == s.length())
            return false;
        else if (s.charAt(index) == c)
            return true;
        else
            return trovaCarattereRicorsivo(s, c, index + 1);
    }

    public static int contaCaratteri(String s, char c) {
        return contaCaratteriRicorsivo(s, c, 0);
    }// trovaCarattere

    public static int contaCaratteriRicorsivo(String s, char c, int index) {
        /*
         * se index ha raggiunto s.length() vuol dire che non ho trovato il carattere c
         * nella stringa s; se invece ho trovato il carattere c nella stringa s sommo 1
         * e richiamo il metodo passando come index quello successivo; altrimenti non
         * sommo 1, perché non ho trovato il carattere e richiamo il metodo passando
         * all'index successivo
         */
        if (index == s.length())
            return 0;
        else if (s.charAt(index) == c)
            return 1 + contaCaratteriRicorsivo(s, c, index + 1);
        else
            return contaCaratteriRicorsivo(s, c, index + 1);
    }// contaCarattereRicorsivo

    // #### ESERCIZIO 3 ####
    public static boolean palindroma(String s) {
        return palindromaRicorsivo(s, 0);
    }// palindroma

    public static boolean palindromaRicorsivo(String s, int index) {
        /*
         * se index > s.length()/2 vuol dire che in precedenza tutti i caratteri alla
         * posizione index sono uguali a quelli in posizione s.length()-index-1
         */
        if (index > s.length() / 2)
            return true;
        else if (s.charAt(index) == s.charAt(s.length() - index - 1))
            return palindromaRicorsivo(s, index + 1);
        else
            return false;
    }// palindromaRicorisvo

    // #### ESERCIZIO 4 ####
    public static String conversioneCaratteri(String s) {
        return conversioneCaratteriRicorsivo(s, 0);
    }// conversioneCaratteri

    public static String conversioneCaratteriRicorsivo(String s, int index) {
        char c = '-';
        if (index == s.length())
            return c + "";
        else if (s.charAt(index) == 'a' || s.charAt(index) == 'e' || s.charAt(index) == 'i' || s.charAt(index) == 'o'
                || s.charAt(index) == 'u')
            c = '*';
        else if (s.charAt(index) != ' ')
            c = '$';

        return c + conversioneCaratteriRicorsivo(s, index + 1);
    }// conversioneCaratteri

    // #### ESERCIZIO 5 ####
    public static String stringaInversa(String s) {
        return stringaInversaRicorsivo(s, s.length() - 1);
    }// stringaInversa

    public static String stringaInversaRicorsivo(String s, int index) {
        if (index == 0)
            return s.charAt(index) + "";
        else
            return s.charAt(index) + stringaInversaRicorsivo(s, index - 1);
    }// stringaInversaRicorsivo

    // #### ESERCIZIO 6 ####
    public static String eliminaCarattere(String s, int pos) {
        return eliminaCarattereRicorsivo(s, pos, 0);
    }// eliminaCarattere

    public static String eliminaCarattereRicorsivo(String s, int pos, int index) {
        if (index == s.length())
            return "";
        if (index == pos)
            return eliminaCarattereRicorsivo(s, pos, index + 1);
        else
            return s.charAt(index) + eliminaCarattereRicorsivo(s, pos, index + 1);
    }// eliminaCarattereRicorsivo

    public static void permutazioniStringa(String s) {
        permutazioniStringaRicorsivo(s, 0, "");
    }// permutazioniStringa

    public static void permutazioniStringaRicorsivo(String s, int index, String prefisso) {
        // caso base: non ci sono altri caratteri da permutare, quindi stampa il prefisso
        if (s.length() == 0)
            System.out.println(prefisso);
        else if (index < s.length()) {

            // viene eliminato il carattere alla posizione index
            String s2 = eliminaCarattere(s, index);

            // chiamata ricorsiva sulla stringa senza il carattere. Il carattere tolto è stato messo nel prefisso
            permutazioniStringaRicorsivo(s2, 0, prefisso + s.charAt(index));

            // richiamo ricorsivamente la stringa iniziale eliminando questa volta il
            // carattere a index+1
            permutazioniStringaRicorsivo(s, index + 1, prefisso);
        }
    }// permutazioniStringaRicorsivo

}// class
