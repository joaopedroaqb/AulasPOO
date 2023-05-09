import java.util.Locale;
import java.util.Scanner;

public class Codigo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite uma palavra, um número e um número quebrado: ");
		String palavra = sc.next();
		int numero1 = sc.nextInt();
		double numero2 = sc.nextDouble();
		System.out.printf("A plavra foi: %s\n O numero foi: %d\n O número quebrado foi: %f", palavra, numero1, numero2);
		sc.close();
	}

}
