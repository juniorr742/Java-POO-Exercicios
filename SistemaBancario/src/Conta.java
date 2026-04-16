public abstract class Conta {
    private int numero;
    private double saldo;


    public Conta(int numero){
        this.numero = numero;
        this.saldo = saldo;
    }

    public void depositar(double valor){
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("Depósito de R$" + valor+" realizado com sucesso!");
        } else {
            System.out.println("Digite um valor válido");
        }
    }

    public abstract void sacar(double valor);

    public abstract void calcularRendimento();

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
