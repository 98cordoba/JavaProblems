/* Area of circle */
import java.util.Scanner;
public class areaOfCircle {
    public static void main(String[] args) {
        System.out.println("Enter radius of circle: ");
        Scanner sn = new Scanner(System.in);
        Double radius = sn.nextDouble();
        Double area = Math.PI*radius*radius;
        System.out.println("Area = "+area);
    }
}
