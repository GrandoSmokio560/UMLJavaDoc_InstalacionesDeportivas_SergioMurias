import java.util.Date;
/**
 * @author Sergio Murias
 * @see Reserva
 * @version 1.0
 * @since 1.0
 */
public class Reserva{

    private int id;
    /**
     * codigo del articulo
     */
    private Date fecha;
    /**
     * descripcion del articulo
     */
    private Date horaInicio;
    /**
     * tipo del articulo
     */
    private Date horaFin;
}
/**
 * Constructor vacio
 */

public class Reserva (){
}
    /**
     * Constructor con todos los atributos:
     * @param id
     * @param fecha
     * @param horaInicio
     * @param horaFin
     */
    public Reserva(int id, Date fecha, Date horaInicio, Date horaFin) {
        this.id = id;
        this.fecha = fecha;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
    }