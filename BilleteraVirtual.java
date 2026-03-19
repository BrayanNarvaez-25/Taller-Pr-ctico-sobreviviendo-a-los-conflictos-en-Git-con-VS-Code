public class BilleteraVirtual {
    double saldo;
    String moneda;
    String titular;

    public Billetera(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
        this.moneda="USD";
    }

    public void transferir(double monto) {
        saldo = saldo - monto;
    }

    public void mostrarSaldo() {
        System.out.println("Saldo de " + titular + ": $" + saldo);
    }
}