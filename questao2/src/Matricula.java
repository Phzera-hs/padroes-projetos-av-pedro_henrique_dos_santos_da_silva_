public class Matricula {
    private abstFactoryPais factory;

    public Matricula(abstFactoryPais factory) {
        this.factory = factory;
    }

    public void confirmarMatricula() {
        abstDocFiscal docFiscal = factory.criarDocFiscal();
        abstPagamento pagamento = factory.criarPagamento();
        abstComprovante comprovante = factory.criarComprovante();

        docFiscal.calcularImposto();
        pagamento.processarPagamento(docFiscal.valorCurso, docFiscal.impostoCalculado);

        System.out.println("--- Relatório de Matrícula ---");
        System.out.println(docFiscal.emitir());
        System.out.println(pagamento.gerarRecibo());
        System.out.println(comprovante.gerarComprovante());
        System.out.println("------------------------------\n");
    }
}