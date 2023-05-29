package dam.programacion.Examenes.UD06_07.Ej02_Tienda;

import Ej02_Tienda.model.producto.bebida.AguaMineral;
import Ej02_Tienda.model.producto.bebida.Bebida;
import Ej02_Tienda.model.producto.bebida.Refresco;

public class MainTienda {
    public static void main(String[] args) {
        //Crear un array de 5 posiciones cque contenga elementos de tipo bebida
        Bebida[] bebidas = new Bebida[5];
        //Asignar valores
        bebidas[0] = new Refresco(1, "Coca-Cola", "Nevera", 0.6, "Lata", 20);
        bebidas[1] = new Refresco(2, "Aquarius 1L", "Pasillo 3", 0.6, "Botella", 5);
        bebidas[2] = new Refresco(3, "Cacaolat", "Estantería 1", 2, "Botella", 30);
        bebidas[3] = new AguaMineral(4, "Agua Fontecelta 0.5l", "Nevera", 0.40, "Botella de cristal", "O Freixo");
        bebidas[4] = new AguaMineral(5, "Agua Aguarón 2l", "Pasillo 1", 0.8, "Garrafa de plástico", "Aguarón");

        for (Bebida b : bebidas){
            System.out.println(b.toString()); //Precio antes de cálculo
            b.calcularPrecio();
            System.out.println(b.toString()); //Mostarr el precio de cada producto
        }

       calcularMedia(bebidas);

    }

    private static void calcularMedia(Bebida[] bebidas){
        //Ejecutar calcular precio para el array
        double sumaRefresco = 0;
        int contadorRefrescos = 0;
        double sumaAgua = 0;
        int contadorAguas = 0;

        for (Bebida b : bebidas){
            if (b instanceof Refresco) {
                sumaRefresco += b.getPrecio();
                contadorRefrescos++;
            } else {
                if (b instanceof AguaMineral) {
                    sumaAgua += b.getPrecio();
                    contadorAguas++;
                }
            }
        }

        System.out.println("La media de precio de refrescos es: " + (double)(sumaRefresco/contadorRefrescos) + "€.");
        System.out.println("La media de precio de aguas minerales es: " + (double)(sumaAgua/contadorAguas) + "€.");
    }
}
