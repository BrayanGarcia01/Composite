package co.agenciaviajes.negocio;

/**
 * Representa los planes de alimentación en cada ciudad: Desayuno, almuerzo y
 * cena
 *
 * @author Libardo Pantoja, Ricardo Zambrano, Julio Hurtado
 */
public class PlanAlimentacion {

    private String[] alimentacion;
    public PlanAlimentacion(String[] alimentacion){
        this.alimentacion=alimentacion;
    }

    public PlanAlimentacion() {
    }
    

   // Complete constructor, getters and setters

    public String[] getAlimentacion() {
        return alimentacion;
    }

    public void setAlimentacion(String[] alimentacion) {
        this.alimentacion = alimentacion;
    }

}
