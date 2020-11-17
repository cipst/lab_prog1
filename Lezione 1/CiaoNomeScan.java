import java.util.Scanner;

public class CiaoNomeScan{
	public static void main(String[] args){
		Scanner tastiera = new Scanner(System.in);
		System.out.println("Come ti chiami?");
		String nome = tastiera.nextLine();
		System.out.println("Benvenuto " + nome);
	}
}