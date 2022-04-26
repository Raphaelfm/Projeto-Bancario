public class ContaEspecial extends Conta {
    private double limite;
    private double taxa;
    
    public double getLimite() {
        return limite;
    }
    public void setLimite(double limite) {
        this.limite = limite;
    }
    public double getTaxa() {
        return taxa;
    }
    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }

    public ContaEspecial(int numero, String nomeCliente, double valor, double limite, double taxa) {
        super(numero, nomeCliente, valor);
        this.limite = limite;
        this.taxa = taxa;
    }

    @Override
    public String toString() {
        return "ContaEspecial [limite=" + limite + ", taxa=" + taxa + "]";
    }    
}
