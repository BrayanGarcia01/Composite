package co.agenciaviajes.negocio;

/**
 * Hoteles del hospeaje
 * @author Libardo Pantoja, Ricardo Zambrano, Julio Hurtado
 */
public class Hotel {

    private String nombre;
    public Hotel(String nombre){
        this.nombre=nombre;
    }

    public Hotel() {
    }

    //Complete constructor, getters and setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
