import java.util.Scanner;

public class questaonove {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        System.out.print ("digite um inteiro:");
        int num = sc.nextInt();
        System.out.printf (" O antecessordo numero %d é %d",num, num-1);
        System.out.printf (" O Sucessor do numero %d é %d", num, num+1);
        
    }
}