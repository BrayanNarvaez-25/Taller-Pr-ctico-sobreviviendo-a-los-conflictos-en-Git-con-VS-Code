public class BilleteraVirtual {
    double saldo;
    String moneda;
    String titular;
    boolean cuentaActiva = true;

    public Billetera(String titular, double balanceTotal) {
        this.titular = titular;
        this.saldo = saldoInicial;
        this.moneda="USD";
        this.balanceTotal = balanceTotal;
    }

    public void transferir(double monto) {
        balanceTotal = balanceTotal - monto;
    }

    public void mostrarSaldo() {
        System.out.println("Saldo de " + titular + ": $" + balanceTotal);
    }
}