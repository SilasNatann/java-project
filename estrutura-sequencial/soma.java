import java.util.Scanner;

public class soma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o primeiro numero: ");
        int num = scanner.nextInt();
        System.out.println("Digite o segundo numero: ");
        int num2 = scanner.nextInt();

        scanner.close();

        if ((num!=0) || (num2!=0)) {
            System.out.println("A soma dos numeros é: " + (num + num2));
        } else {
            System.out.println("Nada foi digitado");
        }
    }
    
}
