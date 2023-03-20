/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_pacientes_2_listas;

import controller.pacientesController;
import modelo.modeloAlvarado;
import modelo.modeloPerez;
import vista.frmAgregarPacientes;
import vista.frmListas;
import vista.frmPrincipal;

/**
 *
 * @author fabia
 */
public class Ejercicio_Pacientes_2_Listas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        frmPrincipal vistaPrincipal = new frmPrincipal();
        frmListas vistaListas = new  frmListas(vistaPrincipal, true);
        frmAgregarPacientes vistaPacientes = new frmAgregarPacientes(vistaPrincipal, true);
        modeloAlvarado DrAlvaradoP = new modeloAlvarado();
        modeloPerez DrPerez = new modeloPerez();
        
        
        
        
        pacientesController controladorPrograma = new pacientesController(vistaPacientes, vistaListas, vistaPrincipal, DrAlvaradoP, DrPerez);
        
    }
    
}
