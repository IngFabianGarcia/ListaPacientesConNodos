/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.LinkedList;
import java.util.Queue;
import javax.swing.JOptionPane;

/**
 *
 * @author umg
 */
public class modeloPerez {
    Queue<Paciente> ListaDrPerez = new LinkedList();  
    public void EncolarPerez(String nombre, String apellido){
        Paciente nuevoCliente = new Paciente(nombre,apellido);
        this.ListaDrPerez.add(nuevoCliente);
    }
    
    public Queue ListarPacientesDrPerez(){
        return this.ListaDrPerez;
        
    }
    
    public void DesEncolarDrPerez(){
        this.ListaDrPerez.poll();
    }
}
