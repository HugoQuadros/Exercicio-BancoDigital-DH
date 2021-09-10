public class Cliente {

    private String numeroCliente;
    private String sobrenome;
    private String rg;
    private String cpf;

    //getter e setter
    public String getNumeroCliente() {
        return numeroCliente;
    }
    public void setNumeroCliente(String numeroCliente) {
        this.numeroCliente = numeroCliente;
    }
    public String getSobrenome() {
        return sobrenome;
    }
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    public String getRg() {
        return rg;
    }
    public void setRg(String rg) {
        this.rg = rg;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    //construtor
    public Cliente(String numeroCliente, String sobrenome, String rg, String cpf) {
        this.numeroCliente = numeroCliente;
        this.sobrenome = sobrenome;
        this.rg = rg;
        this.cpf = cpf;
    }
}
