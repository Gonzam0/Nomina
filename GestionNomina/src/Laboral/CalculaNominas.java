package Laboral;

/**
 * La clase CalculaNominas es una clase de aplicación que calcula y muestra los sueldos de empleados.
 * Realiza cálculos de sueldos para objetos Empleado y utiliza la clase Nomina para este propósito.
 * También incluye un método principal para demostrar el cálculo de sueldos.
 * 
 * @author Gonzalo Moreira
 */
public class CalculaNominas {

    /**
     * Método principal que demuestra el cálculo de sueldos para empleados.
     * Crea instancias de la clase Empleado, realiza operaciones y muestra los sueldos calculados.
     *
     * @param args Los argumentos de la línea de comandos (no se utilizan en este caso).
     * @throws DatosNoCorrectosException Si se proporcionan datos de empleado incorrectos al crear una instancia de Empleado.
     */
    public static void main(String[] args) throws DatosNoCorrectosException {
        try {
            // Crear empleados con datos válidos.
            Empleado e = new Empleado("James Cosling", "32000032G", "M", 4, 7);
            Empleado e2 = new Empleado("Ada Lovelace", "32000031R", "F");

            // Mostrar información y sueldos iniciales de los empleados.
            escribe(e);
            escribe(e2);

            // Realizar cambios en los empleados.
            e2.incrAnyo();
            e.setCategoria(9);

            // Mostrar información y sueldos actualizados de los empleados.
            escribe(e);
            escribe(e2);

        } catch (DatosNoCorrectosException e) {
            System.out.println("Datos no correctos ");
        }
    }

    /**
     * Este método muestra información sobre un empleado, incluyendo su nombre, DNI, sexo y sueldo.
     *
     * @param empleado1 El objeto Empleado del que se mostrará la información y se calculará el sueldo.
     */
    private static void escribe(Empleado empleado1) {
        Nomina n = new Nomina();
        empleado1.imprime();
        System.out.println("El sueldo es: " + n.sueldo(empleado1));
    }
}
