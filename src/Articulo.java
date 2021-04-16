/**
 * @author Sergio Murias
 * @see Articulo
 * @version 1.0
 * @since 1.0
 */
public class Articulo{

    private int codigo;
    /**
     * codigo del articulo
     */
    private String descripcion;
    /**
     * descripcion del articulo
     */
    private enum tipo;
    /**
     * tipo del articulo
     */
}
/**
 * Constructor vacio
 */

public class Articulo () {

}
    /**
     * Constructor con todos los atributos:
     * @param codigo
     * @param descripcion
     */

    public Articulo(int codigo, String descripcion) {
        this.codigo = codigo;
        this.descripcion = descripcion;
    }