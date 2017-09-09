package HelloJava;

/**
 * Created by smhoque on 9/8/17.
 */
public class UsingJava {
    static int a = 10;
    static int b = 20;
    static int total = a + b;

    protected static void sum(){
         int m = 5;
         int n = 15;
         int totalmethod = m + n;
        System.out.println("Total m and n is: "  + totalmethod);
    }
    static{System.out.println("Hello Static Block");}

    public static void main(String[] args)  {

        int x = 30;
        int y = 40;
        int totalnonStatic = x + y;

        System.out.println("Hello Java Developer Of the world");
        System.out.println("Total a and b is: "  + total);
        System.out.println("Total x and y is: "  + totalnonStatic);
        sum();

    }
}
