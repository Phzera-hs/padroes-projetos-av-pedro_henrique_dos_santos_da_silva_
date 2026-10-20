public class FactoryBrasil extends abstFactoryPais {
    private double valorCurso;
    private String nomeAluno;
    private String cpf;

    public FactoryBrasil(double valorCurso, String nomeAluno, String cpf) {
        this.valorCurso = valorCurso;
        this.nomeAluno = nomeAluno;
        this.cpf = cpf;
    }

    @Override
    protected abstDocFiscal criarDocFiscal() {
        return new NFSeBrasil(this.valorCurso);
    }

    @Override
    protected abstPagamento criarPagamento() {
        return new PagamentoPix();
    }

    @Override
    protected abstComprovante criarComprovante() {
        return new ComprovanteCPF(this.nomeAluno, this.cpf);
    }
}