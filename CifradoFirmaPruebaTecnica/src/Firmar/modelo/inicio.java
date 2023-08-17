/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Firmar.modelo;

/**
 *
 * @author andre
 */
public class inicio {
    
        private Controler controlador;

    public inicio() {
      controlador = new Controler();
    }
        
     public Controler getControlador() {
        return controlador;
    }

    public void setControlador(Controler controlador) {
        this.controlador = controlador;
    }
}
