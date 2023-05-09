import javax.swing.JOptionPane;

public class somas {

	public static void main(String[] args) {
		String n1 = JOptionPane.showInputDialog("Digite um número: ");
		String n2 = JOptionPane.showInputDialog("Digite outro número: ");
		JOptionPane.showInputDialog(n1+n2);
	}

}