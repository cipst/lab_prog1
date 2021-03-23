class Esempio3{
	public static void main(String[] args){
		int v1, v2, max;
		System.out.print("Scrivi il valore di v1: ");
		v1=SavitchIn.readLineInt();
		System.out.print("Scrivi il valore di v2: ");
		v2=SavitchIn.readLineInt();
		max = v1;
		
		if(v2>max)
			max=v2;
		
		System.out.println("Il valore massimo e': " + max);
	}
}