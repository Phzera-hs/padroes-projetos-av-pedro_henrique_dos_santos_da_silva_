public class Cliente {
    public static void main(String[] args) {
    
        abstFactory emissaoAerea = new FactoryAerea("Zabela", 1500.00);
        emissaoAerea.processarEmissao();

        abstFactory emissaoRodoviaria = new FactoryRodoviaria("Pedrin", 200.00);
        emissaoRodoviaria.processarEmissao();

        abstFactory emissaoFerroviaria = new FactoryFerroviaria("Zé", 450.00);
        emissaoFerroviaria.processarEmissao();
    }
}