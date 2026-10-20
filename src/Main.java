public class Main {
    static void main() {
        Vendedor v1 = new Vendedor();
        Vendedor v2 = new Vendedor();
        Vendedor v3 = new Vendedor();

        v1.setNombre("Joseph");
        v1.setVentas(-9);
        v1.setComision(100);
        v1.activar();

        v2.setNombre("Sebastián");
        v2.setVentas(8);
        v2.setComision(-1);
        v2.activar();

        v3.setNombre("Danny");
        v3.setVentas(65);
        v3.setComision(0);
        v3.desactivar();

        System.out.println("Vendedor 1");
        v1.mostrarInformacion();
        System.out.println("\nVendedor 2");
        v2.mostrarInformacion();
        System.out.println("\nVendedor 3");
        v3.mostrarInformacion();

        System.out.println("\nActualizar ventas vendedor 3 y 1");
        v1.registrarVenta(-9);
        v3.registrarVenta(85);
        v2.desactivar();

        System.out.println("Vendedor 1");
        v1.mostrarInformacion();
        System.out.println("\nVendedor 2");
        v2.mostrarInformacion();
        System.out.println("\nVendedor 3");
        v3.mostrarInformacion();
    }
}