
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Queue;
import javax.swing.JOptionPane;
import modelo.Paciente;
import modelo.modeloAlvarado;
import modelo.modeloPerez;
import vista.frmAgregarPacientes;
import vista.frmListas;
import vista.frmListas;
import vista.frmPrincipal;

/**
 *
 * @author fabia
 *
/**
 *
 * @author umg
 */
public class pacientesController implements ActionListener{
    frmAgregarPacientes vistaPacientes;
    frmListas vistaListas;
    frmPrincipal vistaPrincipal;
    modeloAlvarado DrAlvaradoP;
    modeloPerez DrPerez;

    public pacientesController(frmAgregarPacientes vistaPacientes, frmListas vistaListas, frmPrincipal vistaPrincipal, modeloAlvarado DrAlvaradoP, modeloPerez DrPerez) {
        this.vistaPacientes = vistaPacientes;
        this.vistaListas = vistaListas;
        this.vistaPrincipal = vistaPrincipal;
        this.DrAlvaradoP = DrAlvaradoP;
        this.DrPerez = DrPerez;
        
        this.vistaPrincipal.btnAgregarPaciente.addActionListener(this);
        this.vistaPrincipal.btnListaPacientes.addActionListener(this);
        this.vistaPacientes.btnDrAlvarado.addActionListener(this);
        this.vistaPacientes.btnDrPerez.addActionListener(this);
        this.vistaListas.btnListaAlvarado.addActionListener(this);
        this.vistaListas.btnListaPerez.addActionListener(this);
        this.vistaListas.btnListaAlvarado.addActionListener(this);
        this.vistaListas.btnListaPerez.addActionListener(this);
        this.vistaListas.btnAntederPacienteDrPerez.addActionListener(this);
        this.vistaListas.btnListaAlvarado.addActionListener(this);
        this.vistaListas.btnAtenderPacienteAlvarado.addActionListener(this);
    
        
        
        this.vistaPrincipal.setVisible(true);
        this.vistaPrincipal.setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //este boton levanta la muestra pacientes
        if(e.getSource()==this.vistaPrincipal.btnAgregarPaciente){
            this.vistaPacientes.setVisible(true);
            this.vistaPacientes.setLocationRelativeTo(null);
        }
        
        if(e.getSource()==this.vistaPrincipal.btnListaPacientes){
            this.vistaListas.setVisible(true);
            this.vistaListas.setLocationRelativeTo(null);
        }
        
        if(e.getSource()==this.vistaPacientes.btnDrAlvarado){
            this.DrAlvaradoP.EncolarDrAlvarado(this.vistaPacientes.txtNombre.getText(),
                    this.vistaPacientes.txtApellido.getText());
            
            this.vistaPacientes.txtApellido.setText("");
            this.vistaPacientes.txtNombre.setText("");
        }
        
        if(e.getSource()==this.vistaPacientes.btnDrPerez){
            this.DrPerez.EncolarPerez(this.vistaPacientes.txtNombre.getText(),
                    this.vistaPacientes.txtApellido.getText());
            
            this.vistaPacientes.txtApellido.setText("");
            this.vistaPacientes.txtNombre.setText("");
        }
        
        if(e.getSource()==this.vistaListas.btnListaAlvarado){
            //mostrar los datos en el text area
            Queue <Paciente> ListaLocal = this.DrAlvaradoP.ListarPacientesDrAlvarado();
            
            String Cadena = "";
           for (Paciente MiListaPacientesAlvarado: ListaLocal){
               
               Cadena = Cadena + MiListaPacientesAlvarado.getApellido()+" "+MiListaPacientesAlvarado.getNombre()+"\n";
            this.vistaListas.txtLista.setText(Cadena);
           }
        }
        
        if(e.getSource()==this.vistaListas.btnListaPerez){ 
            Queue <Paciente> ListaLocal = this.DrPerez.ListarPacientesDrPerez();
            
            String Cadena = "";
           for (Paciente MiListaPacientesPerez: ListaLocal){
               
               Cadena = Cadena + MiListaPacientesPerez.getApellido()+" "+MiListaPacientesPerez.getNombre()+"\n";
            this.vistaListas.txtLista.setText(Cadena);
           }
        }
        
        if(e.getSource()==this.vistaListas.btnAtenderPacienteAlvarado){
            this.DrAlvaradoP.DesEncolarDrAlvarado();
            Queue <Paciente> ListaLocal = this.DrAlvaradoP.ListarPacientesDrAlvarado();
            
            String Cadena = "";
           for (Paciente MiListaPacientesAlvarado: ListaLocal){
               
               Cadena = Cadena + MiListaPacientesAlvarado.getApellido()+" "+MiListaPacientesAlvarado.getNombre()+"\n";
            this.vistaListas.txtLista.setText(Cadena);
           }
        }
        
        if(e.getSource()==this.vistaListas.btnAntederPacienteDrPerez){
            this.DrPerez.DesEncolarDrPerez();
            Queue <Paciente> ListaLocal = this.DrPerez.ListarPacientesDrPerez();
            String Cadena = "";
            if(ListaLocal==null){
                this.vistaListas.txtLista.setText("Todos los pacientes fueron atendidos");
            }
            else{
                for (Paciente MiListaPacientesPerez: ListaLocal){
                Cadena = Cadena + MiListaPacientesPerez.getApellido()+" "+MiListaPacientesPerez.getNombre()+"\n";
                this.vistaListas.txtLista.setText(Cadena);
                }
           }
        }
    }       
}
    

