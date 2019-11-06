import java.util.Scanner;

public class ushtrimi7{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int rreze = in.nextInt();
        System.out.println("Sip e rrethir: " + (Math.PI*Math.pow(rreze, 2)));
        System.out.println("Sip e sferes: "+(4*Math.PI*Math.pow(rreze, 2)));
        System.out.println("Vellimi i sferes: "+ (4*Math.PI*Math.pow(rreze, 3)/3));
        in.close();
    }
}