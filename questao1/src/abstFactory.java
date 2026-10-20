public abstract class abstFactory {
    
    protected abstract abstPassagem criarPassagem();

    public final void processarEmissao() {
        abstPassagem passagem = criarPassagem();

        passagem.calcularTaxa(); 
        String resumo = passagem.gerarResumo();
        
        System.out.println("--- Resumo da Emissão ---");
        System.out.println(resumo);
        System.out.println("-------------------------\n");
    }
}