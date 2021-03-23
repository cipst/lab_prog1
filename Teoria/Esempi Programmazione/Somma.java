class Somma{
    /*
Dati in ingresso: M, N interi
Dati in uscita: i intero
Condizione di ingresso: M, N ≥ 0
Condizione di uscita: i = M + N
    */
public static void main (String[] args){
	int M = SavitchIn.readLineInt();
	int N = SavitchIn.readLineInt();
	int i = M; // per non distruggere gli input
	int j = N;  // inizialmente i + j == M + N
	while (j > 0)   { // invariante: i + j == M + N
		 /*** 
		 un invariante (di un ciclo) è una proprietà che è vera dopo un numero arbitrario 
		 n >= 0 di iterazioni del ciclo
	    ***/
		i++;
		j--;
	}  // all'uscita, j == 0, quindi M + N == i + j = i + 0 = i

	System.out.println("La somma di M ed N è: " + i);
}
}
