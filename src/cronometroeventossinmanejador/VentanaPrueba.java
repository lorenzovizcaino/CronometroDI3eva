package cronometroeventossinmanejador;

import java.awt.GridBagLayout;


import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class VentanaPrueba {
    private Cronometro miCrono;
    private JFrame ventana ;

    public Cronometro getMiCrono() {
        return miCrono;
    }

    public void setMiCrono(Cronometro miCrono) {
        this.miCrono = miCrono;
    }

    public JFrame getVentana() {
        return ventana;
    }

    public void setVentana(JFrame ventana) {
        this.ventana = ventana;
    }

    public JPanel getJ_Panel() {
        return J_Panel;
    }

    public void setJ_Panel(JPanel j_Panel) {
        J_Panel = j_Panel;
    }

    private JPanel J_Panel;


    VentanaPrueba(){
        ventana = new JFrame("Cronometro ");
        J_Panel = new JPanel();
        J_Panel.setLayout(new GridBagLayout());
        J_Panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        try {
            //En el caso de que accedamos a través del archivo binario
            //ObjectInputStream flujoEntrada=new ObjectInputStream(new FileInputStream("Crono.obj"));
            // miCrono=(Cronometro)flujoEntrada.readObject();

            miCrono=new Cronometro();

            //Iniciar el cronometro utilizando la clase que define los sucesos de nuestro cronometro e implementando la interface
            miCrono.StartCronometro(new CronometroEventObject(this));

            //Añadir el cronometro a la ventana

            J_Panel.add(miCrono);
            ventana.add(J_Panel);
            // flujoEntrada.close();
        } catch (Exception e) {
            // TODO: handle exception

            System.out.println("Este es mi primer error"+ e.getMessage());
        }
    }




    public static void main(String[] args) {
       VentanaPrueba ventanaPrueba=new VentanaPrueba();




        ventanaPrueba.getVentana().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// finaliza el programa cuando se da click en la X
        ventanaPrueba.getVentana().setSize(290, 150);// configurando tamaño de la ventana
        ventanaPrueba.getVentana().setVisible(true);// configurando visualización de la ventana
        

    }


}
