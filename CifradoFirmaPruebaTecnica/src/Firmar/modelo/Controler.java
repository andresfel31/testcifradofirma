/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Firmar.modelo;

import Firmar.comprobadora.Verificador;
import Firmar.Generarclave.GeneracionDeClaves;
import Firmar.firmador;
import java.security.KeyPair;

/**
 *
 * @author andre
 */
public class Controler {

    private GeneracionDeClaves generadorDeClaves;
    private firmador firmador;
    private Verificador verificador;

    public Controler() {
        try {
            generadorDeClaves = new GeneracionDeClaves();
            firmador = new firmador();
            verificador = new Verificador();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void generarclave(String pass) {
        generadorDeClaves.generarclave(pass);
    }

    public void exportarClavePublica(String rutaClavePublica, String passwordKeyPair) throws Exception {
        generadorDeClaves.exportarClavePublica(rutaClavePublica, passwordKeyPair);
    }

    public void firmarArchivo(String rutaArchivo, String rutaFirma, String passwordKeyPair) throws Exception {
        KeyPair parDeClaves = generadorDeClaves.getClaves().get(passwordKeyPair);
        if (parDeClaves == null) {
            throw new Exception("No existe una clave privada guardada con el password especificado");
        } else {
            firmador.firmarArchivo(rutaArchivo, parDeClaves.getPrivate(), rutaFirma);
        }
    }

    public boolean validarFirma(String rutaArchivo, String rutaFirma, String rutaClavePublica) throws Exception {
        return verificador.validarFirma(rutaArchivo, rutaFirma, rutaClavePublica);
    }
}
