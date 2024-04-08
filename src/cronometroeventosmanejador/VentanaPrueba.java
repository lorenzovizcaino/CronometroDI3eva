package cronometroeventosmanejador;

import java.awt.GridBagLayout;


import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class VentanaPrueba {

    public static void main(String[] args) {
        JFrame ventana = new JFrame("Cronometro ");
        JPanel J_Panel = new JPanel();
         
        J_Panel.setLayout(new GridBagLayout());  
        J_Panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        
       
        Cronometro miCrono;
        try {
            //ObjectInputStream flujoEntrada=new ObjectInputStream(new FileInputStream("Crono.obj"));
		    // miCrono=(Cronometro)flujoEntrada.readObject();
            miCrono=new Cronometro();  

            //Poner el cronometro a la escucha del manejador

            miCrono.addCronometroEventListener(new ManejadorCronometroEventListener());
            //Iniciar el cronometro utilizando el manejador. En este caso va al método
            //setter de la propiedad activo del cronometro y como vale true ejecuta su
            //método StartCronometro
            miCrono.setActivo(true);

            //Iniciar el cronometro sin el manejador
            //miCrono.startCronometro();      
            //Añadir el cronometro a la ventana
            
            J_Panel.add(miCrono);
            ventana.add(J_Panel);
           // flujoEntrada.close();
        } catch (Exception e) {
            // TODO: handle exception

            System.out.println("Este es mi primer error"+ e.getMessage());
        }
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// finaliza el programa cuando se da click en la X
        ventana.setSize(290, 150);// configurando tamaño de la ventana
        ventana.setVisible(true);// configurando visualización de la ventana
        

    }
}
