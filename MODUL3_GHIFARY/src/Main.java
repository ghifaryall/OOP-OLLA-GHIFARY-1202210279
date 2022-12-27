import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) throws Exception {
        boolean repeat = true;
        Scanner scanner = new
Scanner(System.in);
        Calculation calculation = new
Calculation();

    do{
    try{
        System.out.println("1. Square");
        System.out.println("2. Circle");
        System.out.println("3. Trapezoid");
        System.out.println("0. Exit");
        System.out.println("Select Menu:");
        int pilih = scanner.nextInt();

        switch (pilih){
            case 1:
            System.out.println("\n enter the length of the side of the square");
            double sisi=scanner.nextDouble();
            calculation.setSquare(sisi);
            calculation.run();
            System.out.println("\n the calculation result: "+
            calculation.getSquare());
            break;
            case 2:
            System.out.println("\nenter the radius of the cricle: ");
            double radius=scanner.nextDouble();
            calculation.setCircle(radius);
            calculation.run();
            System.out.println("\nthe calculation result: "+
            calculation.getCircle());
            break;
            case 3:
            System.out.println("\nenter the upper side of the trapezoid: ");
            double a = scanner.nextDouble();
            System.out.println("insert the side of the base of the trapezoid:");
            double b = scanner.nextDouble();
            System.out.println("enter the height of the trapezoid");
            double t = scanner.nextDouble();
            calculation.setTrapezoid(a, b, t);
            calculation.run();
            System.out.println("\nthe calculation result: "+
            calculation.getTrapezoid());
            break;
            case 0:
            System.out.println("\nprogram end");
            break;
            default:
            System.out.println("\noption not available");
            continue;
            


        }
    }
}
