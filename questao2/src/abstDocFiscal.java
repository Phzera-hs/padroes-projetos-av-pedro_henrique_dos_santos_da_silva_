public abstract class abstDocFiscal {
    public double valorCurso;
    public double impostoCalculado;

    public abstDocFiscal(double valorCurso) {
        this.valorCurso = valorCurso;
    }

    abstract void calcularImposto();
    abstract String emitir();
}