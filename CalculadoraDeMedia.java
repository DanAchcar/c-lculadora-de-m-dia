import java.util.Scanner;

public class CalculadoraDeMedia {
    public static void main(String[] args) {
        // Declaração das variáveis
        try (Scanner scanner = new Scanner(System.in)) {
            double nota1, nota2, nota3, nota4, media;
            // Entrada de dados
            System.out.print("Digite a primeira nota: ");
            nota1 = scanner.nextDouble();
            System.out.print("Digite a segunda nota: ");
            nota2 = scanner.nextDouble();
            System.out.print("Digite a terceira nota: ");
            nota3 = scanner.nextDouble();
            System.out.print("Digite a quarta nota: ");
            nota4 = scanner.nextDouble();
            // Cálculo da média
            media = (nota1 + nota2 + nota3 + nota4) / 4;
            // Saída de dados
            System.out.println("A média das notas é: " + media);
        }
    }
}