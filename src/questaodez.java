import java.util.Scanner;

public class questaodez {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        System.out.print ("digite o peso: ");
        double peso = sc.nextDouble();
        System.out.print ("digite a altura: ");
        double altura = sc.nextDouble();

        double imc = peso/(altura*altura);
        System.out.println("imc = " + imc);
        
    }
}