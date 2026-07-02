import java.util.Scanner;

public class Financialapplication {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double money = 0;
        int i;
        System.out.print("Enter the monthly saving amount: ");
        double x = input.nextDouble();
        
        for(i=0;i<6;i++){
            money += x;
            money *=(1+0.00417);
            
        }
        
        System.out.printf("After the sixth month, the account value is $%.2f",money);
        
    }
}
