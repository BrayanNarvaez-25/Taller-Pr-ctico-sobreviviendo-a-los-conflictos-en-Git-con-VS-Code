public class Billetera {
    double balanceTotal;
    String titular;
    boolean cuentaActiva = true;

    public Billetera(String titular, double balanceTotal) {
        this.titular = titular;
        this.balanceTotal = balanceTotal;
    }

    public void transferir(double monto) {
        balanceTotal = balanceTotal - monto;
    }

    public void mostrarSaldo() {
        System.out.println("Saldo de " + titular + ": $" + balanceTotal);
    }
}