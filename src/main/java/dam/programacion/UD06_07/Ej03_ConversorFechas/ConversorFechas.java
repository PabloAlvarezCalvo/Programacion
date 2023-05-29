package dam.programacion.UD06_07.Ej03_ConversorFechas;

public class    ConversorFechas {

    public static String europeoToAmericano(String fecha){
        String fechaAmericana = fecha.substring(3, 6) + fecha.substring(0, 3) + fecha.substring(6);
        String resultado;

        if (Integer.parseInt(fechaAmericana.substring(0, 2)) > 12){
            resultado = "Error en la fecha introducida";
        } else {
            resultado = fechaAmericana;
        }

        return resultado;
    }

    public static String americanoToEuropeo(String fecha){
        String fechaEuropea = fecha.substring(3, 6) + fecha.substring(0, 3) + fecha.substring(6);
        String resultado;

        if (Integer.parseInt(fechaEuropea.substring(3, 5)) > 12){
            resultado = "Error en la fecha introducida";
        } else {
            resultado = fechaEuropea;
        }

        return resultado;
    }
}
