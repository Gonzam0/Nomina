package model;

public class Nomina {
    private String dni; // DNI del empleado asociado a la nómina
    private double sueldo; // Sueldo correspondiente a la nómina

    /**
     * Crea un nuevo objeto de tipo Nómina con un DNI y sueldo especificados.
     *
     * @param dni    El DNI del empleado asociado a la nómina.
     * @param sueldo El sueldo correspondiente a la nómina.
     */
    public Nomina(String dni, double sueldo) {
        super();
        this.dni = dni;
        this.sueldo = sueldo;
    }

    /**
     * Crea un nuevo objeto de tipo Nómina sin valores iniciales.
     */
    public Nomina() {
        // Constructor vacío
    }

    /**
     * Obtiene el DNI del empleado asociado a la nómina.
     *
     * @return El DNI del empleado asociado a la nómina.
     */
    public String getDni() {
        return dni;
    }

    /**
     * Establece el DNI del empleado asociado a la nómina.
     *
     * @param dni El DNI del empleado asociado a la nómina.
     */
    public void setDni(String dni) {
        this.dni = dni;
    }

    /**
     * Obtiene el sueldo correspondiente a la nómina.
     *
     * @return El sueldo correspondiente a la nómina.
     */
    public double getSueldo() {
        return sueldo;
    }

    /**
     * Establece el sueldo correspondiente a la nómina.
     *
     * @param sueldo El sueldo correspondiente a la nómina.
     */
    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    /**
     * Genera una representación en forma de cadena de la Nómina, que incluye el DNI y el sueldo.
     *
     * @return Una cadena que representa la nómina.
     */
    @Override
    public String toString() {
        return "Nomina [dni=" + dni + ", sueldo=" + sueldo + "]";
    }
}

