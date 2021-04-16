/**
 * @author Sergio Murias
 * @see ReservaInstalacion
 * @version 1.0
 * @since 1.0
 */
public class ReservaInstalacion extends Reserva{
    /**
     * Constructor vacio
     */
    public ReservaInstalacion() {
    }
    /**
     * Constructor con todos los atributos:
     * @param id
     * @param fecha
     * @param horaFin
     * @param horaInicio
     */
    public ReservaInstalacion(int id, Date fecha, Date horaInicio, Date horaFin, int cantidad) {
        super(id, fecha, horaFin, horaInicio);
    }
}