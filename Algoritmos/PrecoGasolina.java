import java.util.Scanner;

public class PrecoGasolina {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        double precoLitro;
        double quantidadeLitros;
        double totalPagar;

        System.out.println("Calculador de preço gasolina");

        System.out.print("Digite o preço do litro da gasolina: ");
        precoLitro = leitor.nextDouble();

        System.out.print("Digite quantos litros foram vendidos: ");
        quantidadeLitros = leitor.nextDouble();

        totalPagar = precoLitro * quantidadeLitros;

        System.out.println("O cliente deverá pagar: " + totalPagar + " reais");
        leitor.close();
    }
}