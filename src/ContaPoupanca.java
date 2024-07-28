public class ContaPoupanca extends Conta {
    @Override
    public void printExtract() {
        System.out.println("------------");
        System.out.println("* Conta Poupança *");
        printCommunInformation(); 
    }
}
