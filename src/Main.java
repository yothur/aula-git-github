import java.util.Scanner;

public class Main {

    public static int somar(int num1, int num2){
        return num1 + num2;
    }
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int num1 = leitor.nextInt();
        int num2 = leitor.nextInt();

        int result = somar(num1, num2);
        System.out.println(result);
    }
}
