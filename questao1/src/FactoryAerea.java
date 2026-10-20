public class FactoryAerea extends abstFactory {
    
    private String nomePassageiro;
    private double valorTarifa;

    public FactoryAerea(String nomePassageiro, double valorTarifa) {
        this.nomePassageiro = nomePassageiro;
        this.valorTarifa = valorTarifa;
    }

    @Override
    protected abstPassagem criarPassagem() {
        return new PassagemAerea(nomePassageiro, valorTarifa);
    }
}