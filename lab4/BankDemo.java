class Bank {
    private double amount;

    public Bank(double initialAmount) {
        this.amount = initialAmount;
    }

    public void withdraw(double withdrawalAmount) {
        String message = (withdrawalAmount <= amount) ? "Withdraw successful" : "Insufficient balance";
        System.out.println(message);

        amount = (withdrawalAmount <= amount) ? (amount - withdrawalAmount) : amount;
    }

    public void deposit(double depositAmount) {
        amount += depositAmount;
        System.out.println("After deposit, available balance: " + amount);
    }

    public double getBalance() {
        return amount;
    }
}

public class BankDemo {
    public static void main(String[] args) {
        Bank myAccount = new Bank(10000);
        myAccount.withdraw(5000);
        myAccount.deposit(5000);
    }
}
