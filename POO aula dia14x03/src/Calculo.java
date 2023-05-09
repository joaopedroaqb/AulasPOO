import java.util.Scanner;

public class Calculo{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite o primeiro valor: ");
        double valor1 = input.nextDouble();
        
        System.out.print("Digite o segundo valor: ");
        double valor2 = input.nextDouble();
        
        double resultado = (valor1 + valor2) ;
        System.out.println("O resultado da soma é: " + resultado);
    }
}

