public class Esempio1{
	public static void main(String[] args){
		int x, y, tmp;
		System.out.print("Scrivi il valore di x: ");
		x=SavitchIn.readLineInt();
		System.out.print("Scrivi il valore di y: ");
		y=SavitchIn.readLineInt();
		System.out.println("Prima: x="+x+"; y="+y);
		tmp = x;
		x = y;
		y = tmp;
		System.out.println("Dopo: x="+x+"; y="+y);
	}
}