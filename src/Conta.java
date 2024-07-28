public abstract class Conta implements Iconta {
    private static int STANDARD_AGENCY = 1;
    private static long GENERATE_ACCOUNT_NUMBER = 1;

    protected int agency;
    protected long accountNumber;
    protected double balance;

    public Conta() {
        agency = STANDARD_AGENCY;
        accountNumber = GENERATE_ACCOUNT_NUMBER++;
        balance = 0D;
    }

    @Override
    public void toWithdraw(double value) {
        balance-=value;
    }

    @Override
    public void deposit(double value) {
        balance+=value;
    }

    @Override
    public void transfer(double value, Conta Account) {
        this.toWithdraw(value); // Saque
        Account.deposit(value); // Deposita em uma conta  
    }

    @Override
    public void printExtract() {
    }

    public void printCommunInformation() {
        System.out.println("Agência: " + this.agency);
        System.out.println("Número da conta: " + this.accountNumber);
        System.out.printf("Saldo: %.2f", this.balance);
        System.out.println("\n------------");
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public int getAgency() {
        return agency;
    }

}
