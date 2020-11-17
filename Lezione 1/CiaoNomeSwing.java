import javax.swing.JOptionPane;

public class CiaoNomeSwing{
	public static void main(String[] args){
		String nome = JOptionPane.showInputDialog("Come ti chiami?");
		JOptionPane.showMessageDialog(null, "Ciao, " + nome);
		System.exit(0);
	}
}