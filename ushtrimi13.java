import java.util.Scanner;
public class ushtrimi13{
    public static void main(String[] aStrings) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        for(int i = num-2; i >= 0 ; i--){
            System.out.print(" ");
        }
        System.out.println("/\\");
        for(int i = 1; i < num; i++){
            for(int j = num-2-i; j >= 0 ; j--){
                System.out.print(" ");
            }
            System.out.print("/");
            for(int j = 0; j<i; j++){
                System.out.print("  ");
            }
            System.out.println("\\");
        }
        for(int i = 0 ; i< num*2; i++){
            System.out.print("-");
        }
        System.out.println(" ");
        for(int i =0 ; i< num-3; i++){
            for(int j = num-2; j >= 0 ; j--){
                System.out.print(" ");
            }
            System.out.println("| |");
        }
        in.close();
    }
}