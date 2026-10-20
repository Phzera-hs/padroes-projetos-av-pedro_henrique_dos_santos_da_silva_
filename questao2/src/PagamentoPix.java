public class PagamentoPix extends abstPagamento {

    @Override
    boolean processarPagamento(double valorBase, double imposto) {
        this.valorFinal = valorBase + imposto;
        this.statusConfirmado = true;
        return this.statusConfirmado;
    }

    @Override
    String gerarRecibo() {
        return "Recibo de Pagamento | Método: Pix | Total Pago: R$ " + String.format("%.2f", this.valorFinal);
    }
}