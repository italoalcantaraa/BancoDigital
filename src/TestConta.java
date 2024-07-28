public class TestConta {
    public static void main(String[] args) {
        Conta conta1 = new ContaCorrente();
        Conta conta2 = new ContaPoupanca();
        Conta conta3 = new ContaPoupanca();

        conta1.deposit(20);
        // conta1.deposit(100);
        // conta1.transfer(50, conta2);

        // System.out.println(conta1.balance);
        // System.out.println(conta2.balance);

        // conta2.transfer(40, conta1);

        // System.out.println(conta1.balance);

        conta3.printExtract();
        conta1.printExtract();
    };
}
