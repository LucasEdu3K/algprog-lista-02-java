import java.util.Scanner;

public class MediaJava {
    public static void main(String[] args) {

        System.out.println("Mini calculador de Notas");

        Scanner notas = new Scanner(System.in);

        int nota1, nota2, nota3, nota4;
        double media;

        System.out.println("escreva aqui a nota 01: ");
        nota1 = notas.nextInt();

        System.out.println("escreva aqui a nota 02: ");
        nota2 = notas.nextInt();

        System.out.println("escreva aqui a nota 03: ");
        nota3 = notas.nextInt();

        System.out.println("escreva aqui a nota 04: ");
        nota4 = notas.nextInt();

        media = (nota1 + nota2 + nota3 + nota4) / 4.0;

        System.out.print("Sua nota média é: " + media);

        notas.close();
    }
}