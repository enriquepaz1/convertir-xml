/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;

import datos.Persona;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

/**
 *
 * @author Personal
 */
public class Main {
    public static void main(String[] args) {
        crearXML();
    }
    
    public static void crearXML(){
        Persona persona = new Persona();
        persona.setId(10);
        persona.setNombre("Jose");
        persona.setApellido("Paz");
        
        try {
            // JAXB Contexto
            JAXBContext context = JAXBContext.newInstance(Persona.class);
            //
            Marshaller ms = context.createMarshaller();
            ms.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            ms.marshal(persona, new File("C:\\proyectoXML\\convertToXML\\archivoXML\\persona.xml"));
        } catch (JAXBException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
