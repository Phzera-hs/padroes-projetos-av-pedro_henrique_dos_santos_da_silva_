public class FactoryChile extends abstFactoryPais {
    private double valorCurso;
    private String nomeAluno;
    private String rut;

    public FactoryChile(double valorCurso, String nomeAluno, String rut) {
        this.valorCurso = valorCurso;
        this.nomeAluno = nomeAluno;
        this.rut = rut;
    }

    @Override
    protected abstDocFiscal criarDocFiscal() {
        return new BoletaChile(this.valorCurso);
    }

    @Override
    protected abstPagamento criarPagamento() {
        return new PagamentoWebpay();
    }

    @Override
    protected abstComprovante criarComprovante() {
        return new ComprovanteRUT(this.nomeAluno, this.rut);
    }
}