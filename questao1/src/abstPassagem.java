public abstract class abstPassagem {
    protected String nomePassageiro;
    protected double valorTarifa;
    public double taxaEmbarque;

    public abstPassagem(String nomePassageiro, double valorTarifa) {
        this.nomePassageiro = nomePassageiro;
        this.valorTarifa = valorTarifa;
    }

    abstract void calcularTaxa();

    abstract String listarDocumentos();

    abstract String getModal();

    public String gerarResumo() {
        return "Modal: " + getModal() + 
               "\nPassageiro: " + this.nomePassageiro +
               "\nTaxa de Embarque: R$ " + String.format("%.2f", this.taxaEmbarque) +
               "\nDocumentos Exigidos: " + listarDocumentos();
    }
}