/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Firmar.Generarclave;

import java.io.FileOutputStream;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;

/**
 *
 * @author andre
 */
public class GeneracionDeClaves {

    private HashMap<String, KeyPair> claves;
    private KeyPairGenerator generador;

    public GeneracionDeClaves() throws NoSuchAlgorithmException {
        claves = new HashMap<>(100);
        generador = KeyPairGenerator.getInstance("RSA");
        generador.initialize(1024);
    }

    public void generarclave(String pass) {
        claves.put(pass, generador.generateKeyPair());
    }

    public void exportarClavePublica(String rutaClavePublica, String passwordKeyPair) throws Exception{
        KeyPair parDeClaves = claves.get(passwordKeyPair);
        if (parDeClaves == null) {
            throw new Exception("No existe una clave publica guardada con el password especificado");
        } else {
            FileOutputStream file = new FileOutputStream(rutaClavePublica+".txt");
            file.write(parDeClaves.getPublic().getEncoded());
            file.close();
        }
    }

    public HashMap<String, KeyPair> getClaves() {
        return claves;
    }

    public void setClaves(HashMap<String, KeyPair> claves) {
        this.claves = claves;
    }

    public KeyPairGenerator getGenerador() {
        return generador;
    }

    public void setGenerador(KeyPairGenerator generador) {
        this.generador = generador;
    }
}
