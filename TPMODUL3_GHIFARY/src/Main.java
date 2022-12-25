import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        CoffeeMachine machine = new CoffeeMachine();
        int customerID, orderQty;
        try {

            System.out.println("Masukan id kostumer: ");
            customerID = input.nextInt();

            System.out.println("Mau berapa kopi: ");
            orderQty = input.nextInt();

            Thread t1 = new Thread(machine);
            Waiter waiter = new Waiter(customerID, orderQty);
            Thread t2 = new Thread(waiter);

            t1.start();
            t2.start();
            t1.join();
            t2.join();

        } catch (Exception e) {
            System.out.println("Harus berupa angka");
        }

    }

}