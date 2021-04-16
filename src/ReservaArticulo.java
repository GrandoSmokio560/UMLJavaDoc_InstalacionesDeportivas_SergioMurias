/**
 * @author Sergio Murias
 * @see ReservaArticulo
 * @see Reserva
 * @version 1.0
 * @since 1.0
 */
public class ReservaArticulo extends Reserva{

    private int cantidad;
    /**
     * cantidad de reservas
     */

    public ReservaArticulo(int cantidad) {
        this.cantidad = cantidad;
    }
    /**
     * Constructor con todos los atributos:
     * @param id
     * @param fecha
     * @param horaFin
     * @param horaInicio
     * @param cantidad
     */
    public ReservaArticulo(int id, Date fecha, Date horaInicio, Date horaFin, int cantidad) {
        super(id, fecha, horaFin, horaInicio);
        this.cantidad = cantidad;
    }
}
