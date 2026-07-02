import java.util.*;

public class DistanceFormula {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double x1,x2,x3,y1,y2,y3;
        x1 = input.nextDouble();
        y1 = input.nextDouble();
        x2 = input.nextDouble();
        y2 = input.nextDouble();
        x3 = input.nextDouble();
        y3 = input.nextDouble();

        double a = Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
        double b = Math.sqrt(Math.pow(x3-x2,2)+Math.pow(y3-y2,2));
        double c = Math.sqrt(Math.pow(x3-x1,2)+Math.pow(y3-y1,2));
        
        double s = (a+b+c) /2;
        double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));

        System.out.printf("%.1f",area);
    }
}
