public class FactoryRodoviaria extends abstFactory {
    
    private String nomePassageiro;
    private double valorTarifa;

    public FactoryRodoviaria(String nomePassageiro, double valorTarifa) {
        this.nomePassageiro = nomePassageiro;
        this.valorTarifa = valorTarifa;
    }

    @Override
    protected abstPassagem criarPassagem() {
        return new PassagemRodoviaria(nomePassageiro, valorTarifa);
    }
}