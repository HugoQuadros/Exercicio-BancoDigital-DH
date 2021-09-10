public abstract class Conta {

    private double saldo;

    //getter e setter
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    //métodos
    private void depositar(double valorDepositado){
        setSaldo(getSaldo() + valorDepositado);
        System.out.println("Depósito no valor de " + valorDepositado + " efetuado com sucesso");
    }

    private void sacar(double valorSacado){
        setSaldo(getSaldo() - valorSacado);
        System.out.println("Saque no valor de " + valorSacado + " efetuado com sucesso");
    }

    private double consultarSaldo(){
        System.out.println("Seu saldo é de " + getSaldo());
        return getSaldo();
    }
}
