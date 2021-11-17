package quest;

public class Singleton {

    private static Singleton instance;

    //if no Singleton instance exists, a new instance will be created
    //in any cases the method will return the same instance
    public static Singleton getInstance() {
        if(instance == null){
            instance = new Singleton();
        }

        return instance;
    }

    //Overloading the standard constructor to avoid new Singelton instance
    private Singleton(){}

    private Bank bank;

    public void openAccount(int value) {
        bank = new Bank(value);
    }

    public void deposit(int value) {
        bank.setTotal(bank.getTotal() + value);
    }

    public void withdraw(int value) {
        bank.setTotal(bank.getTotal() - value);
    }

    public Bank getBank() {
        return bank;
    }
}