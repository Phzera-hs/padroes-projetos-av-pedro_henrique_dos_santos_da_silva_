public class NFSeBrasil extends abstDocFiscal {

    public NFSeBrasil(double valorCurso) {
        super(valorCurso);
    }

    @Override
    void calcularImposto() {
        this.impostoCalculado = this.valorCurso * 0.05;
    }

    @Override
    String emitir() {
        return "NFS-e (Brasil) | Valor do Curso: R$ " + String.format("%.2f", this.valorCurso) + 
               " | ISS (5%): R$ " + String.format("%.2f", this.impostoCalculado);
    }
}