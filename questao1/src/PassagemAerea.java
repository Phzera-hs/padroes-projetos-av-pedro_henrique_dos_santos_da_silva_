public class PassagemAerea extends abstPassagem {

    public PassagemAerea(String nomePassageiro, double valorTarifa) {
        super(nomePassageiro, valorTarifa);
    }

    @Override
    void calcularTaxa() {
        this.taxaEmbarque = this.valorTarifa * 0.08;
    }

    @Override
    String listarDocumentos() {
        return "Documento de identidade com foto e bilhete eletrônico (e-ticket)";
    }

    @Override
    String getModal() {
        return "Aéreo";
    }
}