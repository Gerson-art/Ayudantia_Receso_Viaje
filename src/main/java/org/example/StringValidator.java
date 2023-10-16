package org.example;

public class StringValidator {
    public String esStringValido(String mensaje) throws ExcepcionString {
        if (mensaje.matches("[a-zA-Z]+")) {
            return mensaje;
        } else {
            throw new ExcepcionString();
        }
    }
}