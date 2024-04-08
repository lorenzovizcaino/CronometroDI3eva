package cronometro;

import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.io.FileInputStream;
import java.io.ObjectInputStream;


import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class VentanaPrueba {

    public static void main(String[] args) {
        JFrame ventana = new JFrame("Cronometro ");
        JPanel J_Panel = new JPanel();
         
        J_Panel.setLayout(new GridBagLayout());  
        J_Panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        
        //Colocar la etiqueta con las restricciones del gridBagLayout
        Cronometro miCrono;
        try {
          //Código utilizando si se accede al objeto cronometro a través del archivo crono.obj almacenado
          // ObjectInputStream flujoEntrada=new ObjectInputStream(new FileInputStream("crono.obj"));
    	  //miCrono= (Cronometro) flujoEntrada.readObject();
            miCrono=new Cronometro();
            System.out.println(miCrono.toString());

            miCrono.contar();
            J_Panel.add(miCrono);
            ventana.add(J_Panel);
          //  flujoEntrada.close();
        } catch (Exception e) {
            // TODO: handle exception

            System.out.println("ESet es mi primer error"+ e.getMessage());
        }
        
       
       


        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// finaliza el programa cuando se da click en la X
        ventana.setSize(290, 150);// configurando tamaño de la ventana
        ventana.setVisible(true);// configurando visualización de la ventana
        

    }
}
