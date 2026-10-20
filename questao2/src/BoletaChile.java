public class BoletaChile extends abstDocFiscal {

    public BoletaChile(double valorCurso) {
        super(valorCurso);
    }

    @Override
    void calcularImposto() {
        this.impostoCalculado = this.valorCurso * 0.19;
    }

    @Override
    String emitir() {
        return "Boleta Electrónica (Chile) | Valor del Curso: CLP $ " + String.format("%.2f", this.valorCurso) + 
               " | IVA (19%): CLP $ " + String.format("%.2f", this.impostoCalculado);
    }
}