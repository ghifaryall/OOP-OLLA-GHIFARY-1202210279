public class CoffeeMachine implements Runnable {

    private boolean waitingForPickup = false;
    private static final Object lock = new Object();
    private static int coffeeNumber = 1;

    @Override
    public void run() {
        while (true) {
            makeCoffee();
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void setWaitingForPickup(boolean waitingForPickup) {
        this.waitingForPickup = waitingForPickup;
    }

    public static int getCoffeeNumber() {
        return coffeeNumber;
    }

    public void makeCoffee() {
        synchronized(CoffeeMachine.lock) {
            if (this.waitingForPickup) {
                try {
                    System.out.println("Restaurant: Waiting for the Waiter to deliver the coffee");
                    CoffeeMachine.lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            waitingForPickup = true;
            System.out.println("Restaurant:  Making Food Number " + coffeeNumber++);
            CoffeeMachine.lock.notifyAll();
            System.out.println("Restaurant: Telling the waiter to get the coffee\n");
        }
    }

    public static Object getLock() {
        return lock;
    }
}