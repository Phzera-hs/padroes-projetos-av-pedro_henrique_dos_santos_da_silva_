public class ComprovanteCPF extends abstComprovante {

    public ComprovanteCPF(String nomeAluno, String cpf) {
        super(nomeAluno, cpf);
    }

    @Override
    String gerarComprovante() {
        return "Comprovante de Matrícula | Aluno: " + this.nomeAluno + " | CPF: " + this.identificacao;
    }
}