public class EserciziMatrici {

    /*************
     * ESERCIZIO 1
     **************/

    public static int[][] initAlt(int[] matp, int[] matd, int numr) {
        // inizializzo matrice
        int[][] result = new int[numr][];
        for (int i = 0; i < numr; i++) {

            // se la posizione è pari inserisco i valori di matp
            // altrimenti inserisco i valori di matd
            if (i % 2 == 0) {

                // se matp è null --> anche la matrice in posizione i sarà null
                // else creo l'array di lunghezza matp.length alla posizione i della matrice
                // e inserisco i valori
                if (matp == null)
                    result[i] = null;
                else {
                    result[i] = clonaArray(matp);
                }
            } else {

                // se matd è null --> anche la matrice in posizione i sarà null
                // else creo l'array di lunghezza matd.length alla posizione i della matrice
                // e inserisco i valori
                if (matd == null)
                    result[i] = null;
                else {
                    result[i] = clonaArray(matd);
                }
            }
        } // for

        return result;
    }// initAlt

    public static int[] clonaArray(int[] a) {
        int[] b = new int[a.length];
        for (int i = 0; i < b.length; i++)
            b[i] = a[i];
        return b;
    }// clonaArray

    public static int contaElementi(int[][] mat) {
        // se mat è null il numero di elementi è -1 -> perchè non ha elementi
        if (mat == null)
            return -1;
        else {
            // else sommo tutte le lunghezze di ogni riga
            int sum = 0;
            for (int i = 0; i < mat.length; i++)
                if (mat[i] != null)
                    sum += mat[i].length;
            return sum;
        }
    }// contaElementi

    public static int[] linearizzaRighe(int[][] mat) {
        // se mat è null return null
        if (mat == null)
            return null;
        else {
            // else conto gli elementi di mat
            int num = contaElementi(mat);
            // inizializzo un nuovo vettore a
            int[] a = new int[num];
            // inizializzo una varibile k che mi servirà a scandire le posizioni del vettore
            int k = 0;
            for (int i = 0; i < mat.length; i++)
                if (mat[i] != null)
                    for (int j = 0; j < mat[i].length; j++)
                        a[k++] = mat[i][j];
            return a;
        }
    }// linearizzaRighe

    public static void toString(int[][] m) {
        String s = "";
        // se m è null -> verrà stampato "null"
        if (m == null)
            s = "null";
        else {
            // else se la riga m[i] è null -> se è così scrivo "null"
            // altrimenti la riga m[i] != null -> scrivo il valore di ogni m[i][j]
            for (int i = 0; i < m.length; i++) {
                if (m[i] == null)
                    s += "null";
                else {
                    for (int j = 0; j < m[i].length; j++) {
                        s += m[i][j] + " ";
                    }
                }
                s += "\n";
            }
        }
        System.out.print(s);
    }// toString

    /*************
     * ESERCIZIO 2
     **************/

    public static int maxRowLen(int[][] mat) {

        // se mat è null return 0
        if (mat == null)
            return 0;
        else {

            // suppongo che il max sia la prima riga
            // -> se è null = 0 -> altrimenti = mat[0].length
            int max = ((mat[0] == null) ? 0 : mat[0].length);

            for (int i = 1; i < mat.length; i++) {

                // se la riga mat[i] è diversa da null e la lunghezza della riga i
                // è maggiore di max, diventa il massimo
                if (mat[i] != null && mat[i].length > max)
                    max = mat[i].length;
            }
            return max;
        }
    }// maxRowLen

    public static int[] sommaRighe(int[][] mat) {
        if (mat == null)
            return null;
        else {
            int[] a = new int[mat.length];
            for (int i = 0; i < mat.length; i++) {
                if (mat[i] == null)
                    a[i] = 0;
                else {
                    for (int j = 0; j < mat[i].length; j++)
                        a[i] += mat[i][j];
                }
            }
            return a;
        }
    }// sommaRighe

    /*************
     * ESERCIZIO 3
     **************/

    public static int[][] azzeraColonnaMax(int[][] mat) {

        // azzero la colonna solo se mat è diverso da null
        if (mat != null) {

            // inizializzo il vettore con la somma delle righe di mat
            int a[] = sommaRighe(mat);

            // suppongo che la prima cella sia il max
            // di conseguenza suppongo che la posizione del max sia la 0
            int max = a[0];
            int pos = 0;

            // ciclo per trovare il massimo e salvare la posizione in pos
            for (int i = 1; i < a.length; i++) {
                if (a[i] > max) {
                    max = a[i];
                    pos = i;
                }
            }

            // esco dal for con il valore di pos -> blocco la riga pos della matrice mat
            // e ciclo su j, in modo tale da avere la colonna pos (cioè quella del max)
            // tutta a 0
            for (int j = 0; j < mat[pos].length; j++)
                mat[pos][j] = 0;

            return mat;
        } else
            return null;
    }// azzeraColonnaMax

    /*************
     * ESERCIZIO 4
     **************/

    public static boolean domMat(int[][] mat) {

        // se matrice è null -> return true perchè non sono presenti dei controesempi
        if (mat == null)
            return true;
        else {

            // inizializzo dominante a true e dominante Riga a false
            boolean dominante = true;
            boolean domRiga = false;

            // controllo che nella riga i ci sia almeno un dominante in posizione j
            // dopodichè controllo che ogni riga abbia almeno un dominante
            for (int i = 0; i < mat.length; i++) {
                for (int j = 0; j < mat[i].length; j++) {
                    domRiga = domRiga(mat[i], j) || domRiga;
                }
                dominante = domRiga && dominante;
            }

            // restituisco true se su ogni riga è presente almeno un dominante
            return dominante;
        }
    }// domMat

    public static boolean domRiga(int[] a, int j) {
        // ipotizzo che sia presente un dominante nella riga corrente
        boolean dom = true;

        // controllo che ogni elemento di a in posizione i, sia divisibile per
        // l'elemento di a in posizione j
        for (int i = 0; i < a.length && dom; i++)
            dom = (a[i] % a[j] == 0) && dom;
        return dom;
    }// domRiga

    /*************
     * ESERCIZIO 5
     **************/

    // metodo wrapper che incrementa di 1 tutti gli elementi della matrice
    // restituendo una nuova matrice omat[][]
    public static int[][] incrementaMat(int[][] imat) {
        int[][] omat = new int[imat.length][];
        incrementaMatRic(imat, omat, 0);
        return omat;
    }// incrementaMat WRAP

    // metodo COVARIANTE che aggiunge 1 ad ogni elemento di una riga
    // quando k < 0 ==> inizializzo la riga corrente della nuova matrice
    public static int[] incrementaRigaRic(int[] in, int[] out, int k) {
        if (k < 0)
            return out = new int[in.length];
        else {
            out = incrementaRigaRic(in, out, k - 1);
            out[k] = in[k] + 1;
            return out;
        } // else
    }// incrementaRigaRic

    // metodo COTROVARIANTE che scandisce le righe e richiama incrementaRigaRic per
    // aumentarne il loro contenuto
    public static void incrementaMatRic(int[][] imat, int[][] omat, int i) {
        if (i < imat.length) {
            if (imat[i] == null)
                omat[i] = null;
            else {
                omat[i] = incrementaRigaRic(imat[i], omat[i], imat[i].length - 1);
            } // else
            incrementaMatRic(imat, omat, i + 1);
        } // if
    }// incrementaMatRic

    /*************
     * ESERCIZIO 6
     **************/

    // metodo wrap che conta le occorrenze di un numero k nell'array a
    public static int conteggio(int[] a, int k) {
        // se a è null --> return -1 (non ci sono occorrenze)
        if (a == null)
            return -1;
        else
            return conteggioDicotomico(a, k, 0, a.length - 1);
    }// conteggio WRAP

    public static int conteggioDicotomico(int[] a, int k, int i, int j) {
        // se ho una sola cella controllo se è uguale a k --> true = 1 / false = 0
        if (i == j) {
            return ((a[i] == k) ? 1 : 0);
        } else {
            // calcolo l'indice medio
            int m = (i + j) / 2;

            // richiamo conteggioDicotomico passando il limite i e m
            // + conteggioDicotomico passando il limite m+1 e j
            return (conteggioDicotomico(a, k, i, m) + conteggioDicotomico(a, k, m + 1, j));
        }
    }// conteggioDicotomico

    /************
     *** MAIN ***
     ***********/

    public static void main(String[] args) {
        // Test Esercizio 1
        int[] a1 = { 3, 5, 7 }, a2 = { 2, 10, 8, 9 }, a3 = { 8 };
        int[][] m1 = initAlt(a1, a2, 6), m2 = initAlt(a3, null, 5), m3 = initAlt(null, a2, 4);
        int[] b1 = linearizzaRighe(m1);
        int[] b2 = linearizzaRighe(m2);
        int[] b3 = linearizzaRighe(m3);
        for (int i = 0; i < b1.length; i++) {
            System.out.print(b1[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < b2.length; i++) {
            System.out.print(b2[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < b3.length; i++) {
            System.out.print(b3[i] + " ");
        }
        System.out.println("\n#######################################");

        // Test Esercizio 2
        int[][] m4 = { { 2, 5, 6 }, { 3, 7, 8, 9, 1 }, null, { 0, 3, 9, 1 } };
        int[] c4 = sommaRighe(m4);
        for (int i = 0; i < c4.length; i++) {
            System.out.print(c4[i] + " ");
        }
        System.out.println("\n" + maxRowLen(m4));
        System.out.println();
        int[] c1 = sommaRighe(m1);
        for (int i = 0; i < c1.length; i++) {
            System.out.print(c1[i] + " ");
        }
        System.out.println();
        int[] c2 = sommaRighe(m2);
        for (int i = 0; i < c2.length; i++) {
            System.out.print(c2[i] + " ");
        }
        System.out.println();
        int[] c3 = sommaRighe(m3);
        for (int i = 0; i < c3.length; i++) {
            System.out.print(c3[i] + " ");
        }
        System.out.println("\n#######################################");

        // Test Esercizio 3
        m1 = azzeraColonnaMax(m1);
        toString(m1);
        System.out.println("\n#######################################");

        // Test Esercizio 4
        int[][] m5 = { { 1, 5, 10, 7 }, { 3, 12, 21, 30 }, { 5, 10, 20, 30 } }; // true
        int[][] m6 = { { 10, 4, 4, 7 }, { 7, 14, 21, 7 }, { 2, 8, 12, 22 } }; // false
        System.out.println(domMat(m5));
        System.out.println(domMat(m6));
        System.out.println("\n#######################################");

        // Test Esercizio 5
        toString(incrementaMat(m1));
        System.out.println("--------");
        toString(incrementaMat(m2));
        System.out.println("--------");
        toString(incrementaMat(m3));
        System.out.println("--------");
        toString(incrementaMat(m4));
        System.out.println("\n#######################################");

        // Test Esercizio 6
        int[] d1 = { 1, 2, 3, 4, 5, 5 };
        System.out.println(conteggio(d1, 5));
    }// main
}// class
