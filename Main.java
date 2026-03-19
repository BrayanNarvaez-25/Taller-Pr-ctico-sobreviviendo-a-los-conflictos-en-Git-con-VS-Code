public class Main {
    public static void main(String[] args) {
        BilleteraVirtual miBilletera = new BilleteraVirtual("Juan Perez", 100.0);
        BilleteraVirtual miBilletera2 = new BilleteraVirtual("María Lopez", 500.0);

        miBilletera.mostrarSaldo();
        miBilletera2.mostrarSaldo();

        miBilletera.transferir(20.0);
        miBilletera.transferir(30.0);
        miBilletera.transferir(40.0);

        miBilletera.mostrarSaldo();
    }
}