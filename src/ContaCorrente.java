public class ContaCorrente extends Conta {
    @Override
    public void printExtract() {
        System.out.println("------------");
        System.out.println("* Conta corrente *");
        printCommunInformation();
    }
}
