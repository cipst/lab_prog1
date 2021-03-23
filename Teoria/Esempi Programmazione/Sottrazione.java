class Sottrazione {
public static void main (String [] args){
/*
SPECIFICA
Dati in ingresso: X intero, Y intero
Dati in uscita: m intero
Condizione di ingresso: X >= Y, Y >= 0
Condizione di uscita: m = X - Y
*/
int X = SavitchIn.readLineInt();
int Y = SavitchIn.readLineInt();
int m = X;
int s = Y; 

System.out.println(X-Y);
while (s > 0) { // invariante:
	m--;
    s--;
}  

System.out.println(m);
}

}