import java.util.Scanner;

public class ushtrimi6{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        System.out.println("Shuma : "+ (num1 + num2));
        System.out.println("Diferenca : "+ (num1 - num2));
        System.out.println("Prodhimi : "+ (num1 * num2));
        System.out.println("Vlera Absolute : "+ (Math.abs(num1 - num2)));
        System.out.println("Max : "+ Math.max(num1, num2));
        System.out.println("Min : "+ Math.min(num1, num2));
        in.close();
    }
}