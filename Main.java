public class Main {
    public static void main(String[] args) {
        BilleteraVirtual miBilletera = new BilleteraVirtual("Juan Perez", 100.0);

        miBilletera.mostrarSaldo();

        miBilletera.transferir(20.0);

        miBilletera.mostrarSaldo();
    }
}