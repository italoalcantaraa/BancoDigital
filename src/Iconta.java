public interface Iconta {
    void toWithdraw(double value);

    void deposit(double value);

    void transfer(double value, Conta Account);

    void printExtract();
}
