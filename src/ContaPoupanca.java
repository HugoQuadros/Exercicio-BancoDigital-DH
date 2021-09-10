public class ContaPoupanca extends Conta{

    //taxa de juros em decimal
    private double taxaDeJuros;

    //getter e setter
    public double getTaxaDeJuros() {
        return taxaDeJuros;
    }
    public void setTaxaDeJuros(double taxaDeJuros) {
        this.taxaDeJuros = taxaDeJuros;
    }

    //construtor
    public ContaPoupanca(double taxaDeJuros) {
        super();
        this.taxaDeJuros = taxaDeJuros;
    }

    //métodos
    private void depositarCP(double valorDepositado){
        setSaldo(getSaldo() + valorDepositado);
        System.out.println("Depósito no valor de " + valorDepositado + " efetuado com sucesso");
    }

    private void sacarCP(double valorSacado){
        if(getSaldo() >= valorSacado){
            setSaldo(getSaldo() - valorSacado);
            System.out.println("Saque no valor de " + valorSacado + " efetuado com sucesso");
        } else{
            System.out.println("Saldo insuficiente");
        }

    }

    private double recolherJuros(){
        return getSaldo()*taxaDeJuros;
    }
}
