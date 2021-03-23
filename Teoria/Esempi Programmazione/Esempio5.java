class Esempio5{
	public static void main(String[] args){
		int a, b, c;
		System.out.print("Scrivi il valore di a: ");
		a=SavitchIn.readLineInt();
		System.out.print("Scrivi il valore di b: ");
		b=SavitchIn.readLineInt();
		System.out.print("Scrivi il valore di c: ");
		c=SavitchIn.readLineInt();
		
		int max = a;
		if(b>max){
			max = b;
		}
		if(c>max){
			max = c;
		}
		System.out.println("Il valore massimo e': " + max);
	}
}