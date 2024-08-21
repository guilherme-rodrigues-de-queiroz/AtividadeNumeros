import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner lerNumero = new Scanner(System.in);
        System.out.println("Digite um número:");
        int num = lerNumero.nextInt();

        if(num%2 == 0){
            System.out.println("Seu número par é: " + num);
        } else {
            System.out.println("Seu número impar é: " + num);
        }

        if(num%2 == 0 && num <= 5 && num >= 2){
            System.out.println("A");
        }

        if(num%2 == 0 && num <= 20 && num >= 6){
            System.out.println("B");
        }

        if(num%2 != 0 && num > 20){
            System.out.println("C");
        }
    }
}
