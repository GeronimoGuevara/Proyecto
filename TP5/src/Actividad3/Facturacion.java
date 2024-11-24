package Actividad3;

import java.util.Scanner;

public class Facturacion {

    private static String[][] articulos = {
            {"101", "Leche", "25"},
            {"102", "Gaseosa", "30"},
            {"103", "Fideos", "15"},
            {"104", "Arroz", "28"},
            {"105", "Vino", "120"},
            {"106", "Manteca", "20"},
            {"107", "Lavandina", "18"},
            {"108", "Detergente", "46"},
            {"109", "Jabon en polvo", "96"},
            {"110", "Galletas", "60"}
    };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Factura factura = new Factura();
        String codigo;
        int cantidad;

        System.out.print("Ingrese la fecha de la factura con formato dd/mm/aaaa: ");
        factura.setFechaFactura(sc.nextLine());

        System.out.print("Ingrese el numero de la factura: ");
        factura.setNumeroFactura(sc.nextLong());
        sc.nextLine();

        System.out.print("Ingrese el nombre del cliente: ");
        factura.setCliente(sc.nextLine());

        mostrarArticulos();

        String continuar;
        do {
            String[] articulo;
            do {
                System.out.print("Ingrese el código del artículo a facturar: ");
                codigo = sc.nextLine();
                articulo = buscarArticulo(codigo);
                if (articulo == null) {
                    System.out.println("El código ingresado no existe, intente de nuevo.");
                }
            } while (articulo == null);

            System.out.println("Artículo: " + articulo[1] + ", Precio: " + articulo[2]);
            System.out.print("Ingrese la cantidad a facturar: ");
            cantidad = sc.nextInt();
            sc.nextLine();

            double precioUnitario = Double.parseDouble(articulo[2]);
            double descuento = cantidad > 5 ? precioUnitario * 0.1 : 0;
            double subtotal = (precioUnitario - descuento) * cantidad;

            DetalleFactura detalle = new DetalleFactura();
            detalle.setCodigoArticulo(articulo[0]);
            detalle.setNombreArticulo(articulo[1]);
            detalle.setCantidad(cantidad);
            detalle.setPrecioUnitario(precioUnitario);
            detalle.setDescuentoItem(descuento);
            detalle.setSubTotal(subtotal);
            factura.addDetalleFactura(detalle);

            System.out.print("¿Desea seguir cargando artículos? (s/n): ");
            continuar = sc.nextLine();
        } while (continuar.equalsIgnoreCase("s"));

        factura.calcularMontoTotal();

        System.out.println("\nFactura generada:");
        System.out.printf("Fecha: %s, Número: %d, Cliente: %s\n",
                factura.getFechaFactura(), factura.getNumeroFactura(), factura.getCliente());
        System.out.printf("%-10s %-15s %-10s %-10s %-10s %-10s\n",
                "Código", "Nombre", "Cantidad", "Precio", "Descuento", "Subtotal");
        for (DetalleFactura detalle : factura.getDetallesFactura()) {
            System.out.printf("%-10s %-15s %-10d %-10.2f %-10.2f %-10.2f\n",
                    detalle.getCodigoArticulo(),
                    detalle.getNombreArticulo(),
                    detalle.getCantidad(),
                    detalle.getPrecioUnitario(),
                    detalle.getDescuentoItem(),
                    detalle.getSubTotal());
        }
        System.out.printf("Total: %.2f\n", factura.getTotalCalculadoFactura());

        sc.close();
    }

    public static void mostrarArticulos() {
        System.out.println("Código\tNombre\t\tPrecio");
        for (String[] articulo : articulos) {
            System.out.println(articulo[0] + "\t\t" + articulo[1] + "\t\t" + articulo[2]);
        }
    }

    public static String[] buscarArticulo(String codigo) {
        for (String[] articulo : articulos) {
            if (articulo[0].equals(codigo)) {
                return articulo;
            }
        }
        return null;
    }
}
