package dam.programacion.Examenes.UD09;

import model.*;

import java.time.LocalDate;
import java.util.*;

public class Main {
    ArrayList<Empleado> empleados = new ArrayList<>();
    ArrayList<Producto> productos = new ArrayList<>();
    public static void main(String[] args) {
        Main obj = new Main();
        System.out.println("==========Generar empleados=========");
        obj.generarEmpleados();
        obj.mostrarEmpleados();
        System.out.println("==========Eliminar pescadería=========");
        obj.eliminarPescaderia();
        obj.mostrarEmpleados();
        System.out.println("==========Mostrar Secciones=========");
        obj.mostrarSecciones();
        System.out.println("==========Salario medio charcutería=========");
        obj.mostrarSalarioMedio();
        //System.out.println("==========Generar productos=========");
        obj.generarProductos();
        System.out.println("==========Qué se vende donde Paco?=========");
        obj.productosSeccion();
        System.out.println("==========Mostrar conservas=========");
        obj.mostrarConservas();
    }

    public void generarEmpleados(){

        Seccion pescaderia = new Seccion(1, "Pescadería");
        Seccion charcuteria = new Seccion(2, "Charcutería");
        Seccion hogar = new Seccion(3, "Hogar");
        Seccion cosmetica = new Seccion(4, "Cosmética");

        Empleado paco = new Empleado("12345678A", "Paco", 35,
                "Avenida Castelao 9", 2500.0, charcuteria, LocalDate.parse("2020-01-01"));
        paco.addSeccion(pescaderia,LocalDate.parse("2020-01-01"), LocalDate.parse("2021-01-01"));
        paco.addSeccion(cosmetica,LocalDate.parse("2021-01-01"), LocalDate.parse("2022-01-01"));
        paco.addSeccion(charcuteria,LocalDate.parse("2022-01-01"), null);


        Empleado laura = new Empleado("87654321Z", "Laura", 37,
                "Calle Romin 10", 1500, hogar, LocalDate.parse("2022-05-04"));
        laura.addSeccion(hogar, LocalDate.parse("2022-05-04"), null);

        Empleado martin = new Empleado("25465873H", "Martin", 23,
                "Carretera Camposancos 19", 1000, pescaderia, LocalDate.now());
        martin.addSeccion(pescaderia, LocalDate.now(), null);

        Empleado ana = new Empleado("86942155R", "Ana", 21,
                "", 3500, hogar, LocalDate.now());
        ana.addSeccion(pescaderia, ana.getFechaContratacion(), LocalDate.parse("2022-06-09"));
        ana.addSeccion(hogar, LocalDate.parse("2022-06-09"), null);

        Empleado carlos = new Empleado("12589647I", "Carlos", 44,
                "", 1115.36, charcuteria, LocalDate.parse("2022-05-07"));
        carlos.addSeccion(charcuteria, carlos.getFechaContratacion(), null);

        empleados.add(paco);
        empleados.add(laura);
        empleados.add(martin);
        empleados.add(ana);
        empleados.add(carlos);
    }

    private void mostrarEmpleados(){
        for (Empleado e : empleados){
            System.out.println(e.toString());
        }
    }

    private void eliminarPescaderia(){
        empleados.removeIf(emp -> emp.getSeccion().getNombre().equals("Pescadería"));
    }

    private void mostrarSecciones(){
        for (Empleado e : empleados){
            for (Integer clave : e.getRegistroSecciones().keySet()) {
                System.out.println(e.getNombre() + ": " + e.getRegistroSecciones().get(clave).toString());
            }
        }
    }

    private void mostrarSalarioMedio(){
        Iterator<Empleado> charcuteros = empleados.iterator();

        int count = 0;
        double sumaSalarios = 0;

        while (charcuteros.hasNext()){
            Empleado emp = charcuteros.next();
            if (emp.getSeccion().getNombre().equals("Charcutería")){
                count++;
                sumaSalarios += emp.getSalario() * 14;
            }
        }

        double mediaSalarial = sumaSalarios / count;
        System.out.printf("La media salarial anual en charcutería es: %.2f€.\n", mediaSalarial);
    }

    private void generarProductos() {

        Seccion conservas = new Seccion(5, "Conservas");
        Seccion bebidas = new Seccion(6, "Bebidas");
        Seccion charcuteria = new Seccion(2, "Charcutería");


        Producto producto0 = new Producto();
        Producto cocaCola = new Producto(1, "Coca-Cola 33cl", bebidas, LocalDate.parse("2023-05-07"));
        Producto atunConserva = new Producto(2, "Lata atun 80g", conservas, LocalDate.parse("2024-03-02"));
        Producto mejillonesConserva = new Producto(3, "Mejillones en escabeche", conservas, LocalDate.parse("2025-06-08"));
        Producto pechugaPollo = new Producto(5, "Pechuga pollo", charcuteria, LocalDate.parse("2023-07-13"));
        Producto fileteTernera = new Producto(4, "Filete ternera", charcuteria, LocalDate.parse("2023-03-28"));


        productos.add(producto0);
        productos.add(cocaCola);
        productos.add(atunConserva);
        productos.add(mejillonesConserva);
        productos.add(fileteTernera);
        productos.add(pechugaPollo);
    }

    private void productosSeccion(){
        TreeMap<Producto, Long> productosSeccionPaco = new TreeMap<>(Comparator.comparing(Producto::getId));

        Seccion seccion = new Seccion();

        for (Empleado e : empleados){
            if (e.getNombre().equals("Paco")){
                seccion = e.getSeccion();
                break;
            }
        }

        for (Producto p : productos){
            if (p.getSeccion().getNombre().equals(seccion.getNombre())){
                productosSeccionPaco.put(p, p.getId());
            }
        }

        mostrarProductosConjunto(productosSeccionPaco);
    }

    private static void mostrarProductosConjunto(TreeMap<Producto, Long> productos){
        for (Producto p : productos.keySet()){
            System.out.println(p.toString());
        }
    }

    private void mostrarConservas(){
        System.out.println("Conservas que caducan en 2024:");
        Iterator<Producto> iterador = productos.iterator();

        while (iterador.hasNext()){
            Producto p = iterador.next();

            if (p.getSeccion().getNombre().equals("Conservas")){
                int anhoCaducidad = p.getFechaCaducidad().getYear();
                int anhoActual = LocalDate.now().getYear();

                if (anhoCaducidad - anhoActual <= 1){
                    System.out.println(p.toString());
                }
            }
        }
    }

}