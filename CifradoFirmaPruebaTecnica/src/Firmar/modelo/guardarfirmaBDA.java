/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Firmar.modelo;

import java.util.Base64;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author andre
 */
public class guardarfirmaBDA {

    private Conectar conectar;
    private Connection con;

    public guardarfirmaBDA() {
        conectar = new Conectar();
    }

    public void guardarFirmaBDA(String ruta, byte[] firma) throws Exception {
        String cadenaDecodificada = new String(firma);
        insertardatos(ruta, cadenaDecodificada);
        System.out.println(cadenaDecodificada);
    }

    public void insertardatos(String ruta, String firmadecodificada) {
        PreparedStatement ps;
        String sql;
        int id = (int) (Math.random() * (75 - 25 + 1) + 25);
        try {
            con = conectar.getConexion();
            sql = "INSERT INTO firmaruta(id,rutafirma,firma) VALUES(?,?,?);";
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.setString(2, ruta);
            ps.setString(3, firmadecodificada);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "firma guardada en Base de datos");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error de conexión:" + e.getMessage());
        }
    }

}
