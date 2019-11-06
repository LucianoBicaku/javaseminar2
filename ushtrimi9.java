import java.util.Scanner;

public class ushtrimi9{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("shkruaj drivin: ");
        String drive = in.next();
        System.out.print("shkruaj path-in: ");
        String path = in.next();
        System.out.print("shkruaj Skedarin: ");
        String skedar = in.next();
        System.out.println(drive+ ":"+ path +"\\"+skedar+".txt");

        in.close();

    }
}