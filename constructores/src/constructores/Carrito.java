package constructores;

/**
 * @author 5IM6 Hernández Marín Miguel Angel
 * @version 1.0 02/09/2017
 */
public class Carrito {

    String gasolina, frenos;
    int anno, precio;

    public Carrito(String gasolina, String frenos, int anno, int precio) {
        this.gasolina = gasolina;
        this.frenos = frenos;
        this.anno = anno;
        this.precio = precio;
    }

    public void algo() {
        System.out.println(gasolina + " " + frenos + " " + anno + " " + precio);
    }
}
