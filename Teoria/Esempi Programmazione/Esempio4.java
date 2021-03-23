class Esempio4 {

		/* 
		scambiare i valori di v1 e v2 se v1 > v2
		***/
	public static void main (String[] args){
		System.out.print("Valore di v1: ");
		int v1 = SavitchIn.readInt();   // usare il metodo opportuno di SavitchIn
		System.out.print("Valore di v2: ");
		int v2 = SavitchIn.readInt();  // usare il metodo opportuno di SavitchIn

		// blocco per lo scambio dei valori di v1 e v2
		if(v1 > v2){
			int aus;
			aus = v1;
			v1 = v2;
			v2 = aus;
		}	
		System.out.println(v1 + "   " + v2);
	}

}