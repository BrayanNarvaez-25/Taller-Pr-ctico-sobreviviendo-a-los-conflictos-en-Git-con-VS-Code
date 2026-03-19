public class BilleteraVirtual {
    double saldo;
    String moneda="USD";
    String titular;
    boolean cuentaActiva = true;

    public BilleteraVirtual(String titular, double balanceTotal) {
        this.titular = titular;
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