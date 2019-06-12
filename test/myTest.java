/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import co.agenciaviajes.negocio.CiudadComponent;
import co.agenciaviajes.negocio.PaqueteComponent;
import co.agenciaviajes.negocio.RegionComponent;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author INGESIS
 */
public class myTest {
    
    public myTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
                
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void Prueba1() {
        try {
            PaqueteComponent principal = new RegionComponent("Europa");
            PaqueteComponent pais1 = new RegionComponent("Italia");
            PaqueteComponent pais2 = new RegionComponent("Francia");
            PaqueteComponent pais3 = new RegionComponent("España");
            
            PaqueteComponent ciudad1 = new CiudadComponent("Roma", 1000000);
            PaqueteComponent ciudad2 = new CiudadComponent("Paris", 2000000);
            PaqueteComponent ciudad3 = new CiudadComponent("Madrid", 3000000);
            PaqueteComponent ciudad4 = new CiudadComponent("Valencia", 2000000);
            
       
            principal.addComponent(pais1);
                
            principal.addComponent(pais2);
            principal.addComponent(pais3);
     
            pais1.addComponent(ciudad1);
            pais2.addComponent(ciudad2);
            pais3.addComponent(ciudad3);
            pais3.addComponent(ciudad4);
            assertEquals(8000000, principal.getComponentPrecio());
            assertEquals("Italia", pais1.getNombre());
            assertEquals("Francia", pais2.getNombre());
            assertEquals("España", pais3.getNombre());
            

            
            
            PaqueteComponent otroPaquete = new RegionComponent("Medio Oriente");
            PaqueteComponent otroPais1 = new RegionComponent("Iran");
            PaqueteComponent otroPais2 = new RegionComponent("Israel");
            PaqueteComponent otroPais3 = new RegionComponent("Siria");
            
            PaqueteComponent otraCiudad1 = new CiudadComponent("Ascalon", 1000000);
            PaqueteComponent otraCiudad2 = new CiudadComponent("Jerusalen", 2000000);
            PaqueteComponent otraCiudad3 = new CiudadComponent("Teheran", 3000000);
            PaqueteComponent otraCiudad4 = new CiudadComponent("Damasco", 2000000);

            otroPaquete.addComponent(otroPais1);
            otroPaquete.addComponent(otroPais2);
            otroPaquete.addComponent(otroPais3);
            
            otroPais2.addComponent(otraCiudad1);
            otroPais2.addComponent(otraCiudad2);
            otroPais1.addComponent(otraCiudad3);
            otroPais3.addComponent(otraCiudad4);
            assertEquals(8000000, otroPaquete.getComponentPrecio());
            assertEquals("Iran", otroPais1.getNombre());
            assertEquals("Israel", otroPais2.getNombre());
            assertEquals("Siria", otroPais3.getNombre());

        } catch (Exception ex) {
            Logger.getLogger(myTest.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
}
