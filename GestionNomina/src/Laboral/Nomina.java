package Laboral;

/**
 * La clase Nomina calcula el sueldo de un empleado en función de su categoría y años de servicio.
 * Proporciona un método para calcular el sueldo en base a las reglas especificadas.
 *
 * @author Gonzalo Moreira
 */
public class Nomina {

    /** Arreglo que almacena los sueldos base correspondientes a cada categoría. */
    private static final int SUELDO_BASE[] = {5000, 7000, 9000, 11000, 13000, 15000, 17000, 19000, 21000, 23000};

    /**
     * Calcula el sueldo de un empleado en función de su categoría y años de servicio.
     *
     * @param empleado El objeto Empleado para el cual se calculará el sueldo.
     * @return El sueldo calculado para el empleado.
     */
    public double sueldo(Empleado empleado) {
        double sueldo;

        // Calcula el sueldo basado en la categoría y los años de servicio del empleado.
        sueldo = SUELDO_BASE[empleado.getCategoria() - 1] + 5000 * empleado.anyos;
        return sueldo;
    }
}
