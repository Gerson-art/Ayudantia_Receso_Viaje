package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class StringValidatorTest {
    @Test

    void esStringValido() {
        StringValidator validator = new StringValidator();
        String mensajeinvalido= "1234";
        assertThrows(ExcepcionString.class, ()->validator.esStringValido(mensajeinvalido));
    }
    @Test

    void calcularTiempoViajeAuto(){
        Automovil auto= new Automovil();
        String mensajeEsperado="Horas: " + 2 + " Minutos: " + 0 + " Segundos: " + 0;
        assertEquals(mensajeEsperado,auto.calcularTiempoViaje(80));
    }
}