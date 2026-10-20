public class PassagemFerroviaria extends abstPassagem {

    public PassagemFerroviaria(String nomePassageiro, double valorTarifa) {
        super(nomePassageiro, valorTarifa);
    }

    @Override
    void calcularTaxa() {
        this.taxaEmbarque = this.valorTarifa * 0.05;
    }

    @Override
    String listarDocumentos() {
        return "Documento de identidade com foto e comprovante de reserva";
    }

    @Override
    String getModal() {
        return "Ferroviário";
    }
}