import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Aluno a1 = new Aluno();
        Scanner sc = new Scanner(System.in);
        a1.calcMedia();
        System.out.println("Digite a sua primeira nota: ");
        a1.setNota1(sc.nextDouble());
        System.out.println("Digite a sua segunda nota: ");
        a1.setNota2(sc.nextDouble());
        System.out.println("Digite a sua terceira nota: ");
        a1.setNota3(sc.nextDouble());

        a1.getMedia();
        System.out.println("Sua média é: " );
        a1.calcMedia();
        System.out.println(a1.getMedia());

        if (a1.getMedia () >=7) {
            System.out.println("Você foi aprovado.");
        }else if (a1.getMedia() < 4) {
            System.out.println("Você foi reprovado");
        }else {
            System.out.println("Você está na final.");
        }



    }
}