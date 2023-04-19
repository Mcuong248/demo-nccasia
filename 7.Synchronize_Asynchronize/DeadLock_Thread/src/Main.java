public class Main {
    public static void main(String[] args) {
        User user = new User();
        BankAccount bankAccount = new BankAccount();

        user.setBankAccount(bankAccount);
        bankAccount.setUser(user);

        Thread t = new Thread(user);
        t.setName("T1");

        Thread t1 = new Thread(bankAccount);
        t1.setName("T2");

        t.start();
        t1.start();
    }
}
