public abstract class abstPagamento {
    public double valorFinal;
    public boolean statusConfirmado;

    abstract boolean processarPagamento(double valorBase, double imposto);
    abstract String gerarRecibo();
}