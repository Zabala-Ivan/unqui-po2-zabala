package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class EquipoDeTrabajoTestCase {

    @Test
    public void testEquipoSinIntegrantes() {
        EquipoDeTrabajo equipo = new EquipoDeTrabajo("Vacío");
        assertEquals(0.0, equipo.promedioEdad(), 0.01);
    }
    

    @Test
    public void testPromedioEdadConUnSoloIntegrante() {
        EquipoDeTrabajo equipo = new EquipoDeTrabajo("Solo Uno");
        equipo.agregarIntegrante(new Persona("Juan", "Pérez", 40));
        assertEquals(40.0, equipo.promedioEdad(), 0.01);
    }
    

    
    @Test
    public void testPromedioEdadConVariosIntegrantes() {
        EquipoDeTrabajo equipo = new EquipoDeTrabajo("Equipo Test");

        equipo.agregarIntegrante(new Persona("Ana", "Gómez", 28));
        equipo.agregarIntegrante(new Persona("Luis", "Martínez", 32));
        equipo.agregarIntegrante(new Persona("Clara", "López", 40));

        double esperado = (28 + 32 + 40) / 3.0;
        assertEquals(esperado, equipo.promedioEdad(), 0.01);
    }
    

    @Test
    public void testGetNombre() {
        EquipoDeTrabajo equipo = new EquipoDeTrabajo("QA");
        assertEquals("QA", equipo.getNombre());
    }
    
}