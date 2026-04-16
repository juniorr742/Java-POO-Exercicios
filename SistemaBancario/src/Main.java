public class Main {
    public static void main(String[] args) {
        Conta conta1 = new ContaCorrente(1);

        conta1.depositar(100);
        conta1.sacar(10);
        conta1.calcularRendimento();

        Conta conta2 = new ContaPoupança(2);

        conta2.depositar(100);
        conta2.calcularRendimento();
        conta2.sacar(10);
    }
}