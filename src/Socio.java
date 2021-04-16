
/**
 * @author Sergio Murias
 * @see Socio
 * @version 1.0
 * @since 1.0
 */
public class Socio {
    private String nombre;
    /**
     * nombre del socio
     */
    private String direccion;
    /**
     * direccion del socio
     */
    private String ciudad;
    /**
     * ciudad del socio
     */
    private String provincia;
    /**
     * provincia del socio
     */
    private String telefono;
    /**
     * numero de telefono del socio
     */
    private float cuota;
    /**
     * cuota del socio
     */

    /**
     * Constructor vacio
     */
    public Socio() {

    }
    /**
     * Constructor con todos los atributos:
     * @param ciudad
     * @param nombre
     * @param direccion
     * @param telefono
     * @param provincia
     * @param cuota
     */
    public Socio(String nombre, String direccion, String ciudad, String provincia, String telefono, float cuota) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.provincia = provincia;
        this.telefono = telefono;
        this.cuota = cuota;
    }
}