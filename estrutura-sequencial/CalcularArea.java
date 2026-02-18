import java.util.Scanner;
import java.util.Map;

public class CalcularArea {
    public static void main(String[] args) {

        float[] nums = new float[3];
        Scanner scanner = new Scanner(System.in);
        Map<Integer, String> dicionario = Map.of(0, "a", 1, "b", 2, "c");

        System.out.println("");
        
        for(int i = 0; i<=2; i++) {
            System.out.print("Digite o valor " + dicionario.get(i) + " : ");
            
            if(scanner.hasNextFloat()) {
                nums[i] = scanner.nextFloat();
            } else {
                nums[i] = 0;
                scanner.next(); // Limpa a entrada inválida
            }
        }
        scanner.close();

        System.out.println("\nÁrea do triângulo retângulo que tem A por base e C por altura: " + (nums[0]*nums[2])/2);
        System.out.println("Área do círculo de raio C: " + (3.1415*(Math.pow(nums[2],2))));
        System.out.println("Área do trapézio A e B por bases e C por altura: " + ((nums[0]+nums[1])*nums[2])/2);
        System.out.println("Área do quadrado de lado B: " + (Math.pow(nums[1],2)));
        System.out.println("Área do retângulo de lados A e B: " + (nums[0]*nums[1]) + "\n");
    }
}