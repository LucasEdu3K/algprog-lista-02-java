import java.util.Scanner;

public class Eurotrip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double alemanha; double portugal; double italia; double totalPassagens; double valorFinal;
        int qntPessoas;
        

        System.out.println("Insira o valor da passagem para Alemanha: ");
          alemanha = sc.nextDouble();
        System.out.println("Insira o valor da passagem para Portugal: ");
          portugal = sc.nextDouble();
        System.out.println("Insira o valor da passagem para a Itália");
          italia = sc.nextDouble();
        System.out.println("Insira a quantidade de pessoas que irão na viagem: ");
          qntPessoas = sc.nextInt();
        
        totalPassagens = alemanha + portugal + italia; 
        valorFinal = totalPassagens * qntPessoas;

        System.out.printf("O valor total da viagem é de: R$" + valorFinal);

        sc.close();
    }
}