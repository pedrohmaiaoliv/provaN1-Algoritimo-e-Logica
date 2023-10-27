import java.util.Scanner;

class questaocinco{

    public static void main(String[]args) {

        Scanner sc = new Scanner(System.in);
        final double pi = 3.14;
        double area, raio;
        System.out.print("Digite o valor do raio: ");
        raio = sc.nextDouble();
        area = pi*(Math.pow(raio, 2));
        System.out.println("A área do círculo é: "+ area);

    }
}