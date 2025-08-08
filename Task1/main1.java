public class main1 {
    public static void main(String[] args) {
        SavingsAccount acc = new SavingsAccount("Mansi Kumari Verma", 5000);

        acc.displayDetails();
        acc.deposit(2000);
        acc.withdraw(1500);

        System.out.println("\nUpdated Account Details:");
        acc.displayDetails();
    }
}
