public class ComprovanteRUT extends abstComprovante {

    public ComprovanteRUT(String nomeAluno, String rut) {
        super(nomeAluno, rut);
    }

    @Override
    String gerarComprovante() {
        return "Comprobante de Matrícula | Alumno: " + this.nomeAluno + " | RUT: " + this.identificacao;
    }
}