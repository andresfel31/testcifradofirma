/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Firmar.modelo;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author andre
 */
public class Conectar {

    public Connection getConexion(){
        Connection con = null;
        try{
        con=DriverManager.getConnection("jdbc:mysql://localhost:3307/testcifrado","root","Nicolas30#");    
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        return con;
    }
}
