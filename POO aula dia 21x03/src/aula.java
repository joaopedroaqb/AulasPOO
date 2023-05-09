import java.util.Scanner;

public class aula{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de minutos consumidos: ");
        int minutosConsumidos = scanner.nextInt();

        // Calcula o valor a ser pago
        int valorPlanoBasico = 50;
        int minutosInclusos = 100;
        int valorMinutoExcedente = 2;

        int minutosExcedentes = minutosConsumidos - minutosInclusos;
        int valorTotal;

        if (minutosExcedentes > 0) {
            valorTotal = valorPlanoBasico + (minutosExcedentes * valorMinutoExcedente);
        } else {
            valorTotal = valorPlanoBasico;
        }

        System.out.println("Valor a ser pago: R$" + valorTotal);

        scanner.close();
    }
}
