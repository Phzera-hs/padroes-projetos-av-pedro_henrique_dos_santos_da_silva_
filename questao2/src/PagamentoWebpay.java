public class PagamentoWebpay extends abstPagamento {

    @Override
    boolean processarPagamento(double valorBase, double imposto) {
        this.valorFinal = valorBase + imposto;
        this.statusConfirmado = true;
        return this.statusConfirmado;
    }

    @Override
    String gerarRecibo() {
        return "Recibo de Pago | Método: Webpay | Total Pagado: CLP $ " + String.format("%.2f", this.valorFinal);
    }
}