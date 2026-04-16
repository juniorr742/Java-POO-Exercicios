public class ContaPoupança extends Conta{
    public ContaPoupança(int numero){
        super(numero);
    }

    @Override
    public void sacar(double valor) {
        if (valor > getSaldo()){
            System.out.println("ERRO: Saldo insuficiente!");
        }else {
            double saldoAtual = getSaldo() - valor;
            setSaldo(saldoAtual);
            System.out.println("Saque de "+valor+" realizado com sucesso! Saldo restante: " + getSaldo());
        }
    }

    @Override
    public void calcularRendimento() {
        double rendimento = getSaldo() * 0.05;
        double saldoAtualizado = getSaldo() + rendimento;
        setSaldo(saldoAtualizado);
        System.out.println("Valor de rendimento: " + rendimento);
        System.out.println("Saldo após rendimento: " + saldoAtualizado);
    }

}
