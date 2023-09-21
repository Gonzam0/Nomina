package Laboral;

/**
 * La clase Persona representa una persona con nombre, DNI y sexo.
 * Esta clase proporciona constructores y métodos para gestionar la información
 * de una persona.
 *
 * @author Tu Nombre
 * @version 1.0
 */
public class Persona {

    /** El nombre de la persona. */
    public String nombre;

    /** El número de DNI de la persona. */
    public String dni;

    /** El sexo de la persona. */
    public String sexo;

    /**
     * Constructor de la clase Persona que inicializa todos los campos.
     *
     * @param nombre El nombre de la persona.
     * @param dni    El número de DNI de la persona.
     * @param sexo   El sexo de la persona.
     */
    public Persona(String nombre, String dni, String sexo) {
        this.nombre = nombre;
        this.dni = dni;
        this.sexo = sexo;
    }

    /**
     * Constructor de la clase Persona que inicializa el nombre y el sexo.
     *
     * @param nombre El nombre de la persona.
     * @param sexo   El sexo de la persona.
     */
    public Persona(String nombre, String sexo) {
        this.nombre = nombre;
        this.sexo = sexo;
    }

    /**
     * Establece el número de DNI de la persona.
     *
     * @param dni El número de DNI de la persona.
     */
    public void setDni(String dni) {
        this.dni = dni;
    }

    /**
     * Imprime la información básica de la persona, incluyendo su nombre y DNI.
     */
    public void Imprime() {
        System.out.println("Nombre: " + nombre + " DNI: " + dni);
    }
}
