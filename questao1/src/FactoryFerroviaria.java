public class FactoryFerroviaria extends abstFactory {
    
    private String nomePassageiro;
    private double valorTarifa;

    public FactoryFerroviaria(String nomePassageiro, double valorTarifa) {
        this.nomePassageiro = nomePassageiro;
        this.valorTarifa = valorTarifa;
    }

    @Override
    protected abstPassagem criarPassagem() {
        return new PassagemFerroviaria(nomePassageiro, valorTarifa);
    }
}