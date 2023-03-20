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
public class modeloAlvarado {
    Queue<Paciente> ListaDrAlvarado = new LinkedList();  
  
    public void EncolarDrAlvarado(String nombre, String apellido){
        Paciente nuevoCliente = new Paciente(nombre,apellido);
        this.ListaDrAlvarado.add(nuevoCliente);
    }
    
    public Queue ListarPacientesDrAlvarado(){
        return this.ListaDrAlvarado;
        
    }
    
    public void DesEncolarDrAlvarado(){
        this.ListaDrAlvarado.poll();
        
    }
}



