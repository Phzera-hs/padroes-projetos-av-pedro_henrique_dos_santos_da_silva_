public class PassagemRodoviaria extends abstPassagem {

    public PassagemRodoviaria(String nomePassageiro, double valorTarifa) {
        super(nomePassageiro, valorTarifa);
    }

    @Override
    void calcularTaxa() {
        this.taxaEmbarque = this.valorTarifa * 0.03;
    }

    @Override
    String listarDocumentos() {
        return "Documento de identidade com foto";
    }

    @Override
    String getModal() {
        return "Rodoviário";
    }
}