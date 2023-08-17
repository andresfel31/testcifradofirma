/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Firmar;

import java.io.FileOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.PrivateKey;
import java.security.Signature;
import Firmar.modelo.guardarfirmaBDA;
/**
 *
 * @author andre
 */
public class firmador {

    public void firmarArchivo(String ruta, PrivateKey clavePrivada, String rutaFirma) throws Exception {
        //crear firma
        byte[] data = leerArchivo(ruta);
        Signature dsa = Signature.getInstance("SHA1withRSA");
        dsa.initSign(clavePrivada);
        dsa.update(data);
        byte[] firma = dsa.sign();
        //guardar firma
        guardarFirma(rutaFirma, firma);
         //guardar firma en base de datos
         guardarFirmaBD(ruta,firma);
    }

    public byte[] leerArchivo(String ruta) throws Exception {
        return Files.readAllBytes(Paths.get(ruta));
    }

    public void guardarFirma(String ruta, byte[] firma) throws Exception {
        FileOutputStream file = new FileOutputStream(ruta + ".txt");
        file.write(firma);
        file.close();
    }
    public void guardarFirmaBD(String ruta, byte[] firma)throws Exception{
        guardarfirmaBDA guardarfirmaBDA=new guardarfirmaBDA();   
        guardarfirmaBDA.guardarFirmaBDA(ruta,firma);
    }
}
