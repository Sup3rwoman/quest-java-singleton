package quest;

public class Transactions {

    public static void transactions() {

        Singleton singleton = Singleton.getInstance();

        singleton.withdraw(300);
        singleton.deposit(12);
        singleton.deposit(54);
        singleton.withdraw(47);
    }

    public static void balance() {

        //calls singleton and get total
        int total = 0;
        Singleton singleton = Singleton.getInstance();
        total = singleton.getBank().getTotal();

        System.out.printf("Your balance is:%d%n", total);
    }
}
