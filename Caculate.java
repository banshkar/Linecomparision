import java.util.Scanner;

public class Caculate{
    public static void main(String[] args) {
        double x1,x2,y2,y1,LineOflength;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x1 coordinate:");
         x1  = sc.nextInt();
        System.out.println("Enter x2 coordinate:");
         x2  = sc.nextInt();
        System.out.println("Enter y1 coordinate:");
         y1  = sc.nextInt();
        System.out.println("Enter y2 coordinate:");
         y2  = sc.nextInt();
         LineOflength =Math.sqrt(Math.pow((x2-x1),2))+Math.sqrt(Math.pow((y2-y1),2));
        System.out.println("..........");
        System.out.println("length of Line: " + LineOflength);
    }
}
