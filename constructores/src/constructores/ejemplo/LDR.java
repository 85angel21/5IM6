package constructores.ejemplo;

/**
 * @author 5IM6 Hernández Marín Miguel Angel
 * @version 1.0 02/09/2017
 */
public class LDR {

    String nombre, nacio, genMusic;
    int edad, albEst;

    public LDR(String nombre, String nacio, String genMusic, int edad, int albEst) {
        this.nombre = nombre;
        this.nacio = nacio;
        this.genMusic = genMusic;
        this.edad = edad;
        this.albEst = albEst;
    }

    public void algo() {
        System.out.println(nombre + " " + nacio + " " + genMusic + " " + edad + " " + albEst);
    }
}
