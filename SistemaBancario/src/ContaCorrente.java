public class ContaCorrente extends Conta{

    public ContaCorrente(int numero) {
        super(numero);
    }

    @Override
    public void sacar(double valor) {
        double taxaFixa = 2;
        if (valor > getSaldo()){
            System.out.println("ERRO: saldo insuficiente.");
        } else {
            double saldoAtual = getSaldo() - valor - taxaFixa;
            setSaldo(saldoAtual);
            System.out.println("Saque de "+valor+" realizado com sucesso! Saldo restante: " + getSaldo());
        }

    }

    @Override
    public void calcularRendimento() {
        System.out.println("Essa conta não tem rendimentos");
    }
}
