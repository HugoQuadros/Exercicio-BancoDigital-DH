public class ContaCorrente extends Conta{

    private double limite;

    public double getLimite() {
        return limite;
    }
    public void setLimite(double limite) {
        this.limite = limite;
    }

    //construtor
    public ContaCorrente(double limite) {
        super();
        this.limite = limite;
    }

    //métodos
    private void depositarCC(double valorDepositado){
        setSaldo(getSaldo() + valorDepositado);
        System.out.println("Depósito no valor de " + valorDepositado + " efetuado com sucesso");
    }

    private void sacarCC(double valorSacado){
        if(getSaldo() >= valorSacado){
            setSaldo(getSaldo() - valorSacado);
            System.out.println("Saque no valor de " + valorSacado + " efetuado com sucesso");
        } else if(getSaldo() + getLimite() < valorSacado){
            System.out.println("Saldo e limite insuficientes");
        } else{
            double aux = valorSacado - getSaldo();
            setSaldo(0);
            setLimite(getLimite() - aux);
            System.out.println("Saque no valor de " + valorSacado + " efetuado com sucesso utilizando " + aux + " reais do cheque especial");
        }
    }

    private void depositarCheque(double valor, String bancoEmissor, String dataPagamento){
        setSaldo(getSaldo() + valor);
        System.out.println("Cheque do banco " + bancoEmissor + " datado de " + dataPagamento + " no valor de " + valor + " depositado com sucesso");
    }

}
