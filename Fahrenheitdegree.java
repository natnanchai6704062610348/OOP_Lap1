package oop_lap1;
import java.util.Scanner;

public class Fahrenheitdegree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double degree = input.nextDouble();
        System.out.println("Celsius = " + (5.0/9.0)*(degree-32));
    }
    
}
