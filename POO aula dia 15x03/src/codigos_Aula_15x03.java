import javax.swing.JOptionPane;

public class codigos_Aula_15x03 {
	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog("Digite o seu nome:");
		JOptionPane.showMessageDialog(null, "Olá, " + nome + "! Bem-vindo ao meu programa em Java!");
	}
}