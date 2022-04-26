public class Conta {
    private int numero;
    private String nomeCliente;
    private double valor;

    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public String getNomeCliente() {
        return nomeCliente;
    }
    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }    

    public Conta(int numero, String nomeCliente, double valor) {
        this.numero = numero;
        this.nomeCliente = nomeCliente;
        this.valor = valor;
    }
    
    @Override
    public String toString() {
        return "Conta [nomeCliente=" + nomeCliente + ", numero=" + numero + ", valor=" + valor + "]";
    }    
    
}
