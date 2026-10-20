public abstract class abstComprovante {
    protected String nomeAluno;
    protected String identificacao;

    public abstComprovante(String nomeAluno, String identificacao) {
        this.nomeAluno = nomeAluno;
        this.identificacao = identificacao;
    }

    abstract String gerarComprovante();
}