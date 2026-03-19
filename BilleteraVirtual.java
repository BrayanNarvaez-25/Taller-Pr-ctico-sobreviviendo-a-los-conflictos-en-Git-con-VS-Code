public class BilleteraVirtual {
    double balanceTotal;
    String moneda;
    String titular;
    boolean cuentaActiva = true;

    public BilleteraVirtual(String titular, double balanceTotal) {
        this.titular = titular;
        this.moneda="USD";
        this.balanceTotal = balanceTotal;
    }

    public void transferir(double monto) {
        if(monto > balanceTotal){
            System.out.println("Fondos insuficientes");
            return;
        }
        balanceTotal = balanceTotal - monto;
        System.out.println("Transferencia exitosa de: $"+monto);
    }

    public void mostrarSaldo() {
        System.out.println("Saldo de " + titular + ": $" + balanceTotal);
    }
}