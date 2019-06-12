package co.agenciaviajes.negocio;

import java.util.ArrayList;

/**
 * Representa una region del planeta, como continente o pais
 *
 * @author Libardo Pantoja, Ricardo Zambrano, Julio Hurtado
 */
public class RegionComponent extends PaqueteComponent {

    public ArrayList<PaqueteComponent> regionContenido = new ArrayList();

    public RegionComponent(String nombre) {
        super(nombre);
    }

    // Complete constructor
     public void addComponent(PaqueteComponent component) throws Exception {
        regionContenido.add(component);
    }

    public PaqueteComponent getComponent(int componentNum) throws Exception {
            return regionContenido.get(componentNum);
    }
    @Override
    public long getComponentPrecio() {
        long precioOfAllHojas = 0;

        for (Object component : regionContenido) {
            precioOfAllHojas = precioOfAllHojas + (((PaqueteComponent) component).getComponentPrecio());
        }
        return precioOfAllHojas;
    }
    
    
    // Complete demas  metodos
}
