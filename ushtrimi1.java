public class ushtrimi1 {
    public static void main(String[] args) {
        double g,a=1.0,p=2.0,m1=3.0,m2=4.0;
        g = (4 * Math.pow(Math.PI, 2) * Math.pow(a, 3))/(Math.pow(p, 2)*(m1+m2));
        System.out.println(g);
        //--- pika e 2
        double c, y = 0.0, b=2;
        c= Math.sqrt(Math.pow(a,2) + Math.pow(b, 2) - 2 * a * b * Math.cos(y) );
        System.out.println(c);
    }
}