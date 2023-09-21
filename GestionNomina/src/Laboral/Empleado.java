package Laboral;

/**
 * La clase Empleado representa a un empleado con nombre, DNI, sexo, categoría y años de servicio.
 * Esta clase hereda de la clase Persona y proporciona constructores y métodos específicos para
 * gestionar la información de un empleado.
 *
 * @author Gonzalo Moreira
 */
public class Empleado extends Persona {

    /** La categoría del empleado. Debe estar en el rango de 1 a 10. */
    private int categoria;

    /** El número de años de servicio del empleado. */
    public int anyos;

    /**
     * Constructor de la clase Empleado que inicializa todos los campos.
     *
     * @param nombre    El nombre del empleado.
     * @param dni       El número de DNI del empleado.
     * @param sexo      El sexo del empleado.
     * @param categoria La categoría del empleado (debe estar en el rango de 1 a 10).
     * @param anyos     El número de años de servicio del empleado.
     * @throws DatosNoCorrectosException Si los datos de categoría o años de servicio no son válidos.
     */
    public Empleado(String nombre, String dni, String sexo, int categoria, int anyos) throws DatosNoCorrectosException {
        super(nombre, dni, sexo);

        // Verifica si la categoría está en el rango válido.
        if (categoria >= 1 && categoria <= 10) {
            this.categoria = categoria;
        } else {
            throw new DatosNoCorrectosException("La categoría debe estar en el rango de 1 a 10.");
        }

        // Verifica si el número de años de servicio es válido.
        if (anyos >= 0) {
            this.anyos = anyos;
        } else {
            throw new DatosNoCorrectosException("El número de años de servicio no puede ser negativo.");
        }
    }

    /**
     * Constructor de la clase Empleado que inicializa el nombre, DNI y sexo.
     * La categoría se establece en 1 y los años de servicio en 0 por defecto.
     *
     * @param nombre El nombre del empleado.
     * @param dni    El número de DNI del empleado.
     * @param sexo   El sexo del empleado.
     */
    public Empleado(String nombre, String dni, String sexo) {
        super(nombre, dni, sexo);
        categoria = 1;
        anyos = 0;
    }

    /**
     * Obtiene la categoría del empleado.
     *
     * @return La categoría del empleado.
     */
    public int getCategoria() {
        return categoria;
    }

    /**
     * Establece la categoría del empleado.
     *
     * @param categoria La nueva categoría del empleado.
     */
    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    /**
     * Incrementa el número de años de servicio del empleado en uno.
     */
    public void incrAnyo() {
        anyos++;
    }

    /**
     * Imprime la información del empleado, incluyendo su categoría y años de servicio.
     */
    public void imprime() {
        System.out.println("Empleado [categoria=" + categoria + ", anyos=" + anyos + ", nombre=" + nombre + ", dni=" + dni
                + ", sexo=" + sexo + "]");
    }
}
